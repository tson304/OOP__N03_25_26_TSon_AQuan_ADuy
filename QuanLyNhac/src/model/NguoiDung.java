public class NguoiDung {
    private String tenNguoiDung;
    private String ngaySinh;
    private String gioiTinh;

    public NguoiDung (String tenNguoiDung, String ngaySinh; String gioiTinh){
        this.tenNguoiDung = tenNguoiDung;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;   
    }
    public String getTenNguoiDung(){
        return tenNguoiDung;
    }
    public void setTennguoidung (String tenNguoiDung){
        this.tenNguoiDung = tenNguoiDung;
    }
    public String getNgaySinh(){
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh){
        this.ngaySinh = ngaySinh;
    }
    public String getGioiTinh(){
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh){
        this.gioiTinh = gioiTinh;
    }
    public void hienthiThongTin(){
        System.out.println("Ten nguoi dung: " + tenNguoiDung);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Gioi tinh: " + gioiTinh);
    }

}


