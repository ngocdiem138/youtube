package com.youtube.daos.impls;

import com.youtube.daos.IVidInteractDAO;
import com.youtube.entities.VidInteract;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

public class VidInteractDAO extends AbstractDAO<VidInteract> implements IVidInteractDAO {

    private final String className = "VidInteract";

    @Override
    public List<VidInteract> findAll() {
        return super.findAll(className);
    }

    @Override
    public Long insert(VidInteract vidInteract) {
        vidInteract.setCreatedBy(vidInteract.getUserId());
        vidInteract.setModifiedBy(vidInteract.getUserId());
        vidInteract.setCreatedOn(Timestamp.from(Instant.now()));
        vidInteract.setModifiedOn(Timestamp.from(Instant.now()));
        return super.insert(vidInteract);
    }

    @Override
    public boolean update(VidInteract vidInteract) {
        vidInteract.setModifiedOn(Timestamp.from(Instant.now()));
        return super.update(vidInteract);
    }

    @Override
    public boolean delete(VidInteract vidInteract) {
        return super.delete(vidInteract);
    }

    @Override
    public VidInteract findOne(Object... params) {
        return super.findOne(className, params);
    }
}
