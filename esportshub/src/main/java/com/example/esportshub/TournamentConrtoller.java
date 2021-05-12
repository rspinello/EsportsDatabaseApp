package com.example.esportshub;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TournamentConrtoller {
    
    @GetMapping("/tournaments")
    public String tournaments(Model model) {
        TournamentDao dao = new TournamentDao();
        ArrayList<Object> tournaments = dao.selectAllTournaments();
        model.addAttribute("tournaments", tournaments);
        return "Tournaments";
    }

    @PostMapping("/tournaments")
    public String playerSearch(@RequestParam("name") String name, Model model, RedirectAttributes redirectAttributes) {
        TournamentDao dao = new TournamentDao();
        Tournament tournament = dao.selectByTournamentId(name);
        if(tournament == null)
            return "redirect:/tournaments";
        
        redirectAttributes.addFlashAttribute("name", name);
        return "redirect:/tournamentdetail";
    }

}
