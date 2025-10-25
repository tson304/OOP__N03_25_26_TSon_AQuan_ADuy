package model;

public class User implements PeopleInterface {
    private String fullName;
    private String dateOfBirth;
    private String identity;
    private String userRole;

    public User(String fullName, String dateOfBirth, String identity, String userRole) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.identity = identity;
        this.userRole = userRole;
    }

    @Override
    public void setInfo(String identity) {
        this.identity = identity;
    }

    @Override
    public String getInfo(String identity) {
        if (this.identity.equals(identity)) {
            return "Tên: " + fullName + " | Ngày sinh: " + dateOfBirth + " | Vai trò: " + userRole;
        }
        return "Không tìm thấy thông tin.";
    }

    public void hienThi() {
        System.out.println(getInfo(this.identity));
    }

    public String getIdentity() {
        return identity;
    }
}
