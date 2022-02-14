package com.youtube.controllers.dashboard;

import com.youtube.entities.User;
import com.youtube.entities.Video;
import com.youtube.services.ICommonService;
import com.youtube.services.ISubscribeService;
import com.youtube.services.IUserService;
import com.youtube.services.IVideoService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/channel"})
public class ChannelController extends HttpServlet {

    private static final Long serialVersionUID = 1L;

    @Inject
    private IUserService userService;

    @Inject
    private ICommonService commonService;

    @Inject
    private IVideoService videoService;

    @Inject
    private ISubscribeService subscribeService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("cs", commonService);
        req.setAttribute("vService", videoService);
        req.setAttribute("userservice", userService);
        req.setAttribute("sService", subscribeService);

        String id = req.getParameter("id");

        User user = userService.findOne(Long.valueOf(id));
        req.setAttribute("userChannel", user);

        // Get videos
        req.setAttribute("videos", user.getVideos());

        RequestDispatcher rd = req.getRequestDispatcher("/views/dashboard/channel.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}