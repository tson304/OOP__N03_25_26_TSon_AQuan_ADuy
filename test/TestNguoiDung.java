package test;

import src.NguoiDung;
import src.DanhSachNguoiDung;
import java.util.Scanner;

public class TestNguoiDung {
    public static void main(String[] args) {
        DanhSachNguoiDung ds = new DanhSachNguoiDung();
        Scanner sc = new Scanner(System.in);

        // Thêm dữ liệu mẫu
        ds.themNguoiDung(new NguoiDung("ND01", "Nguyễn Văn A", "01/01/2000", "Nam"));
        ds.themNguoiDung(new NguoiDung("ND02", "Trần Thị B", "10/10/2001", "Nữ"));

        // Hiển thị tất cả
        ds.hienThiTatCa();

        // Cập nhật
        System.out.print("\n📝 Nhập mã người dùng cần sửa: ");
        String sua = sc.nextLine();
        ds.capNhatNguoiDung(sua, sc);

        // Xóa
        System.out.print("\n🗑 Nhập mã người dùng cần xóa: ");
        String xoa = sc.nextLine();
        ds.xoaNguoiDung(xoa);

        // Hiển thị sau khi cập nhật
        ds.hienThiTatCa();

        sc.close();
    }
}
