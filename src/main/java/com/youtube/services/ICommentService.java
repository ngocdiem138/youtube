package com.youtube.services;

import com.youtube.entities.Comment;

public interface ICommentService {

    Long insert(Comment comment);

    boolean update(Comment comment);

    boolean delete(Comment comment);

    Comment findOne(Long id);

    boolean isLikedByUser(long commentId, long userId);

    boolean isDislikedByUser(long commentId, long userId);
}
