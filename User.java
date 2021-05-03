public class User{

    public String USERID;
    public String PASSWORD;

    public User(String u, String p){
        USERID=u;
        PASSWORD=p;
    }

    public String toString(){
        return "USERID:"+USERID+" PASSWORD:"+PASSWORD;
    }
}