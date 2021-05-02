public class Team{
    public String TEAMID;    
    public String NAME;     
    public String COUNTRY;   
    public int YEARS_PRO;
    public double MONEY_WON;
    public String MANAGERID;

    public Team(String td, String n, String c, int y, double mo, String ma){
        TEAMID=td;
        NAME=n;
        COUNTRY=c;
        YEARS_PRO=y;
        MONEY_WON=mo;
        MANAGERID=ma;
    }

    public boolean equals(Object o){
        return this.TEAMID.equals(((Team)(o)).TEAMID);
    }

    public static void main(String[] args){
        System.out.println("hello");
    }

}