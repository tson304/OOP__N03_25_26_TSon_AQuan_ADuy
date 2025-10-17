// Hiển thị dữ liệu
document.addEventListener("DOMContentLoaded", () =>
{
    loadUsers();
});

async function loadUsers()
{
    const tableBody = document.getElementById("userTable");

    try
    {
        const response = await fetch("/api/users");
        if (!response.ok)
        {
            throw new Error("Lỗi tải dữ liệu");
        }

        const users = await response.json();

        if (users.length === 0)
        {
            tableBody.innerHTML = `<tr><td colspan="5" class="text-center">Không có người dùng nào</td></tr>`;
            return;
        }

        users.forEach((user) =>
        {
            const row = `
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.password}</td>
                    <td>${user.email}</td>
                    <td>
                        <button class="btn btn-sm btn-warning me-2" onclick="updateUser('${user.id}')">
                            <i class="bi bi-pencil"></i>
                        </button>
                        <button class="btn btn-sm btn-danger" onclick="deleteUser('${user.id}')">
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
function createUser()
{
    alert("Chức năng thêm đang được phát triển!");
}

// Sửa dữ liệu
function updateUser(id)
{
    alert("Chức năng chỉnh sửa đang được phát triển!");
}

// Xoá dữ liệu
async function deleteUser(id)
{
    if (!confirm("Bạn có chắc muốn xóa người dùng này không?"))
    {
        return;
    }

    try
    {
        const response = await fetch(`/api/users/${id}`, { method: "DELETE" });
        if (response.ok)
        {
            alert("Xóa thành công!");
            loadUsers();
        }
        else
        {
            alert("Lỗi khi xóa người dùng");
        }
    }
    catch (error)
    {
        console.error("Lỗi khi xóa:", error);
        alert("Không thể xóa người dùng!");
    }
}

