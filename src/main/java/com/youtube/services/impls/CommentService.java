package com.youtube.services.impls;

import com.youtube.daos.IComInteractDAO;
import com.youtube.daos.ICommentDAO;
import com.youtube.entities.ComInteract;
import com.youtube.entities.Comment;
import com.youtube.services.ICommentService;

import javax.inject.Inject;
import java.sql.Timestamp;
import java.time.Instant;

public class CommentService implements ICommentService {

    @Inject
    private ICommentDAO commentDAO;

    @Inject
    private IComInteractDAO comInteractDAO;

    @Override
    public Long insert(Comment comment) {
        comment.setTime(Timestamp.from(Instant.now()));
        return commentDAO.insert(comment);
    }

    @Override
    public boolean update(Comment comment) {
        return commentDAO.update(comment);
    }

    @Override
    public boolean delete(Comment comment) {
        return commentDAO.delete(comment);
    }

    @Override
    public Comment findOne(Long id) {
        return commentDAO.findOne(id);
    }

    @Override
    public boolean isLikedByUser(long commentId, long userId) {
        ComInteract comInteract = comInteractDAO.findOne(userId, commentId);
        return comInteract != null && comInteract.getIsLike();
    }

    @Override
    public boolean isDislikedByUser(long commentId, long userId) {
        ComInteract comInteract = comInteractDAO.findOne(userId, commentId);
        return comInteract != null && !comInteract.getIsLike();
    }
}
