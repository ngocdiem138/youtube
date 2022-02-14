package com.youtube.services;

import com.youtube.entities.Subscribe;

public interface ISubscribeService {

    Long insert(Subscribe subscribe);

    boolean delete(Subscribe subscribe);

    Subscribe findOne(long userId, long userIdSub);

    boolean isSubscribed(long userId, long userIdSub);

}
