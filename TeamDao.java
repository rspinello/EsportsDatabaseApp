import java.sql.*;
import java.util.ArrayList;
public class TeamDao{
    
    String driverName    = "oracle.jdbc.driver.OracleDriver";

    // Connection to specific ORACLE database
    ////////////////////////////////////////////////
    // Put YOUR userid here -----------------------v
    ////////////////////////////////////////////////
    String connectionURL = "jdbc:oracle:thin:jmilinazzo/csrocks55@csc325spring2021.cjjvanphib99.us-west-2.rds.amazonaws.com:1521:ORCL";
    Driver driver;
    Connection connection;
        
    public void setDriverName(String value)
    {
        driverName = value;
    }

    public String getDriverName()
    {
        return driverName;
    }

    public void setConnectionURL(String value)
    {
        connectionURL = value;
    }

    public String getConnectionURL()
    {
        return connectionURL;
    }

    /////////////////////////////////////////////////////////////
    // CONNECT TO DATABASE
    /////////////////////////////////////////////////////////////
    private void connectToDatabase()
    {
        try {
            //System.out.println("Trying to connect to database getting driver..."); 
            driver = (java.sql.Driver) Class.forName(driverName).newInstance();
            
            //System.out.println("Driver loaded.  Connecting to database...");
            connection = DriverManager.getConnection(connectionURL);
            //System.out.println("Connection successful!");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /////////////////////////////////////////////////////////////
    // DISCONNECT FROM DATABASE.
    /////////////////////////////////////////////////////////////
    public void disconnectFromDatabase()
    {
        try {
            //System.out.println("Trying to disconnect from database...");
            connection.close();
            //System.out.println("Disconnection successful...");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    // Finalize method disconnects on garbage collection
    public void finalize()
    {
        disconnectFromDatabase();
    }
        
    public TeamDao()
    {
        connectToDatabase();
    }                               

    public Team selectByTeamId(String teamId){
        Team result = null;
	  
	    try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from TEAM where TEAMID='"+teamId+"'");
            //System.out.println("select * from PLAYER where PLAYERID='"+playerId+"'");
            
            if (resultSet.next())
            {
                result = new Team(resultSet.getString("TEAMID"),resultSet.getString("NAME"),resultSet.getString("COUNTRY"),resultSet.getInt("YEARS_PRO"),resultSet.getDouble("MONEY_WON"));
            }
            
            resultSet.close();
            statement.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return result;
    }
    
    public ArrayList<Object> selectAllTeams(){
	  ArrayList<Object> result = new ArrayList<Object>();
	  
	   try {
		  //System.out.println("In selectAll()...");
		  Statement statement = connection.createStatement();
		  ResultSet resultSet = statement.executeQuery("select * from Team");
		  
		  while (resultSet.next())
		  {
			  Team t = new Team(resultSet.getString("TEAMID"),resultSet.getString("NAME"),resultSet.getString("COUNTRY"),resultSet.getInt("YEARS_PRO"),resultSet.getDouble("MONEY_WON"));
              result.add(t);
		  }
		  
		  resultSet.close();
		  statement.close();
	  }
	  catch (Exception e)
	 {
		 e.printStackTrace();
	 }

	  return result;
  }
    
    public ArrayList<Object> selectAllTeamsByMoneyWon(){
	  ArrayList<Object> result = new ArrayList<Object>();
	  
	   try {
		  //System.out.println("In selectAll()...");
		  Statement statement = connection.createStatement();
		  ResultSet resultSet = statement.executeQuery("select * from TEAM ORDER BY MONEY_WON DESC");
		  
		   while (resultSet.next())
		  {
			  Team t = new Team(resultSet.getString("TEAMID"),resultSet.getString("NAME"),resultSet.getString("COUNTRY"),resultSet.getInt("YEARS_PRO"),resultSet.getDouble("MONEY_WON"));
              result.add(t);
		  }
		  
		  resultSet.close();
		  statement.close();
	  }
	  catch (Exception e)
	 {
		 e.printStackTrace();
	 }

	  return result;
  }
    
    public ArrayList<Object> selectAllTeamsByGameId(String gameId){
	  ArrayList<Object> result = new ArrayList<Object>();
	  
	   try {
		  //System.out.println("In selectAll()...");
		  Statement statement = connection.createStatement();
		  ResultSet resultSet = statement.executeQuery("select * from TEAM, (select distinct TEAM.TEAMID as T from TEAM, PLAYS_FOR where TEAM.TEAMID=PLAYS_FOR.TEAMID and PLAYS_FOR.GAMEID='"+gameId+"') where TEAM.TEAMID = T");
		  
		   while (resultSet.next())
		  {
			  Team t = new Team(resultSet.getString("TEAMID"),resultSet.getString("NAME"),resultSet.getString("COUNTRY"),resultSet.getInt("YEARS_PRO"),resultSet.getDouble("MONEY_WON"));
              result.add(t);
		  }
		  
		  resultSet.close();
		  statement.close();
	  }
	  catch (Exception e)
	 {
		 e.printStackTrace();
	 }

	  return result;
  }
    
}