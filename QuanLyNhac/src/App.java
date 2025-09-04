public class App {
    public static void main(String[] args) throws Exception {
        thuVienNhac baiHat1 = new thuVienNhac("Son Tung MTP", "Pop", "Dung lam trai tim anh dau");
        thuVienNhac baiHat2 = new thuVienNhac("Son Tung MTP", "Pop", "Chung ta cua hien tai");
        thuVienNhac baiHat3 = new thuVienNhac("Mono", "Pop", "Cham hoa");

        System.out.println(baiHat1.baiHat);
        System.out.println(baiHat1.caSi);
        System.out.println(baiHat1.theLoai);

        System.out.println("------------------------------");

        System.out.println(baiHat2.baiHat);
        System.out.println(baiHat2.caSi);
        System.out.println(baiHat2.theLoai);

        System.out.println("------------------------------");

        System.out.println(baiHat3.baiHat);
        System.out.println(baiHat3.caSi);
        System.out.println(baiHat3.theLoai);

    }
}
