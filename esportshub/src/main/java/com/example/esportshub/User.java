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

    //Setters
    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    //other
    public String toString(){
        return "USERID:"+uname+" PASSWORD:"+pass;
    }

    public boolean equals(Object o){
        return this.uname.equals(((User)(o)).uname)&&this.pass.equals(((User)(o)).pass);
    }
}
