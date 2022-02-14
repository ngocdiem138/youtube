package com.youtube.daos;

import com.youtube.entities.ComInteract;

import java.util.List;

public interface IComInteractDAO extends GenericDAO<ComInteract> {

    List<ComInteract> findAll();

    @Override
    Long insert(ComInteract comInteract);

    @Override
    boolean update(ComInteract comInteract);

    @Override
    boolean delete(ComInteract comInteract);

    ComInteract findOne(Object... params);
}
