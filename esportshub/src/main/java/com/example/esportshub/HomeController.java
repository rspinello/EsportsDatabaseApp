package com.example.esportshub;

import java.util.ArrayList;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/home")
    public String home(Model model) {
        PlayerDao dao = new PlayerDao();
        ArrayList<Object> players = dao.selectAllPlayersByTournamentWins();

        String s ="";
        for(int i = 0; i < players.size(); i++) 
            s = s + (i+1) + ": " + players.get(i) + "\n";

        model.addAttribute("players", s);
        return "Home";
    }


}
