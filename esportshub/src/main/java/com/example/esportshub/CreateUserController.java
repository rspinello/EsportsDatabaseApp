package com.example.esportshub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateUserController {
    
    @GetMapping("/createuser")
    public String createUserForm(Model model) {
        model.addAttribute("user", new User());
        return "CreateUser";
    }

    @PostMapping("/createuser")
    public String createUserSumbit(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        UserDao dao = new UserDao();
        dao.createNewUser(user);
        return "redirect:/login";
    }

}
