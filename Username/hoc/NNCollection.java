package Username.hoc;

public class NNCollection {
    private NameNumber[] nnArray = new NameNumber[100]; // mảng tĩnh chứa tối đa 100 NameNumber
    private int free; // chỉ số phần tử trống tiếp theo

    public NNCollection() {
        free = 0; // ban đầu chưa có phần tử nào
    }

    // Phương thức chèn có sắp xếp theo LastName (tăng dần)
    public void insert(NameNumber n) {
        int index = free;

        // free++: tăng số phần tử sau khi chèn
        for (int i = free++;
             i != 0 && nnArray[i-1].getLastName().compareTo(n.getLastName()) > 0;
             i--) 
        {
            // Dịch phần tử sang phải nếu họ đứng sau họ của n (theo alphabet)
            nnArray[i] = nnArray[i-1];
            index = i;
        }

        nnArray[index] = n; // chèn n vào vị trí đúng
    }

    // Tìm số điện thoại theo lastName
    public String findNumber(String lName) {
        for (int i = 0; i != free; i++)
            if (nnArray[i].getLastName().equals(lName))
                return nnArray[i].getTelNumber();

        return new String("Name not found");
    }
}