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
//        (fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "blog_id")
    private Blog blog;

}
