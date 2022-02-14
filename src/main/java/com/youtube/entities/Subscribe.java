package com.youtube.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "subscribe", schema = "youtube")
@IdClass(SubscribePK.class)
public class Subscribe {

    private long userId;
    private long userIdSub;

    private Timestamp createdOn;
    private Long createdBy;
    private Timestamp modifiedOn;
    private Long modifiedBy;

    private User user;
    private User userSub;

    public Subscribe() {

    }

    public Subscribe(long userId, long userIdSub) {
        this.userId = userId;
        this.userIdSub = userIdSub;
    }

    public Subscribe(long userId, long userIdSub, Timestamp modifiedOn, Long modifiedBy) {
        this.userId = userId;
        this.userIdSub = userIdSub;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
    }

    public Subscribe(long userId, long userIdSub, Timestamp createdOn, Long createdBy, Timestamp modifiedOn, Long modifiedBy) {
        this.userId = userId;
        this.userIdSub = userIdSub;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
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
    @Column(name = "user_id_sub", nullable = false)
    public long getUserIdSub() {
        return userIdSub;
    }

    public void setUserIdSub(long userIdSub) {
        this.userIdSub = userIdSub;
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

        Subscribe subscribe = (Subscribe) o;

        if (userId != subscribe.userId) return false;
        if (userIdSub != subscribe.userIdSub) return false;
        if (!Objects.equals(createdOn, subscribe.createdOn)) return false;
        if (!Objects.equals(createdBy, subscribe.createdBy)) return false;
        if (!Objects.equals(modifiedOn, subscribe.modifiedOn)) return false;
        return Objects.equals(modifiedBy, subscribe.modifiedBy);
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (userIdSub ^ (userIdSub >>> 32));
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
    @JoinColumn(name = "user_id_sub", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public User getUserSub() {
        return userSub;
    }

    public void setUserSub(User userSub) {
        this.userSub = userSub;
    }
}
