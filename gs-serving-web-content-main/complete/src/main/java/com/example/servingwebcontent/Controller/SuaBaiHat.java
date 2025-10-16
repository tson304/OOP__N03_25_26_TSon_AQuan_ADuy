package com.example.servingwebcontent.Controller;

public class SuaBaiHat {
    private DsBaiHat ds;

    public SuaBaiHat(DsBaiHat ds) {
        this.ds = ds;
    }
    public void suaTenBaiHat(int maSo, String tenMoi) {
        BaiHat baihat =ds.timBaiHat(maSo);
        if (baihat != null) {
                baihat.setTenBaiHat(tenMoi);
                System.out.println("Da sua ten bai hat thanh cong!");
                return;
            }
        
        System.out.println("Khong tim thay bai hat voi ma so: " + maSo);
    }
    public void suaTenCaSi(int maSo, String tenCaSiMoi) {
        BaiHat baihat =ds.timBaiHat(maSo);
        if (baihat != null) {
                baihat.setTenCaSi(tenCaSiMoi);
                System.out.println("Da sua ten ca si thanh cong!");
                return;
            }
        
        System.out.println("Khong tim thay bai hat voi ma so: " + maSo);
    }
    public void suaThoiLuong(int maSo, int thoiLuongMoi) {
        BaiHat baihat =ds.timBaiHat(maSo);
        if (baihat != null) {
                baihat.setThoiLuong(thoiLuongMoi);
                System.out.println("Da sua thoi luong thanh cong!");
                return;
            }
        
        System.out.println("Khong tim thay bai hat voi ma so: " + maSo);
    }
    public void suaTheLoai(int maSo, String theLoaiMoi) {
        BaiHat baihat =ds.timBaiHat(maSo);
        if (baihat != null) {
                baihat.setTheLoai(theLoaiMoi);
                System.out.println("Da sua the loai thanh cong!");
                return;
            }
        
        System.out.println("Khong tim thay bai hat voi ma so: " + maSo);
    }
}
   