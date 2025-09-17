import java.util.ArrayList;
import java.util.Scanner;

public class testThuVienNhac {
    Scanner userInput = new Scanner(System.in);

    private ArrayList<thuVienNhac> danhSachThuVien = new ArrayList<thuVienNhac>();

    public ArrayList<thuVienNhac> addList(){
        thuVienNhac thuVien_1 = new thuVienNhac("TranSon");
        thuVienNhac thuVien_2 = new thuVienNhac("Sora");
        thuVienNhac thuVien_3 = new thuVienNhac("Bibo");

        danhSachThuVien.add(thuVien_1);
        danhSachThuVien.add(thuVien_2);
        danhSachThuVien.add(thuVien_3);

        return danhSachThuVien;
    }

    public void giaoDien(){
        boolean isRunning = true;
        int choice;

        ArrayList<thuVienNhac> ds = this.addList();

        thuVienNhac nguoiDung = ds.get(0);

        System.out.println("________________________________________________________________________________________________________________________");
        System.out.println("Danh sach bai hat cua " + nguoiDung.layTenNguoiDung() + " (So luong: " + nguoiDung.layDanhSachBaiHat().size() + " bai hat)");
        System.out.println(nguoiDung.layDanhSachBaiHat());
        System.out.println("________________________________________________________________________________________________________________________");
        System.out.println("Chuc nang: ");
        System.out.println("1. Danh sach bai hat");
        System.out.println("2. Them bai hat");
        System.out.println("3. Xoa bai hat");
        System.out.println("4. Thoat");
        System.out.println("________________________________________________________________________________________________________________________");
        
        while (isRunning) {
            boolean option = true;
            System.out.print("Lua chon: ");
            choice = userInput.nextInt();
            userInput.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("----> ");
                    System.out.println("Danh sach bai hat (So luong: " + nguoiDung.layDanhSachBaiHat().size() + " bai hat)\n" + nguoiDung.layDanhSachBaiHat());
                    System.out.println("________________________________________________________________________________________________________________________");
                    break;
                case 2:
                    while (option) {
                        System.out.println("Nhap (quit) de quay lai");
                        System.out.print("Nhap bai hat can them: ");
                        String themBaiHat = userInput.nextLine();

                        if (themBaiHat.equals("quit")) {
                            System.out.println("________________________________________________________________________________________________________________________");
                            option = false;
                            break;
                        }

                        nguoiDung.themBaiHat(themBaiHat);
                        System.out.print("----> ");
                        System.out.println("Da them: " + themBaiHat);
                        System.out.println("________________________________________________________________________________________________________________________");
                    }
                    break;
                case 3:
                    System.out.println("Nhap (quit) de quay lai");
                    System.out.println("Danh sach bai hat: \n" + nguoiDung.layDanhSachBaiHat());
                    System.out.print("Nhap bai hat can xoa: ");
                    String xoaBaiHat = userInput.nextLine();

                    if (xoaBaiHat.equals("quit")) {
                        System.out.println("________________________________________________________________________________________________________________________");
                        option = false;
                        break;
                    }

                    nguoiDung.xoaBaiHat(xoaBaiHat);
                    System.out.print("----> ");
                    System.out.println("Da xoa: " + xoaBaiHat);
                    System.out.println("________________________________________________________________________________________________________________________");

                    break;
                case 4:
                    System.out.print("----> ");
                    System.out.println("Hen gap lai!");
                    isRunning = false;
                    break;
                default:
                    System.out.print("----> ");
                    System.out.println("Sai cu phap!");
                    System.out.println("________________________________________________________________________________________________________________________");
                    break;
            }
        }

        userInput.close();
    }
}


