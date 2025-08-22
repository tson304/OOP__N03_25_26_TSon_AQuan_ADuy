public class NguoiDung {
    public string tenNguoiDung;
    public string ngaySinh;
    public string gioiTinh;

    public NguoiDung (string tenNguoiDung, string ngaySinh; string gioiTinh){
        this.tenNguoiDung = tenNguoiDung;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;   
    }
    public string getTenNguoiDung(){
        return tenNguoiDung;
    }
    public void setTennguoidung (string tenNguoiDung){
        this.tenNguoiDung = tenNguoiDung;
    }
    public string getNgaySinh(){
        return ngaySinh;
    }
    public void setNgaySinh(string ngaySinh){
        this.ngaySinh = ngaySinh;
    }
    public string getGioiTinh(){
        return gioiTinh;
    }
    public void setGioiTinh(string gioiTinh){
        this.gioiTinh = gioiTinh;
    }
    public void hienthiThongTin(){
        System.out.println("Ten nguoi dung: " + tenNguoiDung);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Gioi tinh: " + gioiTinh);
    }

}
