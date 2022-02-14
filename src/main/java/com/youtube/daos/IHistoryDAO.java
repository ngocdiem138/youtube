package com.youtube.daos;

import com.youtube.entities.History;

import java.util.List;

public interface IHistoryDAO extends GenericDAO<History> {

    List<History> findAll();

    @Override
    Long insert(History history);

    @Override
    boolean update(History history);

    @Override
    boolean delete(History history);

    History findOne(Object... params);
}
