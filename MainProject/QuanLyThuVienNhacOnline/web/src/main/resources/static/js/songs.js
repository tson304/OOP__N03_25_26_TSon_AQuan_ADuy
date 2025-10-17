// Hiển thị dữ liệu
document.addEventListener("DOMContentLoaded", () =>
{
    loadSongs();
});

async function loadSongs()
{
    const tableBody = document.getElementById("songTable");

    try
    {
        const response = await fetch("/api/songs");
        if (!response.ok)
        {
            throw new Error("Lỗi tải dữ liệu");
        }

        const songs = await response.json();
        tableBody.innerHTML = "";

        if (songs.length === 0) {
            tableBody.innerHTML = `<tr><td colspan="5" class="text-center">Không có bài hát nào</td></tr>`;
            return;
        }

        songs.forEach((song) =>
        {
            const row = `
                <tr>
                    <td>${song.id}</td>
                    <td>${song.title}</td>
                    <td>${song.artist}</td>
                    <td>${song.genre}</td>
                    <td>${song.releaseYear}</td>
                    <td>${song.duration}</td>
                    <td><a href="${song.audioFilePath}"><i class="bi bi-youtube"></i></a></td>
                    <td>
                        <button class="btn btn-sm btn-warning me-2" onclick="updateSong('${song.id}')">
                            <i class="bi bi-pencil"></i>
                        </button>
                        <button class="btn btn-sm btn-danger" onclick="deleteSong('${song.id}')">
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
function createSong()
{
    alert("Chức năng thêm đang được phát triển!");
}


// Sửa dữ liệu
function updateSong(id)
{
    alert("Chức năng chỉnh sửa đang được phát triển!");
}


// Xóa dữ liệu
async function deleteSong(id)
{
    if (!confirm("Bạn có chắc muốn xóa bài hát này không?"))
    {
        return;
    }

    try
    {
        const response = await fetch(`/api/songs/${id}`, { method: "DELETE" });
        if (response.ok)
        {
            alert("Xóa thành công!");
            loadSongs();
        } else {
            alert("Lỗi khi xóa bài hát");
        }
    }
    catch (error)
    {
        console.error("Lỗi khi xóa:", error);
        alert("Không thể xóa nghệ sĩ!");
    }
}

