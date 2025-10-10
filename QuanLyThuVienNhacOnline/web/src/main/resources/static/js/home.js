// Hàm JavaScript để chuyển đổi trạng thái menu
function toggleMenu() {
    const sidebar = document.getElementById("mySidebar");
    const content = document.getElementById("mainContent");

    // Chuyển đổi class 'active'
    sidebar.classList.toggle("active");

    // Tùy chọn: dịch chuyển nội dung chính để nhường chỗ cho menu
    if (sidebar.classList.contains("active")) {
        content.style.marginLeft = "250px";
    } else {
        content.style.marginLeft = "0";
    }
}