package com.example.esportshub;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/home")
    public String home(Model model) {
        PlayerDao dao = new PlayerDao();
        ArrayList<Object> players = dao.selectAllPlayersByTournamentWins();
        model.addAttribute("players", players);
        return "Home";
    }


}
