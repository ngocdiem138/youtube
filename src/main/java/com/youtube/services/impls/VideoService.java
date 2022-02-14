package com.youtube.services.impls;

import com.youtube.daos.IVidInteractDAO;
import com.youtube.daos.IVideoDAO;
import com.youtube.entities.VidInteract;
import com.youtube.entities.Video;
import com.youtube.services.IVideoService;

import javax.inject.Inject;
import java.util.List;

public class VideoService implements IVideoService {

    @Inject
    private IVideoDAO videoDAO;

    @Inject
    private IVidInteractDAO vidInteractDAO;

    @Override
    public Video findOne(long id) {
        return videoDAO.findOne(id);
    }

    @Override
    public List<Video> findAll() {
        return videoDAO.findAll();
    }

    @Override
    public Long insert(Video video)
    {
        return videoDAO.insert(video);
    }

    @Override
    public boolean isLikedByUser(long videoId, long userId) {
        VidInteract vidInteract = vidInteractDAO.findOne(userId, videoId);
        return vidInteract != null && vidInteract.getIsLike();
    }

    @Override
    public boolean isDislikedByUser(long videoId, long userId) {
        VidInteract vidInteract = vidInteractDAO.findOne(userId, videoId);
        return vidInteract != null && !vidInteract.getIsLike();
    }

    @Override
    public boolean update(Video video) {
        return videoDAO.update(video);
    }

    @Override
    public List<Video> findAllByKey(String key) {
        String hqlQuery = "select v from Video v where "
                + "v.name like '%" + key + "%'" +
                " or v.user.name like '%" + key + "%'" +
                " or v.hashtag like '%" + key + "%'" +
                " or v.content like '%" + key + "%'";
        return videoDAO.querySelector(hqlQuery);
    }
}
