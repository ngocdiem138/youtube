package com.youtube.controllers.dashboard;

import com.youtube.entities.Comment;
import com.youtube.entities.History;
import com.youtube.entities.User;
import com.youtube.entities.Video;
import com.youtube.services.*;
import com.youtube.utils.ApplicationUtil;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.*;

import static java.lang.Long.*;

@WebServlet(urlPatterns = {"/watch"})
public class WatchController extends HttpServlet {

    private static final Long serialVersionUID = 1L;

    @Inject
    private ICommonService commonService;

    @Inject
    private ISubscribeService subscribeService;

    @Inject
    private IVideoService videoService;

    @Inject
    private IHistoryService historyService;

    @Inject
    private ICommentService commentService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("cs", commonService);
        req.setAttribute("sService", subscribeService);
        req.setAttribute("vService", videoService);
        req.setAttribute("cService", commentService);

        // get video
        String id = req.getParameter("v");
        req.setAttribute("video", videoService.findOne(parseLong(id)));

        // Get comments
        List<Comment> comments = new ArrayList<>(videoService.findOne(Long.parseLong(id)).getComments());
        Collections.reverse(comments);
        req.setAttribute("comments", comments);

        // Get videos
        List<Video> videos = videoService.findAll();
        Collections.shuffle(videos);
        req.setAttribute("videos", videos);

        // Add history
        User userCurrent = (User) ApplicationUtil.getInstance().getValue(req, "user");
        if (userCurrent != null) {
            historyService.insert(new History(Timestamp.from(Instant.now()), userCurrent.getId(), parseLong(id)));
        }

        RequestDispatcher rd = req.getRequestDispatcher("/views/dashboard/watch.jsp");
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
