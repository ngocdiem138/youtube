package com.youtube.services;

import com.youtube.entities.User;

public interface IUserService {

    Long insert(User user);

    User findOne(Long id);

    boolean isExistEmail(String email);

    User findOneByEmail(String email);

    boolean update(User user);
}
