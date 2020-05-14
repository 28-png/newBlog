package com.newblog.demo.controllers;

import com.newblog.demo.models.Users;
import com.newblog.demo.repo.UserRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
private UserRepo usersdao;

public UserController(UserRepo users) {
this.usersdao = users;
}

@GetMapping("/sign-up")
public String userSignupForm(Model model) {
    model.addAttribute("user", new Users());
    return "redirect:/sign-up";
}




}
