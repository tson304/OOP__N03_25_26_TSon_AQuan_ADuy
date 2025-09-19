import java.util.Scanner;

public class thuVienNhacController {
    public void dsNguoiDung() {
        Scanner userInput = new Scanner(System.in);
        
        DanhSach dsNguoiDung = new DanhSachNguoiDung();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("___ QUAN LY DANH SACH ___");
            System.out.println("1. Hien thi danh sach");
            System.out.println("2. Them phan tu");
            System.out.println("3. Xoa phan tu");
            System.out.println("4. Sua phan tu");
            System.out.println("5. Thoat");

            System.out.print("Lua chon: ");
            int choice = userInput.nextInt();
            userInput.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.println("Danh sach: " + dsNguoiDung.layDanhSachPhanTu());
                    break;
                case 2:
                    System.out.print("Nhap ten danh sach moi: ");
                    String themPhanTu = userInput.nextLine();
                    dsNguoiDung.themPhanTu(themPhanTu);
                    break;
                case 3:
                    System.out.print("Nhap ten danh sach can xoa: ");
                    String xoaPhanTu = userInput.nextLine();
                    dsNguoiDung.xoaPhanTu(xoaPhanTu);
                    break;
                case 4:
                    System.out.print("Nhap ten danh sach can sua: ");
                    String tenPhanTu = userInput.nextLine();
                    System.out.print("Nhap ten danh sach moi: ");
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
}
