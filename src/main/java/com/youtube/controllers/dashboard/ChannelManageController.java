package com.youtube.controllers.dashboard;

import com.youtube.entities.User;
import com.youtube.entities.Video;
import com.youtube.entities.Category;
import com.youtube.services.ICommonService;
import com.youtube.services.ISubscribeService;
import com.youtube.services.IUserService;
import com.youtube.services.IVideoService;
import com.youtube.services.ICategoryService;
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
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;

@WebServlet(urlPatterns = {"/channelManage", "/Add"})
public class ChannelManageController extends HttpServlet {
    private static final Long serialVersionUID = 1L;
    @Inject
    private IUserService userService;

    @Inject
    private ICategoryService categoryService;

    @Inject
    private IVideoService videoService;

    @Inject
    private ISubscribeService subscribeService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String forward = "";
        String action = req.getParameter("action");
        req.setAttribute("videoservice", videoService);
        req.setAttribute("userservice", userService);

       User user = (User) ApplicationUtil.getInstance().getValue(req,"user");

        req.setAttribute("userChannel", user);

        // Get videos
        req.setAttribute("videos", user.getVideos());
        System.out.println(user.getVideos());
        List<Category> categoryList=categoryService.findAll();
        req.setAttribute("categorys",categoryList);
        if(action!=null) {
            if (action.equalsIgnoreCase("delete")) {
//                Video video = videoService.findOne(Long.parseLong(id));
//                req.setAttribute("video", video);
            } else if (action.equalsIgnoreCase("Add")) {

                    String name = req.getParameter("name");
                    String hashtag = req.getParameter("hashtag");
                    String src = req.getParameter("src");
                    String avatarUrl = req.getParameter("avatarUrl");
                    String content = req.getParameter("content");
                    Long userid= user.getId();
                    Long categoryid=Long.valueOf(req.getParameter("categoryID"));
                    Video video = new Video(name, hashtag, src, avatarUrl, content,userid,categoryid);
                    videoService.insert(video);
            }
        }

        RequestDispatcher rd = req.getRequestDispatcher("views/dashboard/channelManage.jsp");
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
