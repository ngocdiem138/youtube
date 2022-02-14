package com.youtube.daos;

import com.youtube.entities.VidInteract;

import java.util.List;

public interface IVidInteractDAO extends GenericDAO<VidInteract> {

    List<VidInteract> findAll();

    @Override
    Long insert(VidInteract vidInteract);

    @Override
    boolean update(VidInteract vidInteract);

    @Override
    boolean delete(VidInteract vidInteract);

    VidInteract findOne(Object... params);
}
