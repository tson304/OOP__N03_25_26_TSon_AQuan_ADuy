package model;

public class User implements PeopleInterface {
    private String Full_name;
    private String Date_of_birth;
    private String Identity;

    public User(String Full_name, String Date_of_birth, String Identity) {
        this.Full_name = Full_name;
        this.Date_of_birth = Date_of_birth;
        this.Identity = Identity;
    }

    public String getFull_name() {
        return Full_name;
    }

    public void setFull_name(String Full_name) {
        this.Full_name = Full_name;
    }

    public String getDate_of_birth() {
        return Date_of_birth;
    }

    public void setDate_of_birth(String Date_of_birth) {
        this.Date_of_birth = Date_of_birth;
    }

    public String getIdentity() {
        return Identity;
    }

    public void setIdentity(String Identity) {
        this.Identity = Identity;
    }

    @Override
    public void setInfo(String Identity) {
        this.Identity = Identity;
    }

    @Override
    public String getInfo(String identity) {
        if (this.Identity.equals(identity)) {
            return "Tên: " + Full_name + ", Ngày sinh: " + Date_of_birth + ", Mã định danh: " + Identity;
        }
        return "Không tìm thấy người dùng với mã: " + identity;
    }

    @Override
    public String toString() {
        return Full_name + " (" + Date_of_birth + ", " + Identity + ")";
    }
}
