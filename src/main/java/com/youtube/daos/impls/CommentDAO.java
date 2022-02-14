package com.youtube.daos.impls;

import com.youtube.daos.ICommentDAO;
import com.youtube.entities.Comment;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

public class CommentDAO extends AbstractDAO<Comment> implements ICommentDAO {

    private final String className = "Comment";

    @Override
    public List<Comment> findAll() {
        return super.findAll(className);
    }

    @Override
    public Long insert(Comment comment) {
        comment.setCreatedBy(comment.getUserId());
        comment.setModifiedBy(comment.getUserId());
        comment.setCreatedOn(Timestamp.from(Instant.now()));
        comment.setModifiedOn(Timestamp.from(Instant.now()));
        return super.insert(comment);
    }

    @Override
    public boolean update(Comment comment) {
        comment.setModifiedOn(Timestamp.from(Instant.now()));
        return super.update(comment);
    }

    @Override
    public boolean delete(Comment comment) {
        return super.delete(comment);
    }

    @Override
    public Comment findOne(Object... params) {
        return super.findOne(className, params);
    }
}
