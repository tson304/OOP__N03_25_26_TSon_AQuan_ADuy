package Username.src;

public class User{
    private String userName;
    private String password;
    

    public User( String userName, String password){
        this.userName= userName;
        this.password= password;
    }
    
    public String getuserName() {
        return userName;
    }
    
    public String getpassword() {
        return password;
    }
    public void setuserName(String userName){
        this.userName=userName;
    }
    public void setpassword(String password){
        this.password=password;
    }
}