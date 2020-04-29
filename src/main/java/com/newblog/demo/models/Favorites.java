package com.newblog.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "favorites")
public class Favorites {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(nullable = false)
private String description;
@Column(nullable = false)
private String body;
@ManyToOne
@JoinColumn(name = "user_id")
private Users user;
@ManyToOne
@JoinColumn(name = "blog_id")
private Blog blog;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
