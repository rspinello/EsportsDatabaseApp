public class Team{
    public String TEAMID;    
    public String NAME;     
    public String COUNTRY;   
    public int YEARS_PRO;
    public double MONEY_WON;

    public Team(String td, String n, String c, int y, double mo){
        TEAMID=td;
        NAME=n;
        COUNTRY=c;
        YEARS_PRO=y;
        MONEY_WON=mo;
    }
    
    public String getTEAMID(){
        return TEAMID;
    }
    
    public String getNAME(){
        return NAME;
    }
    
    public String getCOUNTRY(){
        return COUNTRY;
    }
    
    public int getYEARS_PRO(){
        return YEARS_PRO;
    }
    
    public double getMONEY_WON(){
        return MONEY_WON;
    }
    
    public void setTEAMID(String t){
        TEAMID=t;
    }
    
    public void setNAME(String n){
        NAME=n;
    }
    
    public void setCOUNTRY(String c){
        COUNTRY=c;
    }
    
    public void setYEARS_PRO(int y){
        YEARS_PRO=y;
    }
    
    public void setMONEY_WON(double m){
        MONEY_WON=m;
    }
    
    public boolean equals(Object o){
        return this.TEAMID.equals(((Team)(o)).TEAMID);
    }

    public String toString(){
        return TEAMID+" "+NAME+" "+COUNTRY+" "+YEARS_PRO+" "+MONEY_WON;
    }

}