package com.youtube.entities;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "youtube")
public class User {

    private long id;
    private String email;
    private String name;
    private String avatarUrl;
    private long subscribe;
    private String nameChannel;
    private String avatarChannelUrl;
    private String coverChannelUrl;

    private Timestamp createdOn;
    private Long createdBy;
    private Timestamp modifiedOn;
    private Long modifiedBy;

    private Collection<ComInteract> comInteracts;
    private Collection<Comment> comments;
    private Collection<History> histories;
    private Collection<Subscribe> subscribers;  // subscribed
    private Collection<Subscribe> subscribes;   // subscribe
    private Collection<VidInteract> vidInteracts;
    private Collection<Video> videos;

    public User() {

    }

    public User(Long id, String email, String name, String avatarUrl, long subscribe, String nameChannel, String avatarChannelUrl, String coverChannelUrl) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.subscribe = subscribe;
        this.nameChannel = nameChannel;
        this.avatarChannelUrl = avatarChannelUrl;
        this.coverChannelUrl = coverChannelUrl;
    }

    public User(String email, String name, String avatarUrl, long subscribe, String nameChannel, String avatarChannelUrl, String coverChannelUrl, Timestamp modifiedOn, Long modifiedBy) {
        this.email = email;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.subscribe = subscribe;
        this.nameChannel = nameChannel;
        this.avatarChannelUrl = avatarChannelUrl;
        this.coverChannelUrl = coverChannelUrl;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
    }

    public User(String email, String name, String avatarUrl, long subscribe, String nameChannel, String avatarChannelUrl, String coverChannelUrl, Timestamp createdOn, Long createdBy, Timestamp modifiedOn, Long modifiedBy) {

        this.email = email;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.subscribe = subscribe;
        this.nameChannel = nameChannel;
        this.avatarChannelUrl = avatarChannelUrl;
        this.coverChannelUrl = coverChannelUrl;
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
    @Column(name = "email", nullable = false, unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "name", nullable = false)
    @Nationalized
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "avatarUrl", nullable = false, length = 4096)
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Basic
    @Column(name = "subscribe")
    public long getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(long subscribe) {
        this.subscribe = subscribe;
    }

    @Basic
    @Column(name = "nameChannel")
    @Nationalized
    public String getNameChannel() {
        return nameChannel;
    }

    public void setNameChannel(String nameChannel) {
        this.nameChannel = nameChannel;
    }

    @Basic
    @Column(name = "avatarChannelUrl", length = 4096)
    public String getAvatarChannelUrl() {
        return avatarChannelUrl;
    }

    public void setAvatarChannelUrl(String avatarChannelUrl) {
        this.avatarChannelUrl = avatarChannelUrl;
    }

    @Basic
    @Column(name = "coverChannelUrl", length = 4096)
    public String getCoverChannelUrl() {
        return coverChannelUrl;
    }

    public void setCoverChannelUrl(String coverChannelUrl) {
        this.coverChannelUrl = coverChannelUrl;
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

        User user = (User) o;

        if (id != user.id) return false;
        if (subscribe != user.subscribe) return false;
        if (!Objects.equals(email, user.email)) return false;
        if (!Objects.equals(name, user.name)) return false;
        if (!Objects.equals(avatarUrl, user.avatarUrl)) return false;
        if (!Objects.equals(nameChannel, user.nameChannel)) return false;
        if (!Objects.equals(avatarChannelUrl, user.avatarChannelUrl)) return false;
        if (!Objects.equals(coverChannelUrl, user.coverChannelUrl)) return false;
        if (!Objects.equals(createdOn, user.createdOn)) return false;
        if (!Objects.equals(createdBy, user.createdBy)) return false;
        if (!Objects.equals(modifiedOn, user.modifiedOn)) return false;
        return Objects.equals(modifiedBy, user.modifiedBy);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (avatarUrl != null ? avatarUrl.hashCode() : 0);
        result = 31 * result + (int) (subscribe ^ (subscribe >>> 32));
        result = 31 * result + (nameChannel != null ? nameChannel.hashCode() : 0);
        result = 31 * result + (avatarChannelUrl != null ? avatarChannelUrl.hashCode() : 0);
        result = 31 * result + (coverChannelUrl != null ? coverChannelUrl.hashCode() : 0);
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (modifiedOn != null ? modifiedOn.hashCode() : 0);
        result = 31 * result + (modifiedBy != null ? modifiedBy.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "user")
    @Cascade(value = {org.hibernate.annotations.CascadeType.ALL})
    public Collection<ComInteract> getComInteracts() {
        return comInteracts;
    }

    public void setComInteracts(Collection<ComInteract> comInteracts) {
        this.comInteracts = comInteracts;
    }

    @OneToMany(mappedBy = "user")
    @Cascade(value = {org.hibernate.annotations.CascadeType.ALL})
    public Collection<Comment> getComments() {
        return comments;
    }

    public void setComments(Collection<Comment> comments) {
        this.comments = comments;
    }

    @OneToMany(mappedBy = "user")
    @Cascade(value = {org.hibernate.annotations.CascadeType.ALL})
    public Collection<History> getHistories() {
        return histories;
    }

    public void setHistories(Collection<History> histories) {
        this.histories = histories;
    }

    @OneToMany(mappedBy = "user")
    @Cascade(value = {org.hibernate.annotations.CascadeType.ALL})
    public Collection<Subscribe> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Collection<Subscribe> subscribers) {
        this.subscribers = subscribers;
    }

    @OneToMany(mappedBy = "userSub")
    @Cascade(value = {org.hibernate.annotations.CascadeType.ALL})
    public Collection<Subscribe> getSubscribes() {
        return subscribes;
    }

    public void setSubscribes(Collection<Subscribe> subscribes) {
        this.subscribes = subscribes;
    }

    @OneToMany(mappedBy = "user")
    @Cascade(value = {org.hibernate.annotations.CascadeType.ALL})
    public Collection<VidInteract> getVidInteracts() {
        return vidInteracts;
    }

    public void setVidInteracts(Collection<VidInteract> vidInteracts) {
        this.vidInteracts = vidInteracts;
    }

    @OneToMany(mappedBy = "user")
    @Cascade(value = {org.hibernate.annotations.CascadeType.ALL})
    public Collection<Video> getVideos() {
        return videos;
    }

    public void setVideos(Collection<Video> videos) {
        this.videos = videos;
    }
}
