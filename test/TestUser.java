package test;

import model.User;

public class TestUser {
    public static void test() {
        User u = new User("Nguyễn Văn A", "01/01/2000", "ID001", "admin");
        u.hienThi();
    }
}
