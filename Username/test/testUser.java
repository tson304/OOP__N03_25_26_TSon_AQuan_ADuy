package Username.test;
import Username.src.User;

public class testUser{
    public static void main(String[] args){
        User user1 =new User("anhquan","12345");
        System.out.println("ten tai khoan:"+ user1.getuserName());
        System.out.println("mat khau:"+ user1.getpassword());

        user1.setuserName("le anh quan");
        user1.setpassword("anhquannn");
        
        System.out.println("ten tai khoan sau sua:"+ user1.getuserName());
        System.out.println("mat khau sau sua:"+ user1.getpassword());


    }
}