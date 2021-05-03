public class DatabaseManipulator {
    
    //All the UserDao methods
    public User selectByUserId(String userid){
        UserDao dao = new UserDao();
        return dao.selectByUserId(userid);
    }

    public static void main(String[] args){
        DatabaseManipulator dm = new DatabaseManipulator();
        //Test UserDao
        System.out.println(dm.selectByUserId("bdugan"));
    }

}
