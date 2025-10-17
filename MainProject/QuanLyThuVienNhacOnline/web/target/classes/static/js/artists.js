const apiUrl = "http://localhost:8080/api/artists";

async function loadArtists() {
    try {
        const response = await fetch(apiUrl);
        const artists = await response.json();

        console.log("Artists loaded:", artists);

        const tbody = document.querySelector("tbody");
        tbody.innerHTML = "";

        artists.forEach(artist => {
            const row = document.createElement("tr");
            row.innerHTML = `
                <td>${artist.id}</td>
                <td>${artist.name}</td>
                <td>${artist.country}</td>
                <td>${artist.songs ? artist.songs.length : 0}</td>
                <td>
                    <button class="btn btn-warning btn-sm" onclick="editArtist('${artist.id}')">Edit</button>
                    <button class="btn btn-danger btn-sm" onclick="deleteArtist('${artist.id}')">Delete</button>
                </td>`;
            tbody.appendChild(row);
        });
    } catch (error) {
        console.error("Error loading artists:", error);
    }
}

document.addEventListener("DOMContentLoaded", () => {
    console.log("DOM ready");
    loadArtists();

    const form = document.querySelector("#addArtistModal form");
    form.addEventListener("submit", async (e) => {
        e.preventDefault();

        const name = form.querySelector("input[placeholder='Name...']").value.trim();
        const country = form.querySelector("input[placeholder='Country...']").value.trim();

        if (!name || !country) {
            alert("Please fill in all fields");
            return;
        }

        const newArtist = { name, country };
        console.log("Creating artist:", newArtist);

        await fetch(apiUrl, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(newArtist)
        });

        const modal = bootstrap.Modal.getInstance(document.getElementById("addArtistModal"));
        modal.hide();

        form.reset();
        loadArtists();
    });
});

// Hàm xóa
async function deleteArtist(id) {
    if (confirm("Are you sure you want to delete this artist?")) {
        await fetch(`${apiUrl}/${id}`, { method: "DELETE" });
        loadArtists();
    }
}

// thay vì dùng DOMContentLoaded bên trong, hãy tạo func init
function initArtists() {
    console.log("✅ artists init");
    loadArtists(); // giả sử loadArtists đã định nghĩa ở file này
    const form = document.querySelector("#addArtistModal form");
    if (form) {
        form.addEventListener("submit", async (e) => { /* ... */ });
    }
}

// gọi init nếu file này được load sau khi DOM đã sẵn sàng
initArtists();
