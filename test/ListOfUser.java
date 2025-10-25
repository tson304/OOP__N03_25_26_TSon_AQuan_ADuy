package test;

import model.User;
import java.util.ArrayList;

public class ListOfUser {
    private ArrayList<User> ds;
toms 
    public ListOfUser() {
        ds = new ArrayList<>();
    }

    public void them(User u) {
        ds.add(u);
    }

    public void hienThiTatCa() {
        for (User u : ds) {
            u.hienThi();
        }
    }

    public void timTheoID(String id) {
        for (User u : ds) {
            if (u.getIdentity().equals(id)) {
                System.out.println(u.getInfo(id));
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng với ID: " + id);
    }
}
