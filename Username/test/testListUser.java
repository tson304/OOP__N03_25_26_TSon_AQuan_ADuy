package Username.test;

import Username.hoc.Identity;
import Username.hoc.ListOfUser;
import Username.hoc.User;
class testListUser {

    public static void main(String[] args) {
        Identity id1 =new Identity("01");
        Identity id2 =new Identity("02");

        User user1 =new User("Le Anh Quan", "27/10/2005", id1, "sinh vien");
        User user2 =new User("A B C", "2/12/2004", id2, "hoc sinh");
        User user3=new User("A N I", "1/2/1998", id2, "giao vien");

        ListOfUser list =new ListOfUser();
        list.addUser(user1);
        list.addUser(user2);
        list.addUser(user3);

        System.err.println("danh sach user:");
        list.printUser();
    }
}