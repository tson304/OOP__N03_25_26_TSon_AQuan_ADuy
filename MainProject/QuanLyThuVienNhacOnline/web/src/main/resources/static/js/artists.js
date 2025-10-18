// Hiển thị dữ liệu
document.addEventListener("DOMContentLoaded", () =>
{
    loadArtists();
});


async function loadArtists()
{
    const tableBody = document.getElementById("artistTable");

    try
    {
        const response = await fetch("/api/artists");
        if (!response.ok)
        {
            throw new Error("Lỗi tải dữ liệu");
        }

        const artists = await response.json();
        tableBody.innerHTML = "";

        if (artists.length === 0)
        {
            tableBody.innerHTML = `<tr><td colspan="5" class="text-center">Không có nghệ sĩ nào</td></tr>`;
            return;
        }

        artists.forEach((artist) =>
        {
            const row = `
                <tr>
                    <td>${artist.id}</td>
                    <td>${artist.name}</td>
                    <td>${artist.country}</td>
                    <td>${artist.songs ? artist.songs.length : 0}</td>
                    <td>
                        <button class="btn btn-sm btn-warning me-2" onclick="updateArtist('${artist.id}')">
                            <i class="bi bi-pencil"></i>
                        </button>
                        <button class="btn btn-sm btn-danger" onclick="deleteArtist('${artist.id}')">
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
async function createArtist()
{
    alert("Chức năng đang được phát triển!");
}

// Sửa dữ liệu
async function updateArtist(id)
{
    alert("Chức năng chỉnh sửa đang được phát triển!");
}

// Xóa dữ liệu
async function deleteArtist(id) {
    if (!confirm("Bạn có chắc muốn xóa nghệ sĩ này không?"))
    {
        return;
    }

    try
    {
        const response = await fetch("/api/artists/${id}", { method: "DELETE" });

        if (response.ok)
        {
            alert("Xóa thành công!");
            loadArtists();
        }
        else
        {
            alert("Lỗi khi xóa nghệ sĩ");
        }
    }
    catch (error)
    {
        console.error("Lỗi khi xóa: ", error);
        alert("Không thể xóa nghệ sĩ!");
    }
}


