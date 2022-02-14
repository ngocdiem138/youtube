package com.youtube.controllers.dashboard.apis;

import com.youtube.entities.ComInteract;
import com.youtube.entities.Comment;
import com.youtube.entities.User;
import com.youtube.services.IComInteractService;
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

@WebServlet(urlPatterns = {"/api-com-interact"})
public class ComInteractAPI extends HttpServlet {

    private static final Long serialVersionUID = 1L;

    @Inject
    private IComInteractService comInteractService;

    @Inject
    private ICommentService commentService;

    @Inject
    private PrintWriterUtil printWriterUtil;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        printWriterUtil.getInstance(resp);
        try {
            ComInteract comInteract = HttpUtil.of(req.getReader()).toModel(ComInteract.class);
            User userCurrent = (User) ApplicationUtil.getInstance().getValue(req, "user");
            comInteract.setUserId(userCurrent.getId());
            if (comInteractService.insert(comInteract) == 0) {
                Comment comment = commentService.findOne(comInteract.getCommentId());
                if (comInteract.getIsLike()) {
                    comment.setLikes(comment.getLikes() + 1);
                } else {
                    comment.setDislikes(comment.getDislikes() + 1);
                }
                if (!commentService.update(comment)) {
                    comInteractService.delete(comInteract);
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
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        printWriterUtil.getInstance(resp);
        try {
            ComInteract comInteractFromJson = HttpUtil.of(req.getReader()).toModel(ComInteract.class);
            User userCurrent = (User) ApplicationUtil.getInstance().getValue(req, "user");
            ComInteract comInteract = comInteractService.findOne(userCurrent.getId(), comInteractFromJson.getCommentId());

            // throw if comInteract is sample
            assert comInteract.getIsLike() == comInteractFromJson.getIsLike();

            comInteract.setIsLike(comInteractFromJson.getIsLike());
            if (comInteractService.update(comInteract)) {
                Comment comment = commentService.findOne(comInteract.getCommentId());
                if (comInteract.getIsLike()) {
                    comment.setLikes(comment.getLikes() + 1);
                    comment.setDislikes(comment.getDislikes() - 1);
                } else {
                    comment.setLikes(comment.getLikes() - 1);
                    comment.setDislikes(comment.getDislikes() + 1);
                }
                if (!commentService.update(comment)) {
                    comInteract.setIsLike(!comInteractFromJson.getIsLike());
                    comInteractService.update(comInteract);
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
            Long id = Long.parseLong(req.getParameter("id"));
            User userCurrent = (User) ApplicationUtil.getInstance().getValue(req, "user");
            ComInteract comInteract = comInteractService.findOne(userCurrent.getId(), id);
            Comment comment = commentService.findOne(comInteract.getCommentId());
            if (comInteract.getIsLike()) {
                comment.setLikes(comment.getLikes() - 1);
            } else {
                comment.setDislikes(comment.getDislikes() - 1);
            }
            if (commentService.update(comment)) {
                if (!comInteractService.delete(comInteract)) {
                    if (comInteract.getIsLike()) {
                        comment.setLikes(comment.getLikes() + 1);
                    } else {
                        comment.setDislikes(comment.getDislikes() + 1);
                    }
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
