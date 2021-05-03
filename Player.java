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

    public boolean equals(Object o){
        return this.PLAYERID.equals(((Player)o).PLAYERID);
    }
    
    public String toString(){
        return PLAYERID+" "+FNAME+" "+LNAME+" "+COUNTRY+" "+AGE+" "+YEARS_PRO+" "+TOURNAMENT_WINS+" "+IMAGE_RESOURCE_ID;
    }
    

}