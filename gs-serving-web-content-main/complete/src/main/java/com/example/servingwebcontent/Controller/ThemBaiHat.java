package com.example.servingwebcontent.Controller;

public class ThemBaiHat  {
    private DsBaiHat ds;

    public ThemBaiHat(DsBaiHat ds) {
        this.ds = ds;
    }
    public void themBaiHat(BaiHat baiHat) {
        if (ds.getSoLuongBaiHat() < ds.getDsBaiHat().length) {
            ds.getDsBaiHat()[ds.getSoLuongBaiHat()] = baiHat;
            ds.setSoLuongBaiHat(ds.getSoLuongBaiHat() + 1);
            System.err.println("Thêm bài hát "+baiHat.getTenBaiHat()+" thành công!");
        } else {
            System.out.println("Danh sách bài hát đã đầy, không thể thêm bài hát mới.");
        }
    }
}