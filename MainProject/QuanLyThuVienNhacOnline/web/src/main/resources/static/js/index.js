async function loadContent(url)
 {
    const mainContent = document.getElementById("mainContent");

    try
    {
        const response = await fetch(url);
        if (!response.ok)
        {
            throw new Error(`Lỗi HTTP! Trạng thái: ${response.status}`);
        }
        const html = await response.text();

        const parser = new DOMParser();
        const doc = parser.parseFromString(html, 'text/html');
        mainContent.innerHTML = doc.body.innerHTML;

    }
    catch (error)
    {
        console.error("Cannot load content:", error);
        mainContent.innerHTML = '<h1>Cannot load the page. Check you file path.</h1>';
    }
}

document.addEventListener('DOMContentLoaded', () =>
{
    const sidebarLinks = document.querySelectorAll('.sidebar a');

    sidebarLinks.forEach(link =>
    {
        link.addEventListener('click', (event) =>
        {
            event.preventDefault();
            const url = link.getAttribute('href');
            if (url && url !== "#")
            {
                loadContent(url);
            }
        });
    });

    loadContent("home");


});
