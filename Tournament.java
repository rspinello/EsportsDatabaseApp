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

    public boolean equals(Object o){
        return this.TOURNAMENT_ID.equals(((Tournament)(o)).TOURNAMENT_ID);
    }

}