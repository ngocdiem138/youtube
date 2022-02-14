package com.youtube.services.impls;

import com.youtube.daos.IVidInteractDAO;
import com.youtube.entities.VidInteract;
import com.youtube.services.IVidInteractService;

import javax.inject.Inject;

public class VidInteractService implements IVidInteractService {

    @Inject
    private IVidInteractDAO vidInteractDAO;

    @Override
    public VidInteract findOne(Long userId, Long videoId) {
        return vidInteractDAO.findOne(userId, videoId);
    }

    @Override
    public Long insert(VidInteract vidInteract) {
        return vidInteractDAO.insert(vidInteract);
    }

    @Override
    public boolean delete(VidInteract vidInteract) {
        return vidInteractDAO.delete(vidInteract);
    }

    @Override
    public boolean update(VidInteract vidInteract) {
        return vidInteractDAO.update(vidInteract);
    }
}
