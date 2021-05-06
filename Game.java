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

}