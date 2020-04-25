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
@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
@JoinColumn

}
