package com.youtube.services;

import com.youtube.entities.ComInteract;

public interface IComInteractService {

    ComInteract findOne(Long userId, Long commentId);

    Long insert(ComInteract comInteract);

    boolean delete(ComInteract comInteract);

    boolean update(ComInteract comInteract);

}
