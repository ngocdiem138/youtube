package com.youtube.services;

import com.youtube.entities.History;

import java.util.Collection;

public interface IHistoryService {

    Long insert(History history);

    Collection<History> findAllByUser(Long id);
}
