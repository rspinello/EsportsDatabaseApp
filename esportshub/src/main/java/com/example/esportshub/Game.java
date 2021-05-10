package com.example.esportshub;

public class Game {

    public String gameid;
    public String name;
    public int years_played;

    //constructors
    public Game() {
        this.gameid=null;
        this.name=null;
        this.years_played=0;
    }

    public Game(String gameid, String name, int years_played) {
        this.gameid=gameid;
        this.name=name;
        this.years_played=years_played;
    }

    //Getters
    public String getGameid() {
        return gameid;
    }

    public String getName() {
        return name;
    }

    public int getYears_played() {
        return years_played;
    }

    //other
    public boolean equals(Object o){
        return this.gameid.equals(((Game)(o)).gameid);
    }
    
    public String toString(){
        return gameid+" "+name+" "+years_played;
    }

}