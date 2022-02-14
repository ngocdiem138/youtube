package com.youtube.services;

import com.youtube.entities.VidInteract;

public interface IVidInteractService {

    VidInteract findOne(Long userId, Long videoId);

    Long insert(VidInteract vidInteract);

    boolean delete(VidInteract vidInteract);

    boolean update(VidInteract vidInteract);
}
