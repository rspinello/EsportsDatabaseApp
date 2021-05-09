package com.example.esportshub;

public class Tournament{
    public String tournament_id;
    public String day;
    public String gameid;
    public String winner;

    //constructor
    public Tournament(){
        tournament_id=null;
        day=null;
        gameid=null;
        winner=null;
    }

    public Tournament(String tournament_id, String day, String gameid, String winner){
        this.tournament_id=tournament_id;
        this.day=day;
        this.gameid=gameid;
        this.winner=winner;
    }

    //Getters
    public String getTournament_id() {
        return tournament_id;
    }

    public String getDay() {
        return day;
    }

    public String getGameid() {
        return gameid;
    }

    public String getWinner() {
        return winner;
    }

    public boolean equals(Object o){
        return this.tournament_id.equals(((Tournament)(o)).tournament_id);
    }

}