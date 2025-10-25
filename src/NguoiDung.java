package src;

public class NguoiDung {
    private String maNguoiDung;
    private String tenNguoiDung;
    private String ngaySinh;
    private String gioiTinh;

    public NguoiDung(String maNguoiDung, String tenNguoiDung, String ngaySinh, String gioiTinh) {
        this.maNguoiDung = maNguoiDung;
        this.tenNguoiDung = tenNguoiDung;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public String getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(String maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void hienThiThongTin() {
        System.out.println("Mã: " + maNguoiDung + " | Tên: " + tenNguoiDung + " | Ngày sinh: " + ngaySinh + " | Giới tính: " + gioiTinh);
    }

    @Override
    public String toString() {
        return maNguoiDung + " - " + tenNguoiDung + " (" + gioiTinh + ", " + ngaySinh + ")";
    }

}
