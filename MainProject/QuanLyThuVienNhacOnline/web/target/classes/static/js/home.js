document.addEventListener("DOMContentLoaded", function() {
    const links = document.querySelectorAll(".sidebar a[data-page]");
    const mainContent = document.getElementById("mainContent");

    links.forEach(link => {
        link.addEventListener("click", async function(e) {
            e.preventDefault();
            const pageUrl = link.getAttribute("data-page");

            try {
                // Fetch nội dung HTML của trang (VD: /artists → trả về artists.html)
                const response = await fetch(pageUrl);
                if (!response.ok) throw new Error("Không tải được nội dung trang: " + pageUrl);
                const html = await response.text();

                // Gán vào mainContent
                mainContent.innerHTML = html;

                // Xóa các script cũ
                document.querySelectorAll("script[data-dynamic]").forEach(s => s.remove());

                // Load JS tương ứng (VD: artists.js)
                let scriptFile = "";
                if (pageUrl.includes("artists")) scriptFile = "/js/artists.js";
                if (pageUrl.includes("users")) scriptFile = "/js/users.js";
                if (pageUrl.includes("songs")) scriptFile = "/js/songs.js";
                if (pageUrl.includes("genres")) scriptFile = "/js/genres.js";

                if (scriptFile) {
                    const script = document.createElement("script");
                    script.src = scriptFile;
                    script.dataset.dynamic = "true"; // để dễ xoá khi chuyển trang
                    document.body.appendChild(script);
                }

            } catch (err) {
                mainContent.innerHTML = `<div class="alert alert-danger m-3">${err.message}</div>`;
            }
        });
    });
});
