package com.youtube.entities;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "comment", schema = "youtube")
public class Comment {

    private long id;
    private String content;
    private long likes;
    private long dislikes;
    private Timestamp time;

    private long userId;
    private long videoId;

    private Timestamp createdOn;
    private Long createdBy;
    private Timestamp modifiedOn;
    private Long modifiedBy;

    private Collection<ComInteract> comInteracts;

    private User user;
    private Video video;

    public Comment() {

    }

    public Comment(long id, String content, long likes, long dislikes, Timestamp time, long userId, long videoId) {
        this.id = id;
        this.content = content;
        this.likes = likes;
        this.dislikes = dislikes;
        this.time = time;
        this.userId = userId;
        this.videoId = videoId;
    }

    public Comment(String content, long likes, long dislikes, Timestamp time, long userId, long videoId) {
        this.content = content;
        this.likes = likes;
        this.dislikes = dislikes;
        this.time = time;
        this.userId = userId;
        this.videoId = videoId;
    }

    public Comment(long id, String content, long likes, long dislikes, Timestamp time, long userId, long videoId, Timestamp createdOn, Long createdBy, Timestamp modifiedOn, Long modifiedBy) {
        this.id = id;
        this.content = content;
        this.likes = likes;
        this.dislikes = dislikes;
        this.time = time;
        this.userId = userId;
        this.videoId = videoId;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
    }

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "content", nullable = false, length = 4096)
    @Nationalized
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "likes", nullable = false)
    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    @Basic
    @Column(name = "dislikes", nullable = false)
    public long getDislikes() {
        return dislikes;
    }

    public void setDislikes(long dislikes) {
        this.dislikes = dislikes;
    }

    @Basic
    @Column(name = "time", nullable = false)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "video_id", nullable = false)
    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
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

        Comment comment = (Comment) o;

        if (id != comment.id) return false;
        if (likes != comment.likes) return false;
        if (dislikes != comment.dislikes) return false;
        if (userId != comment.userId) return false;
        if (videoId != comment.videoId) return false;
        if (!Objects.equals(content, comment.content)) return false;
        if (!Objects.equals(time, comment.time)) return false;
        if (!Objects.equals(createdOn, comment.createdOn)) return false;
        if (!Objects.equals(createdBy, comment.createdBy)) return false;
        if (!Objects.equals(modifiedOn, comment.modifiedOn)) return false;
        return Objects.equals(modifiedBy, comment.modifiedBy);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (int) (likes ^ (likes >>> 32));
        result = 31 * result + (int) (dislikes ^ (dislikes >>> 32));
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (videoId ^ (videoId >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (modifiedOn != null ? modifiedOn.hashCode() : 0);
        result = 31 * result + (modifiedBy != null ? modifiedBy.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "comment")
    @Cascade(value = {org.hibernate.annotations.CascadeType.ALL})
    public Collection<ComInteract> getComInteracts() {
        return comInteracts;
    }

    public void setComInteracts(Collection<ComInteract> comInteracts) {
        this.comInteracts = comInteracts;
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
    @JoinColumn(name = "video_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
