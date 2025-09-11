public class Variables {
    public static void main(String[] args) {
        // Kiểu chuỗi (String)
        String name = "Son";
        System.out.println(name);

        // Kiểu số nguyên (int)
        int myNum = 30;
        System.out.println(myNum);

        // Cách gán giá trị khác
        int mynNum; 
        mynNum = 30;
        System.out.println(mynNum);

        myNum = 4; // myNum = 4 đã ghi đè lên myNum = 30
        System.out.println(myNum);

        final int myfNum = 304;
        //myfNum = 13; sẽ bị lỗi do không thể ghi đè lên hằng số
        System.out.println(myfNum);

        // Kiểu số thực (float, double)
        float myFloatNum = 3.04f;
        double myDoubleNum = 30.4;
        System.out.println(myFloatNum);
        System.out.println(myDoubleNum);

        // Kiểu kí tự (char)
        char myLetter = 'S';
        System.out.println(myLetter);

        // Kiểu logic đúng/sai (boolean)
        boolean myBool = true;
        System.out.println(myBool);
    }
}
