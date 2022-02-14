package com.youtube.daos.impls;

import com.youtube.daos.IComInteractDAO;
import com.youtube.entities.ComInteract;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

public class ComInteractDAO extends AbstractDAO<ComInteract> implements IComInteractDAO {

    private final String className = "ComInteract";

    @Override
    public List<ComInteract> findAll() {
        return super.findAll(className);
    }

    @Override
    public Long insert(ComInteract comInteract) {
        comInteract.setCreatedBy(comInteract.getUserId());
        comInteract.setModifiedBy(comInteract.getUserId());
        comInteract.setCreatedOn(Timestamp.from(Instant.now()));
        comInteract.setModifiedOn(Timestamp.from(Instant.now()));
        return super.insert(comInteract);
    }

    @Override
    public boolean update(ComInteract comInteract) {
        comInteract.setModifiedOn(Timestamp.from(Instant.now()));
        return super.update(comInteract);
    }

    @Override
    public boolean delete(ComInteract comInteract) {
        return super.delete(comInteract);
    }

    @Override
    public ComInteract findOne(Object... params) {
        return super.findOne(className, params);
    }
}
