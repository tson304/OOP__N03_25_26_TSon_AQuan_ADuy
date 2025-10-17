// index.js (thay thế toàn bộ)
async function loadContent(url) {
    const mainContent = document.getElementById("mainContent");

    try {
        // fetch HTML từ server
        const response = await fetch(url);
        if (!response.ok) {
            throw new Error(`Lỗi HTTP! Trạng thái: ${response.status}`);
        }
        const html = await response.text();

        // parse HTML thành document tạm
        const parser = new DOMParser();
        const doc = parser.parseFromString(html, 'text/html');

        // LẤY PHẦN BODY của tài liệu trả về (hoặc bạn có thể chọn 1 selector cụ thể)
        const newContent = doc.body.innerHTML;

        // Gán nội dung vào mainContent
        mainContent.innerHTML = newContent;

        // --- Chạy/copy tất cả các <script> từ doc sang document hiện tại ---
        // Lấy nodeList các script trong doc (cả inline lẫn external)
        const scripts = doc.querySelectorAll('script');

        // Hàm kiểm tra script src đã được load chưa (dùng để tránh load trùng)
        function isScriptLoaded(src) {
            if (!src) return false;
            const existing = Array.from(document.querySelectorAll('script'))
                                  .some(s => s.src && s.src === new URL(src, location.origin).href);
            return existing;
        }

        scripts.forEach(oldScript => {
            const newScript = document.createElement('script');

            // nếu có src (external script)
            if (oldScript.src) {
                // tránh load trùng (nếu muốn cho phép load lại, bỏ if)
                if (isScriptLoaded(oldScript.src)) {
                    // Nếu đã load, nhưng bạn muốn rerun code inside it (không thể dễ dàng),
                    // bạn có thể choose to skip or force reload by adding cache-busting param.
                    return;
                }
                // set src (dùng absolute path nếu cần)
                // oldScript.src có thể là absolute hoặc relative (doc parsing giữ nguyên),
                // new URL(...) giúp chuyển relative -> absolute dựa trên current origin.
                try {
                    newScript.src = new URL(oldScript.getAttribute('src'), location.origin + '/').href;
                } catch (e) {
                    newScript.src = oldScript.getAttribute('src');
                }
                // giữ type / async / defer nếu có
                if (oldScript.type) newScript.type = oldScript.type;
                if (oldScript.async) newScript.async = true;
                if (oldScript.defer) newScript.defer = true;

                // thêm vào body để tải & thực thi
                document.body.appendChild(newScript);
            } else {
                // inline script: copy nội dung và chèn để thực thi ngay
                newScript.text = oldScript.textContent;
                document.body.appendChild(newScript);
            }
        });

        // Nếu trang con có CSS <link> nằm trong head của trang con, bạn có thể
        // xử lý tương tự (nhưng thường CSS global đã được nạp ở layout).
    }
    catch (error) {
        console.error("Cannot load content:", error);
        mainContent.innerHTML = '<h1>Cannot load the page. Check your file path.</h1>';
    }
}

document.addEventListener('DOMContentLoaded', () => {
    const sidebarLinks = document.querySelectorAll('.sidebar a');

    sidebarLinks.forEach(link => {
        link.addEventListener('click', (event) => {
            event.preventDefault();
            const url = link.getAttribute('href');
            if (url && url !== "#") {
                // nếu bạn dùng Thymeleaf: th:href="@{/artists}" thì href sẽ là "/artists"
                loadContent(url);
            }
        });
    });

    // load trang home mặc định (bạn có thể đổi thành '/home' hoặc 'home.html')
    loadContent("home");
});
