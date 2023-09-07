
alert("Ingrese los datos del libro: ");
cargarLibro();
mostrarLibro();

let libro = {
    ISBN: 0,
    Titulo: ' ',
    Autor: ' ',
    NumPag: 0,
}

function cargarLibro(libro) {
    ISBN = prompt('Ingrese el número de ISBN');
    Titulo = prompt('Ingrese el título');
    Autor = prompt('Ingrese el Autor');
    NumPag = prompt('Ingrese el Número de Páginas');
}

function mostrarLibro() {
    alert(`ISBN: ${this.ISBN} 
   Título:  ${this.Titulo} 
   Autor:  ${this.Autor} 
   Número de páginas: ${this.NumPag}`)
}