public class testUser {
    public void User() {
        System.out.println("USER CALL");
        User user1 = new User("23017229", "TranSon", "123456bn");

        System.out.println("ID: " + user1.get_userID());
        System.out.println("Username: " + user1.get_userName());
        System.out.println("Password: " + user1.get_userPassword());
        System.out.println("");
    }
}
