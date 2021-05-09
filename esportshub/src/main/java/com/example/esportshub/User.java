package com.example.esportshub;

public class User {
    public String uname;
    public String pass;

    //contsructors
    public User() {
        this.uname = null;
        this.pass = null;
    }

    public User(String uname, String pass) {
        this.uname = uname;
        this.pass = pass;
    }

    //Getters
    public String getUname() {
        return uname;
    }

    public String getPass() {
        return pass;
    }

    //other
    public String toString(){
        return "USERID:"+uname+" PASSWORD:"+pass;
    }
}
