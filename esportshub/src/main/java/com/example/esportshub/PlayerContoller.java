package com.example.esportshub;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PlayerContoller {
    
    @GetMapping("/players")
    public String players(Model model) {
        PlayerDao dao = new PlayerDao();
        ArrayList<Object> players = dao.selectAllPlayers();
        model.addAttribute("players", players);
        return "Players";
    }

    @PostMapping("/players")
    public String playerSearch(@RequestParam("gamertag") String gamertag, Model model, RedirectAttributes redirectAttributes) {
        PlayerDao dao = new PlayerDao();
        Player player = dao.selectByGamertag(gamertag);
        System.out.println(gamertag);
        if(player == null)
            return "redirect:/players";
        
        redirectAttributes.addAttribute("player", player);
        return "redirect:/playerdetail";
    }

}
