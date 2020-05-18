package com.newblog.demo.controllers;

import com.newblog.demo.models.Users;
import com.newblog.demo.repo.UserRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
private UserRepo usersdao;
private PasswordEncoder passwordEncoder;

public UserController(UserRepo users, PasswordEncoder passwordEncoder) {
this.usersdao = users;
this.passwordEncoder = passwordEncoder;
}

@GetMapping("/sign-up")
public String userSignupForm(Model model) {
    model.addAttribute("user", new Users());
    return "redirect:/sign-up";
}

    @PostMapping("/sign-up")
    public String saveBreeder(@ModelAttribute Users user){
        String hash = passwordEncoder.encode(user.getPassword());
        user.setPassword(hash);
        usersdao.save(user);
        return "redirect:/login";
    }




}
