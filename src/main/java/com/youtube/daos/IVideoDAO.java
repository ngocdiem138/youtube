package com.youtube.daos;

import com.youtube.entities.Video;

import java.util.List;

public interface IVideoDAO extends GenericDAO<Video> {

    List<Video> findAll();

    @Override
    Long insert(Video video);

    @Override
    boolean update(Video video);

    @Override
    boolean delete(Video video);

    Video findOne(Object... params);
}
