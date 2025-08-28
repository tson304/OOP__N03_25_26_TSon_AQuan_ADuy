public class BaiHat {
    public String tenBaiHat;
    public String tenCaSi;
    public int thoiLuong;
    public String theLoai;

    public BaiHat (String tenBaiHat,String tenCaSi,int thoiLuong,String theLoai){
        this.tenBaiHat = tenBaiHat;
        this.tenCaSi = tenCaSi;
        this.thoiLuong = thoiLuong;
        this.theLoai = theLoai;
    }
    public void hienThiThongTin() {
        System.out.println("Tên bài hát:"+ tenBaiHat);
        System.out.println("Tên người hat:"+ tenCaSi)
        System.out.println("Thể loại:"+ theLoai)
        System.out.println("Thời Lượng:"+ thoiLuong + "giây");
    }
    @Override
    public String toString(){
        return tenBaiHat + "-" + tenCaSi + "(" + theLoai +","+ thoiLuong + "s )"
        }
}







