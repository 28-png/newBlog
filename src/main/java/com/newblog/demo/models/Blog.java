package com.newblog.demo.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "blog")
public class Blog {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(nullable = false)
private String description;
@Column(nullable = false)
private String body;
@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
@JoinColumn(name = "user_id")
private Users user;
@OneToMany(cascade = CascadeType.ALL, mappedBy = "blog")
private List<Favorites> favorites;

public Blog() {}

public Blog(String description, String body, Users user, List<Favorites> favorites) {
this.description = description;
this.body = body;
this.user = user;

}

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

}
