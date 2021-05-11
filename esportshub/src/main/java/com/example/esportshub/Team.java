package com.example.esportshub;

public class Team{
    public String teamid;    
    public String name;     
    public String country;   
    public int years_pro;
    public double money_won;
    //public String managerid;

    //constructors
    public Team(){
        teamid=null;
        name=null;
        country=null;
        years_pro=0;
        money_won = 0;
        //managerid=null;
    }

    public Team(String teamid, String name, String country, int years_pro, double money_won){
        this.teamid=teamid;
        this.name=name;
        this.country=country;
        this.years_pro=years_pro;
        this.money_won = money_won;
        //this.managerid=managerid;
    }

    //Getters
    public String getTeamid() {
        return teamid;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getYears_pro() {
        return years_pro;
    }

    public double getMoney_won() {
        return money_won;
    }


    //other
    public boolean equals(Object o){
        return this.teamid.equals(((Team)(o)).teamid);
    }

    public String toString(){
        return teamid+" "+name+" "+country+" "+years_pro+" "+money_won;
    }

}