package com.youtube.entities;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "video", schema = "youtube")
public class Video {

    private long id;
    private String name;
    private String src;
    private long views;
    private Timestamp postingTime;
    private String hashtag;
    private String content;
    private long likes;
    private long dislikes;
    private String avatarUrl;

    private long userId;
    private long categoryId;

    private Timestamp createdOn;
    private Long createdBy;
    private Timestamp modifiedOn;
    private Long modifiedBy;

    private Collection<Comment> comments;
    private Collection<History> histories;
    private Collection<VidInteract> vidInteracts;

    private User user;
    private Category category;

    public Video() {

    }
    public Video(String name,  String hashtag, String src,String avatarUrl, String content, long userId,long categoryId) {
        this.name = name;
        this.src = src;
        this.hashtag = hashtag;
        this.content = content;
        this.avatarUrl = avatarUrl;
        this.userId = userId;
        this.categoryId=categoryId;
    }

    public Video(long id, String name, String src, long views, Timestamp postingTime, String hashtag, String content, long likes, long dislikes, String avatarUrl, long userId, long categoryId) {
        this.id = id;
        this.name = name;
        this.src = src;
        this.views = views;
        this.postingTime = postingTime;
        this.hashtag = hashtag;
        this.content = content;
        this.likes = likes;
        this.dislikes = dislikes;
        this.avatarUrl = avatarUrl;
        this.userId = userId;
        this.categoryId = categoryId;
    }

    public Video(String name, String src, long views, Timestamp postingTime, String hashtag, String content, long likes, long dislikes, String avatarUrl, long userId, long categoryId, Timestamp modifiedOn, Long modifiedBy) {
        this.name = name;
        this.src = src;
        this.views = views;
        this.postingTime = postingTime;
        this.hashtag = hashtag;
        this.content = content;
        this.likes = likes;
        this.dislikes = dislikes;
        this.avatarUrl = avatarUrl;
        this.userId = userId;
        this.categoryId = categoryId;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
    }

    public Video(String name, String src, long views, Timestamp postingTime, String hashtag, String content, long likes, long dislikes, String avatarUrl, long userId, long categoryId, Timestamp createdOn, Long createdBy, Timestamp modifiedOn, Long modifiedBy) {
        this.name = name;
        this.src = src;
        this.views = views;
        this.postingTime = postingTime;
        this.hashtag = hashtag;
        this.content = content;
        this.likes = likes;
        this.dislikes = dislikes;
        this.avatarUrl = avatarUrl;
        this.userId = userId;
        this.categoryId = categoryId;
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
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "src", nullable = false, length = 4096)
    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Basic
    @Column(name = "views", nullable = false)
    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    @Basic
    @Column(name = "postingTime", nullable = false)
    public Timestamp getPostingTime() {
        return postingTime;
    }

    public void setPostingTime(Timestamp postingTime) {
        this.postingTime = postingTime;
    }

    @Basic
    @Column(name = "hashtag")
    @Nationalized
    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    @Basic
    @Column(name = "content", length = 8192)
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
    @Column(name = "avatarUrl")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
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
    @Column(name = "category_id", nullable = false)
    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
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

        Video video = (Video) o;

        if (id != video.id) return false;
        if (views != video.views) return false;
        if (likes != video.likes) return false;
        if (dislikes != video.dislikes) return false;
        if (userId != video.userId) return false;
        if (categoryId != video.categoryId) return false;
        if (!Objects.equals(name, video.name)) return false;
        if (!Objects.equals(src, video.src)) return false;
        if (!Objects.equals(postingTime, video.postingTime)) return false;
        if (!Objects.equals(hashtag, video.hashtag)) return false;
        if (!Objects.equals(content, video.content)) return false;
        if (!Objects.equals(avatarUrl, video.avatarUrl)) return false;
        if (!Objects.equals(createdOn, video.createdOn)) return false;
        if (!Objects.equals(createdBy, video.createdBy)) return false;
        if (!Objects.equals(modifiedOn, video.modifiedOn)) return false;
        return Objects.equals(modifiedBy, video.modifiedBy);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (src != null ? src.hashCode() : 0);
        result = 31 * result + (int) (views ^ (views >>> 32));
        result = 31 * result + (postingTime != null ? postingTime.hashCode() : 0);
        result = 31 * result + (hashtag != null ? hashtag.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (int) (likes ^ (likes >>> 32));
        result = 31 * result + (int) (dislikes ^ (dislikes >>> 32));
        result = 31 * result + (avatarUrl != null ? avatarUrl.hashCode() : 0);
        temp = Double.doubleToLongBits(0);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (categoryId ^ (categoryId >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (modifiedOn != null ? modifiedOn.hashCode() : 0);
        result = 31 * result + (modifiedBy != null ? modifiedBy.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "video")
    @Cascade(value = {org.hibernate.annotations.CascadeType.ALL})
    public Collection<Comment> getComments() {
        return comments;
    }

    public void setComments(Collection<Comment> comments) {
        this.comments = comments;
    }

    @OneToMany(mappedBy = "video")
    @Cascade(value = {org.hibernate.annotations.CascadeType.ALL})
    public Collection<History> getHistories() {
        return histories;
    }

    public void setHistories(Collection<History> histories) {
        this.histories = histories;
    }

    @OneToMany(mappedBy = "video")
    @Cascade(value = {org.hibernate.annotations.CascadeType.ALL})
    public Collection<VidInteract> getVidInteracts() {
        return vidInteracts;
    }

    public void setVidInteracts(Collection<VidInteract> vidInteracts) {
        this.vidInteracts = vidInteracts;
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
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
