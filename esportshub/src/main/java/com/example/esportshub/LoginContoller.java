package com.example.esportshub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import com.example.esportshub.UserDao;

@Controller
public class LoginContoller {
    

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String loginSumbit(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        System.out.println(user);
        if(verify(user))
            return "redirect:/home";
        return "redirect:/login";
    }

    public boolean verify(User user) {
        UserDao dao = new UserDao();
        User temp = dao.selectByUserId(user.uname);
        System.out.println(temp);
        if(temp != null) {
            if(temp.equals(user))
                return true; 
        }
        return false;
    }
}
