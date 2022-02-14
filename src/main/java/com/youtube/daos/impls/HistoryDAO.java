package com.youtube.daos.impls;

import com.youtube.daos.IHistoryDAO;
import com.youtube.entities.History;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

public class HistoryDAO extends AbstractDAO<History> implements IHistoryDAO {

    private final String className = "History";

    @Override
    public List<History> findAll() {
        return super.findAll(className);
    }

    @Override
    public Long insert(History history) {
        history.setCreatedBy(history.getUserId());
        history.setModifiedBy(history.getUserId());
        history.setCreatedOn(Timestamp.from(Instant.now()));
        history.setModifiedOn(Timestamp.from(Instant.now()));
        return super.insert(history);
    }

    @Override
    public boolean update(History history) {
        history.setModifiedOn(Timestamp.from(Instant.now()));
        return super.update(history);
    }

    @Override
    public boolean delete(History history) {
        return super.delete(history);
    }

    @Override
    public History findOne(Object... params) {
        return super.findOne(className, params);
    }
}
