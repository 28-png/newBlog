package com.newblog.demo.models;

import javax.persistence.*;

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

public Blog() {}

public Blog(String description, String body, Users user) {
this.description = description;

}

}
