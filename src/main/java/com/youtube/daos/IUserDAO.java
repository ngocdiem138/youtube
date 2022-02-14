package com.youtube.daos;

import com.youtube.entities.User;

import java.util.List;

public interface IUserDAO extends GenericDAO<User> {

    List<User> findAll();

    @Override
    Long insert(User user);

    @Override
    boolean update(User user);

    @Override
    boolean delete(User user);

    User findOne(Object... params);

}
