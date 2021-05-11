package com.example.esportshub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayerDetailController {
    
    @GetMapping("/playerdetail")
    public String playerDetail(Model model) {
        String gamertag = (String)model.asMap().get("player");
        
        PlayerDao pdao = new PlayerDao();
        Player player = pdao.selectByGamertag(gamertag);

        PlaysForDao pfdao = new PlaysForDao();
        PlaysFor pf = pfdao.selectByPlayerId(player.playerid);

        TeamDao tdao = new TeamDao();
        Team team = tdao.selectByTeamId(pf.teamid);

        GameDao gdao = new GameDao();
        Game game = gdao.selectByGameId(pf.gameid);

        model.addAttribute("player", player);
        model.addAttribute("team", team);
        model.addAttribute("game", game);
        

        return "playdetail";
    }

}
