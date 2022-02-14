package com.youtube.daos.impls;

import com.youtube.daos.IVideoDAO;
import com.youtube.entities.Video;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

public class VideoDAO extends AbstractDAO<Video> implements IVideoDAO {

    private final String className = "Video";

    @Override
    public List<Video> findAll() {
        return super.findAll(className);
    }

    @Override
    public Long insert(Video video) {
        video.setCreatedBy(Long.parseLong("0"));
        video.setModifiedBy(Long.parseLong("0"));
        video.setCreatedOn(Timestamp.from(Instant.now()));
        video.setModifiedOn(Timestamp.from(Instant.now()));
        video.setPostingTime(Timestamp.from(Instant.now()));
        return super.insert(video);
    }

    @Override
    public boolean update(Video video) {
        video.setModifiedOn(Timestamp.from(Instant.now()));
        return super.update(video);
    }

    @Override
    public boolean delete(Video video) {
        return super.delete(video);
    }

    @Override
    public Video findOne(Object... params) {
        return super.findOne(className, params);
    }

    @Override
    public List<Video> querySelector(String sqlQuery) {
        return super.querySelector(sqlQuery);
    }
}
