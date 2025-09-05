public class User {
    private String userID;
    private String userName;
    private String userPassword;

    public User(){}

    public User(String userID, String userName, String userPassword) {
        this.userID = userID;
        this.userName = userName;
        this.userPassword = userPassword;
    }
    
    public void set_userName(String userName, String userPassword, String userID){
        this.userName = userName;
        this.userPassword = userPassword;
        this.userID = userID;
    }

    public String get_userName(){
        return userName;
    }
    public String get_userPassword(){
        return userPassword;
    }
    public String get_userID(){
        return userID;
    }

   
}
