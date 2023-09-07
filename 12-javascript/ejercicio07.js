var limite = parseInt(prompt("Ingrese su limite: "));
var suma = 0;

do {
    suma += parseInt(prompt("Ingrese un numero: "));
    alert("El limite actual esta en: " + suma);
} while (suma<=limite);

alert("Felicitaciones! Ha superado el limite!");