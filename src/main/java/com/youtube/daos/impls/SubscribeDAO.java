package com.youtube.daos.impls;

import com.youtube.daos.ISubscribeDAO;
import com.youtube.entities.Subscribe;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

public class SubscribeDAO extends AbstractDAO<Subscribe> implements ISubscribeDAO {

    private final String className = "Subscribe";

    @Override
    public List<Subscribe> findAll() {
        return super.findAll(className);
    }

    @Override
    public Long insert(Subscribe subscribe) {
        subscribe.setCreatedBy(subscribe.getUserIdSub());
        subscribe.setModifiedBy(subscribe.getUserIdSub());
        subscribe.setCreatedOn(Timestamp.from(Instant.now()));
        subscribe.setModifiedOn(Timestamp.from(Instant.now()));
        return super.insert(subscribe);
    }

    @Override
    public boolean update(Subscribe subscribe) {
        subscribe.setModifiedOn(Timestamp.from(Instant.now()));
        return super.update(subscribe);
    }

    @Override
    public boolean delete(Subscribe subscribe) {
        return super.delete(subscribe);
    }

    @Override
    public Subscribe findOne(Object... params) {
        return super.findOne(className, params);
    }
}
