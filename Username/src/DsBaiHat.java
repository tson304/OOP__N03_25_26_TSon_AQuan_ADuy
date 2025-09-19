package Username.src;

public class DsBaiHat {
    private BaiHat[] ds;
    private int soLuong;
    public DsBaiHat() {
        ds = new BaiHat[100]; // Giả sử tối đa 100 bài hát
        soLuong = 0;
        ds[soLuong++] = new BaiHat(1,"abc","abc",200,"abc");
        ds[soLuong++] = new BaiHat(2,"def","def",300,"def");
        ds[soLuong++] = new BaiHat(3,"ghi","ghi",400,"ghi");
        ds[soLuong++] = new BaiHat(4,"jkl","jkl",500,"jkl");
        ds[soLuong++] = new BaiHat(5,"mno","mno",600,"mno");
        ds[soLuong++] = new BaiHat(6,"pqr","pqr",700,"pqr");   
        ds[soLuong++] = new BaiHat(7,"stu","stu",800,"stu");
        ds[soLuong++] = new BaiHat(8,"vwx","vwx",900,"vwx");
        ds[soLuong++] = new BaiHat(9,"yz","yz",1000,"yz");
    
    }
    public BaiHat[] getDsBaiHat() {
        return ds;
    }
    public int getSoLuongBaiHat() {
        return soLuong;
    }
    public void setDsBaiHat(BaiHat[] ds) {
        this.ds = ds;
    }
    public void setSoLuongBaiHat(int soLuong) {
        this.soLuong = soLuong;
    }
    public BaiHat timBaiHat(int id) {
        for (int i=0; i < soLuong; i++) {
            if (ds[id].getId() == id) {
                return ds[id];
        }}
        return null; 
}
}
