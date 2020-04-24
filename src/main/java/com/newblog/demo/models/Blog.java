package com.newblog.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
}
