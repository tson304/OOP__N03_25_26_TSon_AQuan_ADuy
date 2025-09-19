import java.util.*;

public abstract class DanhSach {
    public List<String> danhSach = new ArrayList<>();

    public List<String> layDanhSachPhanTu() {
        return danhSach;
    }

    public void themPhanTu(String tenPhanTu) {
        danhSach.add(tenPhanTu);
    }

    public void xoaPhanTu(String tenPhanTu) {
        danhSach.remove(tenPhanTu);
    }

    public void suaPhanTu(String tenPhanTu, String tenPhanTuMoi) {
        int i = danhSach.indexOf(tenPhanTu);
        danhSach.set(i, tenPhanTuMoi);
    }
}

class DanhSachNguoiDung extends DanhSach {}
class DanhSachBaiHat extends DanhSach {}
