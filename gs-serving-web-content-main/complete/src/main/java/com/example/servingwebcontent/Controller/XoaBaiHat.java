package com.example.servingwebcontent.Controller;
public class XoaBaiHat {
    private DsBaiHat ds;

    public XoaBaiHat(DsBaiHat ds) {
        this.ds = ds;
    }
    public DsBaiHat getDs() {
        return ds;
    }
    public void XoaIndex(int index){
        for (int i = index; i < ds.getSoLuongBaiHat()-1; i++) {
           ds.getDsBaiHat()[i] = ds.getDsBaiHat()[i + 1];
            }
        ds.getDsBaiHat()[ds.getSoLuongBaiHat() - 1] = null;
        ds.setSoLuongBaiHat(ds.getSoLuongBaiHat() - 1);
    }
    public void xoaBaiHatTheoId(int id) {
        int index = -1;        
        for (int i = 0; i < ds.getSoLuongBaiHat(); i++) {
            if (ds.getDsBaiHat()[i].getId() == id) {
                index = i;
                break;
            }}
        if (index != -1) {
            XoaIndex(index);
            System.err.println("Xóa bài hát có mã: " + id + " thành công!");
        } else {
            System.out.println("Không tìm thấy bài hát với mã: " + id);
        }
    }
    public void xoaBaiHatTheoTen(String tenBaiHat) {
        int index = -1;
        for (int i = 0; i < ds.getSoLuongBaiHat(); i++) {
            if (ds.getDsBaiHat()[i].getTenBaiHat().equals(tenBaiHat)) {
                index = i;
                break;
            }}
            if (index != -1) {
                XoaIndex(index);
                System.err.println("Xóa bài hát có tên: " + tenBaiHat + " thành công!");
            }else {
                System.out.println("Không tìm thấy bài hát với tên: " + tenBaiHat);
            }
    }
}

