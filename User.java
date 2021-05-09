public class User{

    public String USERID;
    public String PASSWORD;

    public User(String u, String p){
        USERID=u;
        PASSWORD=p;
    }
    
    public String getUSERID(){
        return USERID;
    }
    
    public String getPASSWORD(){
        return PASSWORD;
    }
    
    public void setUSERID(String u){
        USERID=u;
    }
    
    public void setPASSWORD(String p){
        PASSWORD=p;
    }

    public String toString(){
        return "USERID:"+USERID+" PASSWORD:"+PASSWORD;
    }
}