import model.thuVienNhac;

public class App {
    public static void main(String[] args) throws Exception {
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

    }
}
