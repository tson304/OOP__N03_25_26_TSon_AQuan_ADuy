Xây dựng ứng dụng quản lý nhạc.

ĐỐI TƯỢNG: 
    + THƯ VIỆN NHẠC
    + NGƯỜI DÙNG
    + BÀI HÁT

-----TRẦN ĐỨC THÁI SƠN (ĐỐI TƯỢNG: THƯ VIỆN NHẠC)-----

Cụ thể:

- Quản lý người dùng

    + Thêm, sửa, xóa người dùng.

    + Liệt kê danh sách người dùng.

- Quản lý bài hát.

    + Thêm, sửa, xóa bài hát.

    + Liệt kê danh sách bài hát.

- Sơ đồ Class Diagram:

![Class Diagram](./classDiagram.png)


- Sơ đồ thuật toán (activity diagram):

1. Khởi tạo chương trình.

2. Tạo một danh sách phẩn tử rỗng (ds1).

3. Hiển thị menu tương tác với các chức năng:

4. Lấy dữ liệu nhập vào từ người dùng.

5. Kiểm tra dữ liệu nhập vào (từ 1 - 5):

    Nếu nhập vào:
        1 -> Hiển thị tất cả phần tử. (READ)
        2 -> Thêm vào phần tử mới vào danh sách. (CREATE)
        3 -> Xóa phần tử trong danh sách. (DELETE)
        4 -> Sửa phần tử trong danh sách. (EDIT)
        5 -> Kết thúc chương trình
    Nếu nhập cú pháp không trong khoảng (1 - 5):
        -> Báo cú pháp lỗi.

6. Quay lại menu tương tác cho đến khi chọn "5".

7. Kết thúc.