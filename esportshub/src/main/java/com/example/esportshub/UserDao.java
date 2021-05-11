package com.example.esportshub;

import java.sql.*;

public class UserDao {

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
        
    public UserDao()
    {
        connectToDatabase();
    }                               

    public User selectByUserId(String userid){
        User result = null;
	  
	    try {
            //System.out.println("In selecByUserId()...");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from REGISTERED_USERS where userid='"+userid+"'");
            
            if (resultSet.next())
            {
                //public User(String u, String pa, String f, String l, String ad, String c, String s, int z, String ph, String e, int au)
                result = new User(resultSet.getString("USERID"),resultSet.getString("PASSWORD"));
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

    public void createNewUser(User u){
        try {
            Statement statement = connection.createStatement();
            String sql = "insert into REGISTERED_USERS values ("+"'"+u.uname+"',"+"'"+u.pass+"')";
            //System.out.println("insert(): "+sql);
            statement.executeUpdate(sql);
            statement.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
