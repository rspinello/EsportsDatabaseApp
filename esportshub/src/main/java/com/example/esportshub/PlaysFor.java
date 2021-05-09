package com.example.esportshub;

public class PlaysFor{
    public String playerid;
    public String teamid;
    public String gameid;

    //constructor
    public PlaysFor(){
        playerid=null;
        teamid=null;
        gameid=null;
    }

    public PlaysFor(String playerid, String teamid, String gameid){
        this.playerid=playerid;
        this.teamid=teamid;
        this.gameid=gameid;
    }

    //Getters
    public String getPlaterid() {
        return playerid;
    }

    public String getTeamid() {
        return teamid;
    }

    public String getGameid() {
        return gameid;
    }

    public boolean equals(Object o){
        return this.playerid.equals(((PlaysFor)(o)).playerid) && this.teamid.equals(((PlaysFor)(o)).teamid) && this.gameid.equals(((PlaysFor)(o)).gameid);
    }
    
    public String toString(){
        return playerid+" "+teamid+" "+gameid;
    }

}