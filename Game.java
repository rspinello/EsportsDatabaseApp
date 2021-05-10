public class Game{

    public String GAMEID;
    public String NAME;
    public int YEARS_PLAYED;

    public Game(String g, String n, int y){
        GAMEID=g;
        NAME=n;
        YEARS_PLAYED=y;
    }

    public boolean equals(Object o){
        return this.GAMEID.equals(((Game)(o)).GAMEID);
    }
    
    public String toString(){
        return GAMEID+" "+NAME+" "+YEARS_PLAYED;
    }
    
    public String getGAMEID(){
        return GAMEID;
    }
    
    public String getNAME(){
        return NAME;
    }
    
    public int getYEARS_PLAYED(){
        return YEARS_PLAYED;
    }
    
    public void setGAMEID(String g){
        GAMEID=g;
    }
    
    public void setNAME(String n){
        NAME=n;
    }
    
    public void setYEARS_PLAYED(int y){
        YEARS_PLAYED=y;
    }
    
    
}