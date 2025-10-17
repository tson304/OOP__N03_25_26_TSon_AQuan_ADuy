const apiUrl = "/api/artists"; // API backend

// DOM elements
const tableBody = document.getElementById("artistTableBody");
const addArtistForm = document.getElementById("addArtistForm");
const artistNameInput = document.getElementById("artistName");
const artistCountryInput = document.getElementById("artistCountry");

// 🚀 Hàm load danh sách nghệ sĩ
async function loadArtists() {
    try {
        const response = await fetch(apiUrl);
        const artists = await response.json();

        // Xóa dữ liệu cũ
        tableBody.innerHTML = "";

        // Duyệt danh sách
        artists.forEach((artist, index) => {
            const row = document.createElement("tr");
            row.innerHTML = `
                <td>${artist.id}</td>
                <td>${artist.name}</td>
                <td>${artist.country}</td>
                <td>${artist.songs ? artist.songs.length : 0}</td>
                <td>
                    <button class="btn btn-sm btn-danger" onclick="deleteArtist('${artist.id}')">
                        <i class="bi bi-trash"></i>
                    </button>
                </td>
            `;
            tableBody.appendChild(row);
        });
    } catch (error) {
        console.error("Lỗi khi load danh sách nghệ sĩ:", error);
    }
}

// ➕ Thêm nghệ sĩ mới
addArtistForm.addEventListener("submit", async (e) => {
    e.preventDefault();

    const name = artistNameInput.value.trim();
    const country = artistCountryInput.value.trim();

    if (!name || !country) {
        alert("Vui lòng nhập đầy đủ thông tin!");
        return;
    }

    const newArtist = { name, country };

    try {
        const response = await fetch(apiUrl, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(newArtist),
        });

        if (response.ok) {
            alert("Thêm nghệ sĩ thành công!");
            addArtistForm.reset();

            // Đóng modal (nếu dùng Bootstrap)
            const modal = bootstrap.Modal.getInstance(document.getElementById("addArtistModal"));
            modal.hide();

            loadArtists(); // Reload danh sách
        } else {
            alert("Lỗi khi thêm nghệ sĩ!");
        }
    } catch (error) {
        console.error("Lỗi:", error);
    }
});

// ❌ Xóa nghệ sĩ
async function deleteArtist(id) {
    if (!confirm("Bạn có chắc muốn xóa nghệ sĩ này?")) return;

    try {
        const response = await fetch(`${apiUrl}/${id}`, {
            method: "DELETE",
        });

        if (response.ok) {
            alert("Đã xóa nghệ sĩ!");
            loadArtists();
        } else {
            alert("Không thể xóa nghệ sĩ!");
        }
    } catch (error) {
        console.error("Lỗi khi xóa:", error);
    }
}

// Khi tải trang xong => load danh sách
document.addEventListener("DOMContentLoaded", loadArtists);
