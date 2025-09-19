package model;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNguoiDung {
    private ArrayList<NguoiDung> danhSach;

    public DanhSachNguoiDung() {
        danhSach = new ArrayList<>();
    }

    public void themNguoiDung(NguoiDung nd) {
        danhSach.add(nd);
        System.out.println("Đã thêm người dùng.");
    }

    public void hienThiTatCa() {
        System.out.println("Danh sách người dùng:");
        for (NguoiDung nd : danhSach) {
            nd.hienThiThongTin();
        }
    }

    public NguoiDung timTheoMa(String ma) {
        for (NguoiDung nd : danhSach) {
            if (nd.getMaNguoiDung().equalsIgnoreCase(ma)) {
                return nd;
            }
        }
        return null;
    }

    public void capNhatNguoiDung(String ma, Scanner sc) {
        NguoiDung nd = timTheoMa(ma);
        if (nd != null) {
            System.out.print("Nhập tên mới: ");
            nd.setTenNguoiDung(sc.nextLine());
            System.out.print("Nhập ngày sinh mới: ");
            nd.setNgaySinh(sc.nextLine());
            System.out.print("Nhập giới tính mới: ");
            nd.setGioiTinh(sc.nextLine());
            System.out.println("Đã cập nhật thông tin.");
        } else {
            System.out.println("Không tìm thấy người dùng để cập nhật.");
        }
    }

    public void xoaNguoiDung(String ma) {
        NguoiDung nd = timTheoMa(ma);
        if (nd != null) {
            danhSach.remove(nd);
            System.out.println("Đã xóa người dùng.");
        } else {
            System.out.println("Không tìm thấy người dùng để xóa.");
        }
    }
}

