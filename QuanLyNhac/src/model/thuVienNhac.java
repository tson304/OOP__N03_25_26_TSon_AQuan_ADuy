package model;

public class thuVienNhac {
    private String caSi;
    private String theLoai;
    private String baiHat;

    public thuVienNhac(){}
    
    public thuVienNhac(String caSi, String theLoai, String baiHat){
        this.caSi = caSi;
        this.theLoai = theLoai;
        this.baiHat = baiHat;
    }

    public String getCaSi() {
        return caSi;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public String getBaiHat() {
        return baiHat;
    }
}