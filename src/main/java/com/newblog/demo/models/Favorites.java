package com.newblog.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "favorites")
public class Favorites {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

}
