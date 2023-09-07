
alert("¡Bienvenido a la calculadora maestra!");
cargarRadio();
geometriaCirculo();

let circulo = {
    radio:0,
}

function cargarRadio(circulo) {
    radio = prompt("Ingrese el radio de su circulo: ");
}

function geometriaCirculo(circulo) {
    let area = (Math.PI)*(Math.pow(radio, 2));
    let perimetro = 2 * Math.PI * radio;

    alert(`El perimetro es: ${perimetro}
    y la area es: ${area}`);
}