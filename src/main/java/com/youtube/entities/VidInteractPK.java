package com.youtube.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class VidInteractPK implements Serializable {
    private long userId;
    private long videoId;

    @Column(name = "user_id", nullable = false)
    @Id
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "video_id", nullable = false)
    @Id
    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VidInteractPK that = (VidInteractPK) o;

        if (userId != that.userId) return false;
        return videoId == that.videoId;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (videoId ^ (videoId >>> 32));
        return result;
    }
}
