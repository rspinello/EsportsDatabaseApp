public class Tournament{
    public String TOURNAMENT_ID;
    public String DAY;
    public String GAMEID;
    public String WINNER;

    public Tournament(String t, String d, String g, String w){
        TOURNAMENT_ID=t;
        DAY=d;
        GAMEID=g;
        WINNER=w;
    }
    
    public String getTOURNAMENT_ID(){
        return TOURNAMENT_ID;
    }
    
    public String getDAY(){
        return DAY;
    }
    
    public String getGAMEID(){
        return GAMEID;
    }
    
    public String getWINNER(){
        return WINNER;
    }
    
    public void setTOURNAMENT_ID(String t){
        TOURNAMENT_ID=t;
    }
    
    public void setDAY(String d){
        DAY=d;
    }
    
    public void setGAMEID(String g){
        GAMEID=g;
    }
    
    public void setWINNER(String w){
        WINNER=w;
    }

    public boolean equals(Object o){
        return this.TOURNAMENT_ID.equals(((Tournament)(o)).TOURNAMENT_ID);
    }

    public String toString(){
        return TOURNAMENT_ID+" "+DAY+" "+GAMEID+" "+WINNER;
    }

}