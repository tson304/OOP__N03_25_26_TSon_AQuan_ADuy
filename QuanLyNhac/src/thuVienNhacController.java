import java.util.Scanner;

public class thuVienNhacController {
    public void dsNguoiDung() {
        Scanner userInput = new Scanner(System.in);
        
        thuVienNhac dsNguoiDung = new DanhSachBaiHat();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("___ QUAN LY DANH SACH NGUOI DUNG ___");
            System.out.println("1. Hien thi danh sach nguoi dung");
            System.out.println("2. Them nguoi dung");
            System.out.println("3. Xoa nguoi dung");
            System.out.println("4. Sua nguoi dung");
            System.out.println("5. Thoat");

            System.out.print("Lua chon: ");
            int choice = userInput.nextInt();
            userInput.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.println("Danh sach nguoi dung: " + dsNguoiDung.layDanhSachPhanTu());
                    break;
                case 2:
                    System.out.print("Nhap ten nguoi dung moi: ");
                    String themPhanTu = userInput.nextLine();
                    dsNguoiDung.themPhanTu(themPhanTu);
                    break;
                case 3:
                    System.out.print("Nhap ten nguoi dung can xoa: ");
                    String xoaPhanTu = userInput.nextLine();
                    dsNguoiDung.xoaPhanTu(xoaPhanTu);
                    break;
                case 4:
                    System.out.print("Nhap ten nguoi dung can sua: ");
                    String tenPhanTu = userInput.nextLine();
                    System.out.print("Nhap ten nguoi dung moi: ");
                    String tenPhanTuMoi = userInput.nextLine();
                    dsNguoiDung.suaPhanTu(tenPhanTu, tenPhanTuMoi);
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Sai cu phap!");
            }
        }
        userInput.close();
    }

    public void danhSachBaiHat() {
        Scanner userInput = new Scanner(System.in);
        
        thuVienNhac dsBaiHat = new DanhSachBaiHat();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("___ QUAN LY DANH SACH BAI HAT___");
            System.out.println("1. Hien thi danh sach bai hat");
            System.out.println("2. Them bai hat");
            System.out.println("3. Xoa bai hat");
            System.out.println("4. Sua bai hat");
            System.out.println("5. Thoat");

            System.out.print("Lua chon: ");
            int choice = userInput.nextInt();
            userInput.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.println("Danh sach bai hat: " + dsBaiHat.layDanhSachPhanTu());
                    break;
                case 2:
                    System.out.print("Nhap ten bai hat moi: ");
                    String themPhanTu = userInput.nextLine();
                    dsBaiHat.themPhanTu(themPhanTu);
                    break;
                case 3:
                    System.out.print("Nhap ten bai hat can xoa: ");
                    String xoaPhanTu = userInput.nextLine();
                    dsBaiHat.xoaPhanTu(xoaPhanTu);
                    break;
                case 4:
                    System.out.print("Nhap ten bai hat can sua: ");
                    String tenPhanTu = userInput.nextLine();
                    System.out.print("Nhap ten bai hat moi: ");
                    String tenPhanTuMoi = userInput.nextLine();
                    dsBaiHat.suaPhanTu(tenPhanTu, tenPhanTuMoi);
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Sai cu phap!");
            }
        }
        userInput.close();
    }
}
