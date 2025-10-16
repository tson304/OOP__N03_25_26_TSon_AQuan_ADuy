package    com.example.servingwebcontent.Controller;

import java.util.Scanner;

public class LayDuLieu {
    private Scanner sc;
    public LayDuLieu() {
        sc = new Scanner(System.in);
    }   
    public int laySoNguyen(String thongBao) {
        System.out.print(thongBao);
        int so = sc.nextInt();
        sc.nextLine(); 
        return so;
    }
    public String layChuoi(String thongBao) {
        System.out.print(thongBao);
        return sc.nextLine();
    }
    public double laySoThuc(String thongBao) {
        System.out.print(thongBao);
        double so = sc.nextDouble();
        sc.nextLine(); 
        return so;
    }
    public BaiHat layBaiHat() {
        int id = laySoNguyen("Nhap id: ");
        String tenBaiHat = layChuoi("Nhap ten bai hat: ");
        String tenCaSi = layChuoi("Nhap ten ca si: ");
        int thoiLuong = laySoNguyen("Nhap thoi luong (giay): ");
        String theLoai = layChuoi("Nhap the loai: ");
        return new BaiHat(id, tenBaiHat, tenCaSi, thoiLuong, theLoai);
    }
    public String layTenCaSi() {
        return layChuoi("Nhap ten ca si moi: ");
    }
    public String layTenBaiHat() {
        return layChuoi("Nhap ten bai hat moi: ");
    }
    public int layThoiLuong() {
        return laySoNguyen("Nhap thoi luong moi (giay): ");
    }
    public String layTheLoai() {
        return layChuoi("Nhap the loai moi: ");
    }
}
