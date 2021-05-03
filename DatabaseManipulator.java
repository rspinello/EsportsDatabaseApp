import java.util.ArrayList;
public class DatabaseManipulator {
    //////////////////////////////
    ////////////UserDao///////////
    //////////////////////////////
    public User selectByUserId(String userid){
        UserDao dao = new UserDao();
        return dao.selectByUserId(userid);
    }
    
    public void createNewUser(User u){
        UserDao dao = new UserDao();
        dao.createNewUser(u);
    }
    
    //////////////////////////////////
    ////////////PlayerDao/////////////
    //////////////////////////////////
    public Player selectByPlayerId(String playerId){
        PlayerDao dao = new PlayerDao();
        return dao.selectByPlayerId(playerId);
    }
    
    public Player selectByGamertag(String gamertag){
        PlayerDao dao = new PlayerDao();
        return dao.selectByGamertag(gamertag);
    }
    
    public ArrayList<Object> selectAllPlayers(){
        PlayerDao dao = new PlayerDao();
        return dao.selectAllPlayers();
    }
    
    public ArrayList<Object> selectAllPlayersByTournamentWins(){
        PlayerDao dao = new PlayerDao();
        return dao.selectAllPlayersByTournamentWins();
    }
    
    /////////////////////////////////////////
    //////////////////TeamDao////////////////
    /////////////////////////////////////////
    public Team selectByTeamId(String teamId){
        TeamDao dao = new TeamDao();
        return dao.selectByTeamId(teamId);
    }
    
    public ArrayList<Object> selectAllTeams(){
        TeamDao dao = new TeamDao();
        return dao.selectAllTeams();
    }
    
    public ArrayList<Object> selectAllTeamsByMoneyWon(){
        TeamDao dao = new TeamDao();
        return dao.selectAllTeamsByMoneyWon();
    }
    
    public static void main(String[] args){
        DatabaseManipulator dm = new DatabaseManipulator();
        //Test UserDao
        //System.out.println(dm.selectByUserId("bdugan"));
        //dm.createNewUser(new User("dcole","csiscool55"));
        //System.out.println(dm.selectByUserId("dcole"));
        //
        //Test PlayerDao
        //System.out.println(dm.selectByGamertag("NAF"));
        //ArrayList<Object> a = dm.selectAllPlayersByTournamentWins();
        //for(int i=0; i<a.size();i++){
            //System.out.println(a.get(i));
        //}
        //
        //Test TeamDao
        //System.out.println(dm.selectByTeamId("Liquid"));
        ArrayList<Object> a = dm.selectAllTeamsByMoneyWon();
        for(int i=0; i<a.size();i++){
            System.out.println(a.get(i));
        }
    }

}
