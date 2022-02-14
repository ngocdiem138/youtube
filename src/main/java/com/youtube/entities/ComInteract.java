package com.youtube.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "com_interact", schema = "youtube")
@IdClass(ComInteractPK.class)
public class ComInteract {

    private boolean isLike;

    private long userId;
    private long commentId;

    private Timestamp createdOn;
    private Long createdBy;
    private Timestamp modifiedOn;
    private Long modifiedBy;

    private User user;
    private Comment comment;

    public ComInteract() {

    }

    public ComInteract(boolean isLike, long userId, long commentId) {
        this.isLike = isLike;
        this.userId = userId;
        this.commentId = commentId;
    }

    public ComInteract(boolean isLike) {
        this.isLike = isLike;
    }

    public ComInteract(boolean isLike, long userId, long commentId, Timestamp modifiedOn, Long modifiedBy) {
        this.isLike = isLike;
        this.userId = userId;
        this.commentId = commentId;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
    }

    public ComInteract(boolean isLike, long userId, long commentId, Timestamp createdOn, Long createdBy, Timestamp modifiedOn, Long modifiedBy) {
        this.isLike = isLike;
        this.userId = userId;
        this.commentId = commentId;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
    }

    @Basic
    @Column(name = "isLike", nullable = false)
    public boolean getIsLike() {
        return isLike;
    }

    public void setIsLike(boolean isLike) {
        this.isLike = isLike;
    }

    @Id
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "comment_id", nullable = false)
    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "created_on")
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Basic
    @Column(name = "created_by")
    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "modified_on")
    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    @Basic
    @Column(name = "modified_by")
    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComInteract that = (ComInteract) o;

        if (isLike != that.isLike) return false;
        if (userId != that.userId) return false;
        if (commentId != that.commentId) return false;
        if (!Objects.equals(createdOn, that.createdOn)) return false;
        if (!Objects.equals(createdBy, that.createdBy)) return false;
        if (!Objects.equals(modifiedOn, that.modifiedOn)) return false;
        return Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        int result = isLike ? 1 : 0;
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (commentId ^ (commentId >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (modifiedOn != null ? modifiedOn.hashCode() : 0);
        result = 31 * result + (modifiedBy != null ? modifiedBy.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "comment_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
