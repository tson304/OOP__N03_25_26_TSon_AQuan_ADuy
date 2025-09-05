public class TestUser {
    public static void main(String[] args) {
        User user1 = new User("23017229", "TranSon", "123456bn");

        System.out.println("ID: " + user1.get_userID());
        System.out.println("Username: " + user1.get_userName());
        System.out.println("Password: " + user1.get_userPassword());
    }
}
