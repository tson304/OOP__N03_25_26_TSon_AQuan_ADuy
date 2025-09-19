Xây dựng ứng dụng quản lý thư viện nhạc

Yêu cầu chính:

- Giao diện: Java Spring Boot
- Có chức năng quản lý ca sĩ, bài hát và danh sách bài hát
- Và các chức năng khác( tìm kiếm bài hát, thêm bài hát vào danh sách,...)


Cụ thể:
-Quản lý người dùng

+ Thêm, sửa, xóa người dùng.

+ Liệt kê thông tin về người dùng, có thể lọc ra các người dùng theo tiêu chí bất kỳ.

- Có chức năng quản lý các bài hát.

+ Thêm, sửa, xóa bài hát .

+ Cần tạo các lớp liên quan đến “bài hát”, “người dùng”,"danh sách các bài hát" để đọc, ghi xuống 1 hay nhiều file.

- Khi làm việc với dữ liệu trong bộ nhớ, dữ liệu cần được lưu trữ dưới dạng các Collection tùy chọn như ArrayList, LinkedList, Map, ....

~~ Quản Lý Nhạc - Thái Sơn, Anh Duy, Anh Quân

Xây dựng ứng dụng quản lý nhạc

I. Người dùng (Anh Duy):
.........
maNguoiDung
tenNguoiDung
ngaySinh
gioiTinh
<img width="637" height="321" alt="image" src="https://github.com/user-attachments/assets/83d0feb1-6669-422f-8544-41a6baffd95e" />
## Activity Diagrams cho CRUD 

### Create
- Nhập thông tin người dùng
- Tạo đối tượng `NguoiDung`
- Thêm vào danh sách
- In thông báo thành công

### Read
- Duyệt danh sách người dùng
- In thông tin từng người

### Update
- Nhập mã người dùng cần sửa
- Nếu tìm thấy: nhập thông tin mới và cập nhật
- Nếu không: in lỗi

### Delete
- Nhập mã người dùng cần xoá
- Nếu tìm thấy: xoá khỏi danh sách
- Nếu không: in lỗi

---

.........
II. Bài hát (Anh Quân):
tenBaiHat
tenCaSi
thoiLuong
theLoai

III. Thư viện nhạc (Thái Sơn):
.........
caSi
theLoai
baiHat
.........



