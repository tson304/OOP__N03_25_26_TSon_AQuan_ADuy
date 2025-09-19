package Username.test;

import Username.src.DsBaiHat;
import Username.src.LayDuLieu;
import Username.src.SuaBaiHat;

public class testSuaBaiHat {
    public static void main(String[] args) {
        DsBaiHat ds = new DsBaiHat();
        System.out.println("Số bài hát trong ds: " + ds.getSoLuongBaiHat());
        LayDuLieu lay = new LayDuLieu();
        SuaBaiHat sua = new SuaBaiHat(ds);

        System.err.println("Trước khi sửa:");
        System.err.println(ds.getDsBaiHat()[2]);

        sua.suaTenBaiHat(2, lay.layTenBaiHat());
        sua.suaThoiLuong(2, lay.layThoiLuong());
        sua.suaTheLoai(2, lay.layTheLoai());
        sua.suaTenCaSi(2, lay.layTenCaSi());

        System.err.println("Sau khi sửa:");
        System.err.println(ds.getDsBaiHat()[2]);
    }
}