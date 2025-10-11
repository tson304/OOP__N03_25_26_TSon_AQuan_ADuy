// Hàm tải nội dung từ một URL và chèn vào khu vực chính
async function loadContent(url) {
    const mainContent = document.getElementById("mainContent");

    try {
        const response = await fetch(url);
        if (!response.ok) {
            throw new Error(`Lỗi HTTP! Trạng thái: ${response.status}`);
        }
        const html = await response.text();

        // Cần trích xuất nội dung mong muốn (ví dụ: body hoặc div cụ thể)
        // Vì Fetch API chỉ lấy raw HTML, ta cần tạo một đối tượng DOM tạm thời để phân tích
        const parser = new DOMParser();
        const doc = parser.parseFromString(html, 'text/html');

        // Lấy nội dung từ thẻ <body> (hoặc thẻ nào chứa nội dung chính của user.html, song.html, artist.html)
        // Lưu ý: Các file user.html, song.html, artist.html chỉ nên chứa nội dung chính, không nên lặp lại sidebar, header...
        const newContent = doc.body.innerHTML;

        mainContent.innerHTML = newContent;

    } catch (error) {
        console.error("Không thể tải nội dung:", error);
        mainContent.innerHTML = '<h1>Không thể tải trang. Vui lòng kiểm tra đường dẫn file.</h1>';
    }
}

// Thêm sự kiện cho tất cả các liên kết trong sidebar
document.addEventListener('DOMContentLoaded', () => {
    const sidebarLinks = document.querySelectorAll('.sidebar a');

    sidebarLinks.forEach(link => {
        link.addEventListener('click', (event) => {
            // 1. Chặn hành vi mặc định của thẻ <a> (mở trang mới)
            event.preventDefault();

            // 2. Lấy URL từ thuộc tính href
            const url = link.getAttribute('href');

            // 3. Tải và chèn nội dung
            if (url && url !== "#") { // Đảm bảo URL hợp lệ
                loadContent(url);
            }
        });
    });
});