package test;

import src.NguoiDung;
import src.DanhSachNguoiDung;
import java.util.Scanner;

public class TestNguoiDung {
    public static void main(String[] args) {
        DanhSachNguoiDung ds = new DanhSachNguoiDung();
        Scanner sc = new Scanner(System.in);

    
        ds.themNguoiDung(new NguoiDung("ND01", "Lê Anh Duy", "09/04/2005", "Nam"));
        ds.themNguoiDung(new NguoiDung("ND02", "Trần Thị Nga", "10/10/2006", "Nữ"));
        ds.themNguoiDung(new NguoiDung("ND03", "Bùi Minh Phương", "23/02/2006", "Nữ"));

   
        ds.hienThiTatCa();

    
        System.out.print("Nhập mã người dùng cần sửa: ");
        String sua = sc.nextLine();
        ds.capNhatNguoiDung(sua, sc);


        System.out.print("Nhập mã người dùng cần xóa: ");
        String xoa = sc.nextLine();
        ds.xoaNguoiDung(xoa);

 
        ds.hienThiTatCa();

        sc.close();
    }
}
