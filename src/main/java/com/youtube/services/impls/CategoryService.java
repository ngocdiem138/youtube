package com.youtube.services.impls;

import com.youtube.daos.ICategoryDAO;
import com.youtube.entities.Category;
import com.youtube.services.ICategoryService;

import javax.inject.Inject;
import java.util.List;

public class CategoryService implements ICategoryService {

    @Inject
    private ICategoryDAO categoryDAO;

    @Override
    public List<Category> findAll() {
        return categoryDAO.findAll();
    }

}
