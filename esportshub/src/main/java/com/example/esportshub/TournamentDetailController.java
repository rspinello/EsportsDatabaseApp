package com.example.esportshub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TournamentDetailController {
    
    @GetMapping("/tournamentdetail")
    public String tournamentDetail(Model model) {
        String name = (String)model.asMap().get("name");
        TournamentDao tdao = new TournamentDao();
        Tournament tournament = tdao.selectByTournamentId(name);

        GameDao gdao = new GameDao();
        Game game = gdao.selectByGameId(tournament.gameid);

        TeamDao tedao = new TeamDao();
        Team team = tedao.selectByTeamId(tournament.winner);

        model.addAttribute("tournament", tournament);
        model.addAttribute("game", game);
        model.addAttribute("team", team);

        return "tournamentdetail";
    }
}
