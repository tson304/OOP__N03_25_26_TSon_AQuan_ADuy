public class DataType {
    public static void main(String[] args) {
        byte myBNum = 3; // Số nguyên phạm vi nhỏ nhất
        short mySNum = 300; // Số nguyên phạm vi lớn hơn byte nhưng nhỏ hơn int 
        int myNum = 304; // Số nguyên phạm vi thường dùng
        long myLNum = 30004; // Số nguyên phạm vi lớn nhất
        System.out.println(myBNum);
        System.out.println(mySNum);
        System.out.println(myNum);
        System.out.println(myLNum);

        float myFloatNum = 30.4f; // Số thực
        double myDoubleNum = 3.04; // Số thực (phạm vi lớn hơn float)
        System.out.println(myFloatNum);
        System.out.println(myDoubleNum);

        char myLetter = 'S'; // Kí tự
        boolean myBool = false; // Logic đúng/sai
        String myText = "Xin chao"; // Chuỗi
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

    }
}
