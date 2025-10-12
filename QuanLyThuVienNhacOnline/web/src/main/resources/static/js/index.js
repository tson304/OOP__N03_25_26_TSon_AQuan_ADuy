async function loadContent(url) {
    const mainContent = document.getElementById("mainContent");

    try {
        const response = await fetch(url);
        if (!response.ok) {
            throw new Error(`Lỗi HTTP! Trạng thái: ${response.status}`);
        }
        const html = await response.text();

        const parser = new DOMParser();
        const doc = parser.parseFromString(html, 'text/html');


        const newContent = doc.body.innerHTML;

        mainContent.innerHTML = newContent;

    } catch (error) {
        console.error("Không thể tải nội dung:", error);
        mainContent.innerHTML = '<h1>Không thể tải trang. Vui lòng kiểm tra đường dẫn file.</h1>';
    }
}


document.addEventListener('DOMContentLoaded', () => {
    const sidebarLinks = document.querySelectorAll('.sidebar a');

    sidebarLinks.forEach(link => {
        link.addEventListener('click', (event) => {

            event.preventDefault();

            const url = link.getAttribute('href');

            if (url && url !== "#") {
                loadContent(url);
            }
        });
    });
});
