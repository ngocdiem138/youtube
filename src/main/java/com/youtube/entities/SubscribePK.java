package com.youtube.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SubscribePK implements Serializable {
    private long userId;
    private long userIdSub;

    @Column(name = "user_id", nullable = false)
    @Id
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "user_id_sub", nullable = false)
    @Id
    public long getUserIdSub() {
        return userIdSub;
    }

    public void setUserIdSub(long userIdSub) {
        this.userIdSub = userIdSub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubscribePK that = (SubscribePK) o;

        if (userId != that.userId) return false;
        return userIdSub == that.userIdSub;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (userIdSub ^ (userIdSub >>> 32));
        return result;
    }
}
