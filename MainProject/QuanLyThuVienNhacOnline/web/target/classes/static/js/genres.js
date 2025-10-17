// Hiển thị dữ liệu
document.addEventListener("DOMContentLoaded", () =>
{
    loadGenres();
});

async function loadGenres()
{
    const tableBody = document.getElementById("genreTable");

    try
    {
        const response = await fetch("/api/genres");
        if (!response.ok)
        {
            throw new Error("Lỗi tải dữ liệu");
        }

        const genres = await response.json();

        if (genres.length === 0) {
            tableBody.innerHTML = `<tr><td colspan="5" class="text-center">Không có thể loại nhạc nào</td></tr>`;
            return;
        }

        genres.forEach((genre) =>
        {
            const row = `
                <tr>
                    <td>${genre.id}</td>
                    <td>${genre.name}</td>
                    <td>
                        <button class="btn btn-sm btn-warning me-2" onclick="updateGenre('${genre.id}')">
                            <i class="bi bi-pencil"></i>
                        </button>
                        <button class="btn btn-sm btn-danger" onclick="deleteGenre('${genre.id}')">
                            <i class="bi bi-trash"></i>
                        </button>
                    </td>
                </tr>
            `;
            tableBody.insertAdjacentHTML("beforeend", row);
        });
    }
    catch (error)
    {
        console.error("Lỗi khi tải dữ liệu:", error);
        tableBody.innerHTML = `<tr><td colspan="5" class="text-center text-danger">Lỗi khi tải dữ liệu!</td></tr>`;
    }
}

// Thêm dữ liệu
function createGenre()
{
    alert("Chức năng thêm đang được phát triển!");
}

// Sửa dữ liệu
function updateGenre(id)
{
    alert("Chức năng chỉnh sửa đang được phát triển!");
}

// Xóa dữ liệu
async function deleteGenre(id)
{
    if (!confirm("Bạn có chắc muốn xóa thể loại nhạc này không?"))
    {
        return;
    }

    try {
        const response = await fetch(`/api/genres/${id}`, { method: "DELETE" });
        if (response.ok)
        {
            alert("Xóa thành công!");
            loadGenres();
        }
        else
        {
            alert("Lỗi khi xóa thể loại nhạc");
        }
    }
    catch (error)
    {
        console.error("Lỗi khi xóa:", error);
        alert("Không thể xóa thể loại nhạc!");
    }
}


