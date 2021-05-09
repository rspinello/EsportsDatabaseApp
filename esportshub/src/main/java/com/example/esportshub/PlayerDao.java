package com.example.esportshub;

import java.sql.*;
import java.util.ArrayList;
public class PlayerDao{
    
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
        
    public PlayerDao()
    {
        connectToDatabase();
    }                               

    public Player selectByPlayerId(String playerId){
        Player result = null;
	  
	    try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from PLAYER where PLAYERID='"+playerId+"'");
            //System.out.println("select * from PLAYER where PLAYERID='"+playerId+"'");
            
            if (resultSet.next())
            {
                result = new Player(resultSet.getString("PLAYERID"),resultSet.getString("FNAME"),resultSet.getString("LNAME"),resultSet.getString("COUNTRY"),resultSet.getInt("AGE"),resultSet.getInt("YEARS_PRO"),resultSet.getInt("TOURNAMENT_WINS"),resultSet.getInt("IMAGERESOURCEID"));
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
    
    public Player selectByGamertag(String gamertag){
        Player result = null;
	  
	    try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from PLAYER where GAMERTAG='"+gamertag+"'");
            //System.out.println("select * from PLAYER where PLAYERID='"+playerId+"'");
            
            if (resultSet.next())
            {
                result = new Player(resultSet.getString("PLAYERID"),resultSet.getString("FNAME"),resultSet.getString("LNAME"),resultSet.getString("COUNTRY"),resultSet.getInt("AGE"),resultSet.getInt("YEARS_PRO"),resultSet.getInt("TOURNAMENT_WINS"),resultSet.getInt("IMAGERESOURCEID"));
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
    
    public ArrayList<Object> selectAllPlayers(){
	  ArrayList<Object> result = new ArrayList<Object>();
	  
	   try {
		  //System.out.println("In selectAll()...");
		  Statement statement = connection.createStatement();
		  ResultSet resultSet = statement.executeQuery("select * from PLAYER");
		  
		  while (resultSet.next())
		  {
			  Player player = new Player(resultSet.getString("PLAYERID"),resultSet.getString("FNAME"),resultSet.getString("LNAME"),resultSet.getString("COUNTRY"),resultSet.getInt("AGE"),resultSet.getInt("YEARS_PRO"),resultSet.getInt("TOURNAMENT_WINS"),resultSet.getInt("IMAGERESOURCEID"));
              result.add(player);
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
    
    public ArrayList<Object> selectAllPlayersByTournamentWins(){
	  ArrayList<Object> result = new ArrayList<Object>();
	  
	   try {
		  //System.out.println("In selectAll()...");
		  Statement statement = connection.createStatement();
		  ResultSet resultSet = statement.executeQuery("select * from PLAYER ORDER BY TOURNAMENT_WINS DESC");
		  
		  while (resultSet.next())
		  {
			  Player player = new Player(resultSet.getString("PLAYERID"),resultSet.getString("FNAME"),resultSet.getString("LNAME"),resultSet.getString("COUNTRY"),resultSet.getInt("AGE"),resultSet.getInt("YEARS_PRO"),resultSet.getInt("TOURNAMENT_WINS"),resultSet.getInt("IMAGERESOURCEID"));
              result.add(player);
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