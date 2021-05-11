package com.example.esportshub;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {
    
    @GetMapping("/teams")
    public String teams(Model model) {
        TeamDao dao = new TeamDao();
        ArrayList<Object> teams = dao.selectAllTeams();
        model.addAttribute("teams", teams);
        return "Teams";
    } 
}
