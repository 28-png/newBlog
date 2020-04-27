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

public Users() {}

public Users(String email, String password, List<Blog> blog) {
this.email = email;
this.password = password;
this.blog = blog;
}

public Users(Users copy) {
id = copy.id;
email = copy.email;
password = copy.password;
blog = copy.blog;
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

}

}
