import TEST.TestCallback;
import TEST.TestSequence;

public class App {
    public static void main(String[] args) throws Exception {
        // Test User
        //testUser user = new testUser();
        //user.User();
        
        // Test Time
        //testTime time = new testTime();
        //time.Time();

        // Test Recursion
        //testRecursion.Recursion();

        // Test thư viện nhạc (Trần Đức Thái Sơn - 23017229)
        // thuVienNhacController test = new thuVienNhacController();
        // test.dsNguoiDung();
        // test.danhSachBaiHat();
        System.out.println("TEST SEQUENCE: ");
        TestSequence.test();

        System.out.println();

        System.out.println("TEST CALLBACK: ");
        TestCallback.test();
    }
}
