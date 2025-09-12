
package Username.test;
import Username.src.Identity;
import Username.src.User;

public class testUser{
    public static void main(String[] args){
        Identity id1 =new Identity("01");
        Identity id2 =new Identity("02");

        User user1 =new User("Le Anh Quan", "27/10/2005", id1, "sinh vien");
        User user2 =new User("A B C", "2/12/2004", id2, "hoc sinh");

        System.err.println(user1);
        System.err.println(user2);
    }
}