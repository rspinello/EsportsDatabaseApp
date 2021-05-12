package com.example.esportshub;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {
    
    @GetMapping("/games")
    public String games(Model model) {
        GameDao dao = new GameDao();
        ArrayList<Object> games = dao.selectAllGames();
        model.addAttribute("games", games);
        return "Games";
    }

}
