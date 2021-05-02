public class PlaysFor{
    public String PLAYERID;
    public String TEAMID;

    public PlaysFor(String p, String t){
        PLAYERID=p;
        TEAMID=t;
    }

    public boolean equals(Object o){
        return this.PLAYERID.equals(((PlaysFor)(o)).PLAYERID) && this.TEAMID.equals(((PlaysFor)(o)).TEAMID);
    }

}