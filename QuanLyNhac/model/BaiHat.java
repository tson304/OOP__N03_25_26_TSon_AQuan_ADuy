

public class BaiHat {
    private int id;
    private String tenBaiHat;
    private String tenCaSi;
    private int thoiLuong;
    private String theLoai;

    public BaiHat (int id, String tenBaiHat,String tenCaSi,int thoiLuong,String theLoai){
        this.id=id;
        this.tenBaiHat = tenBaiHat;
        this.tenCaSi = tenCaSi;
        this.thoiLuong = thoiLuong;
        this.theLoai = theLoai;
        
    }
        public int getId() {
        return id;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public String getTheLoai() {
        return theLoai;
    }
    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
    public void hienThiThongTin() {
        System.out.println("Tên bài hát:"+ tenBaiHat);
        System.out.println("Tên người hat:"+ tenCaSi);
        System.out.println("Thể loại:"+ theLoai);
        System.out.println("Thời Lượng:"+ thoiLuong + "giây");
    }

}







