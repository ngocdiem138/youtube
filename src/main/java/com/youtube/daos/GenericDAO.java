package com.youtube.daos;

import java.util.List;

public interface GenericDAO<Entity> {

    List<Entity> findAll(String className);

    Long insert(Entity entity);

    boolean update(Entity entity);

    boolean delete(Entity entity);

    Entity findOne(String className, Object... params);

    List<Entity> querySelector(String hqlQuery);
}
