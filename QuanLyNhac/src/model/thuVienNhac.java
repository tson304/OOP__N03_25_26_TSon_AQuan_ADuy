import java.util.*;

public class thuVienNhac {
    private List<String> danhSachNguoiDung;
    private List<String> danhSachBaiHat;

    thuVienNhac() {
        this.danhSachNguoiDung = new ArrayList<>();
        this.danhSachBaiHat = new ArrayList<>();
    }
    
    public List<String> layDanhSachNguoiDung() {
        return danhSachNguoiDung;
    }

    public void themNguoiDung(String tenNguoiDung) {
        danhSachNguoiDung.add(tenNguoiDung);
    }

    public void xoaNguoiDung(String tenNguoiDung) {
        danhSachNguoiDung.remove(tenNguoiDung);
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