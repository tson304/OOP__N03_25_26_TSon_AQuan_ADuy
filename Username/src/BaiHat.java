package Username.src;

public class BaiHat implements PlaySong {
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
    public void setId(int id){
        this.id=id;
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
    @Override
    public void hienThiThongTin() {
        System.out.println("Tên bài hát:"+ tenBaiHat);
        System.out.println("Tên người hat:"+ tenCaSi);
        System.out.println("Thể loại:"+ theLoai);
        System.out.println("Thời Lượng:"+ thoiLuong + " giây");
    }
    @Override
    public void play(){
        System.err.println("Dang phat bai:"+tenBaiHat);
    }
    @Override
    public void pause(){
        System.err.println("dang tam dung bai"+tenBaiHat);
    }
     @Override
    public void stop(){
        System.err.println("dung phat bai"+tenBaiHat);
    }

}
