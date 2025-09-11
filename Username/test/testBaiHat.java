package Username.test;

import Username.src.BaiHat;

public class testBaiHat {
    public static void main(String[] args) {
        BaiHat bai1 = new BaiHat(01,"no name","ch co ten",200,"ch co");
        BaiHat bai2 = new BaiHat(02, "buong doi tay nhau ra", "Son Tung", 300, "pop");

        bai1.hienThiThongTin();
        bai2.hienThiThongTin();
        bai1.play();
        bai1.stop();
        bai2.play();
        bai2.pause();


    }
}
