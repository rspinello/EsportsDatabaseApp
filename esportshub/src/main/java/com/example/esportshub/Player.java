package com.example.esportshub;

public class Player{

    public String playerid;
    public String fname;       
    public String lname;      
    public String country;
    public String gamertag;            
    public int age;               
    public int years_pro;         
    public int tournament_wins;    
    public int image_resource_id;

    //constructors 
    public Player(){
        this.playerid=null;
        this.fname=null;
        this.lname=null;
        this.country=null;
        this.gamertag=null;
        this.age=0;
        this.years_pro=0;
        this.tournament_wins=0;
        this.image_resource_id=0;
    }
    
    public Player(String playerid, String fname, String lname, String country, String gamertag,int age, int years_pro, int tournament_wins, int image_resource_id){
        this.playerid=playerid;
        this.fname=fname;
        this.lname=lname;
        this.country=country;
        this.gamertag=gamertag;
        this.age=age;
        this.years_pro=years_pro;
        this.tournament_wins=tournament_wins;
        this.image_resource_id=image_resource_id;
    }

    //Getters
    public String getPlaterid() {
        return playerid;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getCountry() {
        return country;
    }

    public String getGamertag() {
        return gamertag;
    }

    public int getAge() {
        return age;
    }

    public int getYears_pro() {
        return years_pro;
    }

    public int getTournament_wins() {
        return tournament_wins;
    }

    public int getImage_resource_id() {
        return image_resource_id;
    }

    //other
    public boolean equals(Object o){
        return this.playerid.equals(((Player)o).playerid);
    }
    
    public String toString(){
        return playerid+" "+fname+" "+lname+" "+country+" "+age+" "+years_pro+" "+tournament_wins+" "+image_resource_id;
    }
    

}