public class Player{

    public String PLAYERID;
    public String FNAME;       
    public String LNAME;      
    public String COUNTRY;            
    public int AGE;               
    public int YEARS_PRO;         
    public int TOURNAMENT_WINS;    
    public int IMAGE_RESOURCE_ID;
    
    public Player(String pd, String fn, String ln, String c, int a, int y, int t, int i){
        PLAYERID=pd;
        FNAME=fn;
        LNAME=ln;
        COUNTRY=c;
        AGE=a;
        YEARS_PRO=y;
        TOURNAMENT_WINS=t;
        IMAGE_RESOURCE_ID=i;
    }
    
    public String getPLAYERID(){
        return PLAYERID;
    }
    
    public String getFNAME(){
        return FNAME;
    }
    
    public String getLNAME(){
        return LNAME;
    }

    public String getCOUNTRY(){
        return COUNTRY;
    }
    
    public int getAGE(){
        return AGE;
    }
    
    public int getYEARS_PRO(){
        return YEARS_PRO;
    }
    
    public int getTOURNAMENT_WINS(){
        return TOURNAMENT_WINS;
    }
    
    public int getIMAGE_RESOURCE_ID(){
        return IMAGE_RESOURCE_ID;
    }
    
    public void setPLAYERID(String p){
        PLAYERID=p;
    }
    
    public void setFNAME(String f){
        FNAME=f;
    }
    
    public void setLNAME(String l){
        LNAME=l;
    }

    public void setCOUNTRY(String c){
        COUNTRY=c;
    }
    
    public void setAGE(int a){
        AGE=a;
    }
    
    public void setYEARS_PRO(int y){
        YEARS_PRO=y;
    }
    
    public void setTOURNAMENT_WINS(int t){
        TOURNAMENT_WINS=t;
    }
    
    public void getIMAGE_RESOURCE_ID(int i){
        IMAGE_RESOURCE_ID=i;
    }
    
    public boolean equals(Object o){
        return this.PLAYERID.equals(((Player)o).PLAYERID);
    }
    
    public String toString(){
        return PLAYERID+" "+FNAME+" "+LNAME+" "+COUNTRY+" "+AGE+" "+YEARS_PRO+" "+TOURNAMENT_WINS+" "+IMAGE_RESOURCE_ID;
    }

}