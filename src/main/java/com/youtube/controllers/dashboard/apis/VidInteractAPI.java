package com.youtube.controllers.dashboard.apis;

import com.youtube.entities.User;
import com.youtube.entities.VidInteract;
import com.youtube.entities.Video;
import com.youtube.services.IVidInteractService;
import com.youtube.services.IVideoService;
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

@WebServlet(urlPatterns = {"/api-vid-interact"})
public class VidInteractAPI extends HttpServlet {

    private static final Long serialVersionUID = 1L;

    @Inject
    private IVidInteractService vidInteractService;

    @Inject
    private PrintWriterUtil printWriterUtil;

    @Inject
    private IVideoService videoService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        printWriterUtil.getInstance(resp);
        try {
            VidInteract vidInteract = HttpUtil.of(req.getReader()).toModel(VidInteract.class);
            User userCurrent = (User) ApplicationUtil.getInstance().getValue(req, "user");
            vidInteract.setUserId(userCurrent.getId());
            if (vidInteractService.insert(vidInteract) == 0) {
                Video video = videoService.findOne(vidInteract.getVideoId());
                if (vidInteract.getIsLike()) {
                    video.setLikes(video.getLikes() + 1);
                } else {
                    video.setDislikes(video.getDislikes() + 1);
                }
                if (!videoService.update(video)) {
                    vidInteractService.delete(vidInteract);
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
            VidInteract vidInteractFromJson = HttpUtil.of(req.getReader()).toModel(VidInteract.class);
            User userCurrent = (User) ApplicationUtil.getInstance().getValue(req, "user");
            VidInteract vidInteract = vidInteractService.findOne(userCurrent.getId(), vidInteractFromJson.getVideoId());

            // throw if vidInteract is sample
            assert vidInteract.getIsLike() == vidInteractFromJson.getIsLike();

            vidInteract.setIsLike(vidInteractFromJson.getIsLike());
            if (vidInteractService.update(vidInteract)) {
                Video video = videoService.findOne(vidInteract.getVideoId());
                if (vidInteract.getIsLike()) {
                    video.setLikes(video.getLikes() + 1);
                    video.setDislikes(video.getDislikes() - 1);
                } else {
                    video.setLikes(video.getLikes() - 1);
                    video.setDislikes(video.getDislikes() + 1);
                }
                if (!videoService.update(video)) {
                    vidInteract.setIsLike(!vidInteractFromJson.getIsLike());
                    vidInteractService.update(vidInteract);
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
            VidInteract vidInteract = vidInteractService.findOne(userCurrent.getId(), id);
            Video video = videoService.findOne(vidInteract.getVideoId());
            if (vidInteract.getIsLike()) {
                video.setLikes(video.getLikes() - 1);
            } else {
                video.setDislikes(video.getDislikes() - 1);
            }
            if (videoService.update(video)) {
                if (!vidInteractService.delete(vidInteract)) {
                    if (vidInteract.getIsLike()) {
                        video.setLikes(video.getLikes() + 1);
                    } else {
                        video.setDislikes(video.getDislikes() + 1);
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
