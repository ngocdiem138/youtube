package com.youtube.services.impls;

import com.youtube.daos.ISubscribeDAO;
import com.youtube.entities.Subscribe;
import com.youtube.services.ISubscribeService;

import javax.inject.Inject;

public class SubscribeService implements ISubscribeService {

    @Inject
    private ISubscribeDAO subscribeDAO;

    @Override
    public Long insert(Subscribe subscribe) {
        return subscribeDAO.insert(subscribe);
    }

    @Override
    public boolean delete(Subscribe subscribe) {
        return subscribeDAO.delete(subscribe);
    }

    @Override
    public Subscribe findOne(long userId, long userIdSub) {
        return subscribeDAO.findOne(userId, userIdSub);
    }

    @Override
    public boolean isSubscribed(long userId, long userIdSub) {
        return subscribeDAO.findOne(userId, userIdSub) != null;
    }
}
