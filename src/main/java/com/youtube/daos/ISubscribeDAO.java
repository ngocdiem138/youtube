package com.youtube.daos;

import com.youtube.entities.Subscribe;

import java.util.List;

public interface ISubscribeDAO extends GenericDAO<Subscribe> {

    List<Subscribe> findAll();

    @Override
    Long insert(Subscribe subscribe);

    @Override
    boolean update(Subscribe subscribe);

    @Override
    boolean delete(Subscribe subscribe);

    Subscribe findOne(Object... params);
}
