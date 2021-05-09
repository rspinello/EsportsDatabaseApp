package com.example.esportshub;

import java.sql.*;
import java.util.ArrayList;
public class GameDao{
    
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
        
    public GameDao()
    {
        connectToDatabase();
    }                               

    public Game selectByGameId(String gameId){
        Game result = null;
	  
	    try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from GAME where GAMEID='"+gameId+"'");
            //System.out.println("select * from PLAYER where PLAYERID='"+playerId+"'");
            
            if (resultSet.next())
            {
                result = new Game(resultSet.getString("GAMEID"),resultSet.getString("NAME"),resultSet.getInt("YEARS_PLAYED"));
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
    
    public ArrayList<Object> selectAllGames(){
	  ArrayList<Object> result = new ArrayList<Object>();
	  
	   try {
		  //System.out.println("In selectAll()...");
		  Statement statement = connection.createStatement();
		  ResultSet resultSet = statement.executeQuery("select * from GAME");
		  
		  while (resultSet.next())
		  {
			  Game g = new Game(resultSet.getString("GAMEID"),resultSet.getString("NAME"),resultSet.getInt("YEARS_PLAYED"));
              result.add(g);
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