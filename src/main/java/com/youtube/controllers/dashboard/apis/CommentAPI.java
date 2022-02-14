package com.youtube.controllers.dashboard.apis;

import com.youtube.entities.Comment;
import com.youtube.entities.User;
import com.youtube.services.ICommentService;
import com.youtube.utils.ApplicationUtil;
import com.youtube.utils.HttpUtil;
import com.youtube.utils.PrintWriterUtil;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/api-comment"})
public class CommentAPI extends HttpServlet {

    private static final Long serialVersionUID = 1L;

    @Inject
    private ICommentService commentService;

    @Inject
    private PrintWriterUtil printWriterUtil;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        printWriterUtil.getInstance(resp);
        try {
            Comment comment = HttpUtil.of(req.getReader()).toModel(Comment.class);
            User userCurrent = (User) ApplicationUtil.getInstance().getValue(req, "user");
            comment.setUserId(userCurrent.getId());
            printWriterUtil.println(commentService.insert(comment));
        } catch (Exception e) {
            printWriterUtil.printlnFalse();
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        printWriterUtil.getInstance(resp);
        try {
            Comment comment = commentService.findOne(Long.valueOf(req.getParameter("id")));
            User userCurrent = (User) ApplicationUtil.getInstance().getValue(req, "user");
            if (comment.getUserId() == userCurrent.getId()) {
                assert commentService.delete(comment);
                printWriterUtil.printlnTrue();
            }
            assert false;
        } catch (Exception e) {
            printWriterUtil.printlnFalse();
        }
    }
}
