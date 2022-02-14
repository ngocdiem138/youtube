package com.youtube.controllers.login;

import com.youtube.entities.User;
import com.youtube.services.IUserService;
import com.youtube.utils.ApplicationUtil;
import com.youtube.utils.GoogleUtil;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login-google"})
public class LoginController extends HttpServlet {

    private static final Long serialVersionUID = 1L;

    @Inject
    IUserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("action") == null) {
            String code = req.getParameter("code");

            if (code == null || code.isEmpty()) {
                RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
                rd.forward(req, resp);
            } else {
                String access_token = GoogleUtil.getToken(code);
                User user = GoogleUtil.getUserInfo(access_token);
                Long id;
                if (userService.isExistEmail(user.getEmail())) {
                    User userInDataBase = userService.findOneByEmail(user.getEmail());
                    id = userInDataBase.getId();
                    userInDataBase.setAvatarUrl(user.getAvatarUrl());
                    userService.update(userInDataBase);
                } else {
                    id = userService.insert(user);
                }
                ApplicationUtil.getInstance().putValue(req, "user", userService.findOne(id));
                RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
                rd.forward(req, resp);
            }
        } else {
            doDelete(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        ApplicationUtil.getInstance().removeValue(req, "user");
        RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
        rd.forward(req, resp);
    }
}
