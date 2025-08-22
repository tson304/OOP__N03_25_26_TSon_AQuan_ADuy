public class Bia {
    //1.Biến thành viên: variable number, màu sắc, mùi vị, thông số đặc trưng của đối tượng.
    public String nhanbia;
    public String tenbia;
    public String mausac;
    public int luuluong;

    //2. Phương thức hoạt động, methods for objects operation.
    public void uong(String tenbia){
        System.out.println("Bia::"+ tenbia);
    }
    public String getMausac(){
        return mausac;
    }
    public String getTen(){
        return tenbia;
    }
}