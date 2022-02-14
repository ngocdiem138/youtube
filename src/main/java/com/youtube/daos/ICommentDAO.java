package com.youtube.daos;

import com.youtube.entities.Comment;

import java.util.List;

public interface ICommentDAO extends GenericDAO<Comment> {

    List<Comment> findAll();

    @Override
    Long insert(Comment comment);

    @Override
    boolean update(Comment comment);

    @Override
    boolean delete(Comment comment);

    Comment findOne(Object... params);
}
