package com.newblog.demo.controllers;

import com.newblog.demo.repo.UserRepo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
private UserRepo usersdao;

public UserController(UserRepo users) {
this.usersdao = users;
}






}
