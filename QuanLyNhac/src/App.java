import model.thuVienNhac;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        thuVienNhac baiHat1 = new thuVienNhac("Son Tung MTP", "Pop", "Dung lam trai tim anh dau");
        thuVienNhac baiHat2 = new thuVienNhac("Son Tung MTP", "Pop", "Chung ta cua hien tai");
        thuVienNhac baiHat3 = new thuVienNhac("Mono", "Pop", "Cham hoa");

        System.out.println(baiHat1.getBaiHat());
        System.out.println(baiHat1.getCaSi());
        System.out.println(baiHat1.getTheLoai());

        System.out.println("------------------------------");

        System.out.println(baiHat2.getBaiHat());
        System.out.println(baiHat2.getCaSi());
        System.out.println(baiHat2.getTheLoai());

        System.out.println("------------------------------");

        System.out.println(baiHat3.getBaiHat());
        System.out.println(baiHat3.getCaSi());
        System.out.println(baiHat3.getTheLoai());
        */
        System.out.println("USER CALL");
        User user1 = new User("23017229", "TranSon", "123456bn");

        System.out.println("ID: " + user1.get_userID());
        System.out.println("Username: " + user1.get_userName());
        System.out.println("Password: " + user1.get_userPassword());
        System.out.println("");

        System.out.println("TIME CALL");
        Time t1 = new Time();
        Time t2 = new Time(20, 3, 45);

        t1.setHour(7).setMinute(32).setSecond(23);
        System.out.println("t1 is " + t1);
        System.out.println("t2 is " + t2);
        System.out.println("");

        System.out.println("RECURSION CALL");
        Recursion.f(new Object[] {"one", "two", "three"}, 0);
        Recursion.f(new Object[] {1, "two", 3.5}, 0);
        Recursion.f(new Object[] {"one", new Recursion(), 3.5}, 0);
    }

}
