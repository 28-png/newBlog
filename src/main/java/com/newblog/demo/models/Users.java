package com.newblog.demo.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(nullable = false, columnDefinition = "INT(10) UNSIGNED")
private long id;
@Column(nullable = false, unique = true)
private String email;
@Column(nullable = false)
private String password;
@OneToMany(cascade = CascadeType.ALL, mappedBy = "user", orphanRemoval = true, fetch = FetchType.EAGER)
private List<Blog> blog;
@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
private List<Favorites> favorites;
@Column(nullable = false, columnDefinition = "TEXT", name = "profile_image")
private String profileImage;
@Column(nullable = false, name = "user_role")
private String userRole;

public Users() {}

public Users(String email, String password, List<Blog> blog, List<Favorites> favorites, String profileImage, String userRole) {
this.email = email;
this.password = password;
this.blog = blog;
this.favorites = favorites;
this.profileImage = profileImage;
this.userRole = userRole;
}

public Users(Users copy) {
id = copy.id;
email = copy.email;
password = copy.password;
blog = copy.blog;
favorites = copy.favorites;
 profileImage = copy.profileImage;
 userRole = copy.userRole;
}

public long getId() {
    return id;
}

public void setId(long id) {
    this.id = id;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPassword() {
return password;
}

public void setPassword(String password) {
    this.password = password;
}

public List<Blog> getBlog() {
    return blog;
}

public void setBlog(List<Blog> blog) {
    this.blog = blog;
}

public List<Favorites> getFavorites() {
    return favorites;
}

public void setFavorites(List<Favorites> favorites) {
    this.favorites = favorites;
}

public String getProfileImage() {
return profileImage;
}

public void setProfileImage(String profileImage) {
this.profileImage = profileImage;
}

public String getUserRole() {
    return userRole;
}



}
