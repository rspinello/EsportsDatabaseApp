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
    
    /////////////////////////////////////////
    //////////////////GameDao////////////////
    /////////////////////////////////////////
    public Game selectByGameId(String gameId){
        GameDao dao = new GameDao();
        return dao.selectByGameId(gameId);
    }
    
    public ArrayList<Object> selectAllGames(){
        GameDao dao = new GameDao();
        return dao.selectAllGames();
    }
    
    /////////////////////////////////////////
    //////////////PlaysForDao////////////////
    /////////////////////////////////////////
    public PlaysFor selectPlaysForByPrimaryKey(String playerId, String teamId, String gameId){
        PlaysForDao dao = new PlaysForDao();
        return dao.selectByPrimaryKey(playerId,teamId,gameId);
    }
    
    public ArrayList<Object> selectAllPlaysFor(){
        PlaysForDao dao = new PlaysForDao();
        return dao.selectAllPlaysFor();
    }
    
    public ArrayList<Object> selectAllPlaysForByTeamId(String teamId){
        PlaysForDao dao = new PlaysForDao();
        return dao.selectAllPlaysForByTeamId(teamId);
    }
    
    /////////////////////////////////////////
    ////////////TournamentDao////////////////
    /////////////////////////////////////////
    public Tournament selectByTournamentId(String tournamentId){
        TournamentDao dao = new TournamentDao();
        return dao.selectByTournamentId(tournamentId);
    }
    
    public ArrayList<Object> selectAllTournaments(){
        TournamentDao dao = new TournamentDao();
        return dao.selectAllTournaments();
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
        //ArrayList<Object> a = dm.selectAllTeamsByMoneyWon();
        //for(int i=0; i<a.size();i++){
           // System.out.println(a.get(i));
        //}
        //Test GameDao
        //System.out.println(dm.selectByGameId("CSGO"));
        //ArrayList<Object> a = dm.selectAllGames();
        //for(int i=0; i<a.size();i++){
            //System.out.println(a.get(i));
        //}
        //Test PlaysForDao
        //System.out.println(dm.selectPlaysForByPrimaryKey("Stewie2K_CSGO","Liquid","CSGO"));
        //ArrayList<Object> a = dm.selectAllPlaysFor();
        //for(int i=0; i<a.size();i++){
            //System.out.println(a.get(i));
        //}
        //ArrayList<Object> a = dm.selectAllPlaysForByTeamId("Liquid");
        //for(int i=0; i<a.size();i++){
            //System.out.println(a.get(i));
        //}
        //Test Tournament
        //System.out.println(dm.selectByTournamentId("Intel Extreme Masters"));
        //ArrayList<Object> a = dm.selectAllTournaments();
        //for(int i=0; i<a.size();i++){
            //System.out.println(a.get(i));
        //}
    }

}
