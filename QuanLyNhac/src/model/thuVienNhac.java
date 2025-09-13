import java.util.*;

public class thuVienNhac {
    private String tenNguoiDung;
    private List<String> danhSachBaiHat;

    thuVienNhac(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
        this.danhSachBaiHat = new ArrayList<>();
    }
    
    public String layTenNguoiDung() {
        return tenNguoiDung;
    }

    public List<String> layDanhSachBaiHat(){
        return danhSachBaiHat;
    }

    public void themBaiHat(String tenBaiHat) {
        danhSachBaiHat.add(tenBaiHat);
    }

    public void xoaBaiHat(String tenBaiHat) {
        danhSachBaiHat.remove(tenBaiHat);
    }
}