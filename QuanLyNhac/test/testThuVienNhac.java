import java.util.*;

public class testThuVienNhac {
    Scanner userInput = new Scanner(System.in);

    public void quanLyNguoiDung(){
        boolean isRunning = true;
        boolean option = true;
        int choice;
        thuVienNhac nguoiDung = new thuVienNhac();
        
        while (isRunning) {
            System.out.println("________________________________________________________________________________________________________________________");
            System.out.println("                                              QUAN LY NHAC                                                              ");
            System.out.println("________________________________________________________________________________________________________________________");
            System.out.println("Chuc nang: ");
            System.out.println("1. Danh sach nguoi dung");
            System.out.println("2. Them nguoi dung");
            System.out.println("3. Thoat");
            System.out.println("________________________________________________________________________________________________________________________");
            System.out.print("Lua chon: ");
            choice = userInput.nextInt();
            userInput.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("----> ");
                    System.out.println("Danh sach nguoi dung (So luong: " + nguoiDung.layDanhSachNguoiDung().size() + " nguoi dung)\n" + nguoiDung.layDanhSachNguoiDung());
                    System.out.println("________________________________________________________________________________________________________________________");
                    break;
                case 2:
                    while (option) {
                        System.out.println("Nhap (quit) de quay lai");
                        System.out.print("Nhap ten nguoi dung moi: ");
                        String themNguoiDung = userInput.nextLine();

                        if (themNguoiDung.equals("quit")) {
                            System.out.println("________________________________________________________________________________________________________________________");
                            option = false;
                            break;
                        }

                        nguoiDung.themNguoiDung(themNguoiDung);
                        System.out.print("----> ");
                        System.out.println("Da them: " + themNguoiDung);
                        System.out.println("________________________________________________________________________________________________________________________");
                    }
                    break;
                case 3:
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
    }

    private void quanLyBaiHat(String tenNguoiDung){
        boolean option = true;
        int choice;
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("________________________________________________________________________________________________________________________");
            System.out.println("Danh sach bai hat cua " + tenNguoiDung + " (So luong: " + tenNguoiDung.layDanhSachBaiHat().size() + " bai hat)");
            System.out.println("________________________________________________________________________________________________________________________");
            System.out.println("Chuc nang: ");
            System.out.println("1. Danh sach bai hat");
            System.out.println("2. Them bai hat");
            System.out.println("3. Xoa bai hat");
            System.out.println("4. Thoat");
            System.out.println("________________________________________________________________________________________________________________________");
            System.out.print("Lua chon: ");
            choice = userInput.nextInt();
            userInput.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("----> ");
                    System.out.println("Danh sach bai hat (So luong: " + tenNguoiDung.layDanhSachBaiHat().size() + " bai hat)\n" + tenNguoiDung.layDanhSachBaiHat());
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

                        tenNguoiDung.themBaiHat(themBaiHat);
                        System.out.print("----> ");
                        System.out.println("Da them: " + themBaiHat);
                        System.out.println("________________________________________________________________________________________________________________________");
                    }
                    break;

                case 3:
                    while(option) {
                        System.out.println("Nhap (quit) de quay lai");
                        System.out.println("Danh sach bai hat: \n" + tenNguoiDung.layDanhSachBaiHat());
                        System.out.print("Nhap bai hat can xoa: ");
                        String xoaBaiHat = userInput.nextLine();

                        if (xoaBaiHat.equals("quit")) {
                            System.out.println("________________________________________________________________________________________________________________________");
                            option = false;
                            break;
                        }

                        tenNguoiDung.xoaBaiHat(xoaBaiHat);
                        System.out.print("----> ");
                        System.out.println("Da xoa: " + xoaBaiHat);
                        System.out.println("________________________________________________________________________________________________________________________");
                    }
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


