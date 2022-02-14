package com.youtube.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ComInteractPK implements Serializable {
    private long userId;
    private long commentId;

    @Column(name = "user_id")
    @Id
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "comment_id")
    @Id
    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComInteractPK that = (ComInteractPK) o;

        if (userId != that.userId) return false;
        return commentId == that.commentId;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (commentId ^ (commentId >>> 32));
        return result;
    }
}
