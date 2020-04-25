package com.newblog.demo.models;

import javax.persistence.*;

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
@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
}
