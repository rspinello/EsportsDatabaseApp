public class PlaysFor{
    public String PLAYERID;
    public String TEAMID;
    public String GAMEID;

    public PlaysFor(String p, String t, String g){
        PLAYERID=p;
        TEAMID=t;
        GAMEID=g;
    }
    
    public String getPLAYERID(){
        return PLAYERID;
    }
    
    public String getTEAMID(){
        return TEAMID;
    }
    
    public String getGAMEID(){
        return GAMEID;
    }
    
    public void setPLAYERID(String p){
        PLAYERID=p;
    }
    
    public void setTEAMID(String t){
        TEAMID=t;
    }
    
    public void setGAMEID(String g){
        GAMEID=g;
    }

    public boolean equals(Object o){
        return this.PLAYERID.equals(((PlaysFor)(o)).PLAYERID) && this.TEAMID.equals(((PlaysFor)(o)).TEAMID) && this.GAMEID.equals(((PlaysFor)(o)).GAMEID);
    }
    
    public String toString(){
        return PLAYERID+" "+TEAMID+" "+GAMEID;
    }

}