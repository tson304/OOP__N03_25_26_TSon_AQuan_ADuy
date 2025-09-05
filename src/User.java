public class User {
    private String tenNguoiDung;
    private String ngaySinh;
    private String gioiTinh;

    public User(String tenNguoiDung, String ngaySinh, String gioiTinh) {
        this.tenNguoiDung = tenNguoiDung;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
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
        System.out.println("Tên người dùng: " + tenNguoiDung);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Giới tính: " + gioiTinh);
    }

    @Override
    public String toString() {
        return tenNguoiDung + " (" + gioiTinh + ", " + ngaySinh + ")";
    }
}
