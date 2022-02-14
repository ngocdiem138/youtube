package com.youtube.services;

import com.youtube.entities.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
}
