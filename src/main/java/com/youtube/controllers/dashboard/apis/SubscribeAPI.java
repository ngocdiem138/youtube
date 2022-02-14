package com.youtube.controllers.dashboard.apis;

import com.youtube.entities.Subscribe;
import com.youtube.entities.User;
import com.youtube.services.ISubscribeService;
import com.youtube.services.IUserService;
import com.youtube.utils.ApplicationUtil;
import com.youtube.utils.PrintWriterUtil;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/api-subscribe"})
public class SubscribeAPI extends HttpServlet {

    private static final Long serialVersionUID = 1L;

    @Inject
    private ISubscribeService subscribeService;

    @Inject
    private IUserService userService;

    @Inject
    private PrintWriterUtil printWriterUtil;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        printWriterUtil.getInstance(resp);
        try {
            User userCurrent = (User) ApplicationUtil.getInstance().getValue(req, "user");
            User user = userService.findOne(Long.parseLong(req.getParameter("userId")));
            Subscribe subscribe = new Subscribe(user.getId(), userCurrent.getId());
            if (subscribeService.insert(subscribe) == 0) {
                user.setSubscribe(user.getSubscribe() + 1);
                if (!userService.update(user)) {
                    subscribeService.delete(subscribe);
                    assert false;
                }
                printWriterUtil.printlnTrue();
            }
            assert false;
        } catch (Exception e) {
            printWriterUtil.printlnFalse();
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        printWriterUtil.getInstance(resp);
        try {
            User user = userService.findOne(Long.parseLong(req.getParameter("userId")));
            User userCurrent = (User) ApplicationUtil.getInstance().getValue(req, "user");
            user.setSubscribe(user.getSubscribe() - 1);
            if (userService.update(user)) {
                if (!subscribeService.delete(subscribeService.findOne(user.getId(), userCurrent.getId()))) {
                    user.setSubscribe(user.getSubscribe() + 1);
                    userService.update(user);
                    assert false;
                }
                printWriterUtil.printlnTrue();
            }
            assert false;
        } catch (Exception e) {
            printWriterUtil.printlnFalse();
        }
    }
}
