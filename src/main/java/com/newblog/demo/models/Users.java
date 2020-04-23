package com.newblog.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
}
