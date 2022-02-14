package com.youtube.daos;

import com.youtube.entities.Category;

import java.util.List;

public interface ICategoryDAO extends GenericDAO<Category> {

    List<Category> findAll();

    @Override
    Long insert(Category category);

    @Override
    boolean update(Category category);

    @Override
    boolean delete(Category category);

    Category findOne(Object... params);
}
