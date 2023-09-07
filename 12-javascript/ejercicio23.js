

document.getElementsByTagName("p")[0].innerHTML = document
.getElementsByTagName("p")[0]
.innerText.split(" ")
.map((palabra) =>
palabra.length > 8 ? `<span class = "rsam">${palabra}</span>` : palabra
)
.join(" ");