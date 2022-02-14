package com.youtube.daos.impls;

import com.youtube.daos.ICategoryDAO;
import com.youtube.entities.Category;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

public class CategoryDAO extends AbstractDAO<Category> implements ICategoryDAO {

    private final String className = "Category";

    @Override
    public List<Category> findAll() {
        return super.findAll(className);
    }

    @Override
    public Long insert(Category category) {
        category.setCreatedBy(Long.parseLong("0"));
        category.setModifiedBy(Long.parseLong("0"));
        category.setCreatedOn(Timestamp.from(Instant.now()));
        category.setModifiedOn(Timestamp.from(Instant.now()));
        return super.insert(category);
    }

    @Override
    public boolean update(Category category) {
        category.setModifiedOn(Timestamp.from(Instant.now()));
        return super.update(category);
    }

    @Override
    public boolean delete(Category category) {
        return super.delete(category);
    }

    @Override
    public Category findOne(Object... params) {
        return super.findOne(className, params);
    }
}
