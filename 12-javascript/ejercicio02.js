
const pi = 3.1416;
var radio = prompt("Ingrese el radio en cm: ")
var perimetro = (2 * pi * radio);
var area = pi * Math.pow(radio,2);
var mensaje = 
`Para un circulo de: ${radio} cm de radio
*Perimetro = ${perimetro} cm
*Area = ${area} cm`

alert(mensaje);