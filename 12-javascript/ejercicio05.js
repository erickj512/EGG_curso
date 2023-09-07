var num1, num2;
var opcion = prompt(`Ingrese la operacion matematica que desee realizar: 
1 Suma - (S) - (s)
2 Resta - (R) - (r)
3 Multiplicacion - (M) - (m)
4 Division - (D) - (d)`).toUpperCase();

switch (opcion) {
    case "1":
        num1 = parseInt(prompt("Ingrese el primer valor: "));
        num2 = parseInt(prompt("Ingrese el segundo valor: "));
        alert("La suma resultante es: " + (num1 + num2));
        break;
    case "2":
        num1 = parseInt(prompt("Ingrese el primer valor: "));
        num2 = parseInt(prompt("Ingrese el segundo valor: "));
        alert("La resta resultante es: " + (num1 - num2));
        break;
    case "3":
        num1 = parseInt(prompt("Ingrese el primer valor: "));
        num2 = parseInt(prompt("Ingrese el segundo valor: "));
        alert("La multiplicacion resultante es: " + (num1 * num2));
        break;    
    case "4":
        num1 = parseInt(prompt("Ingrese el dividendo: "));
        num2 = parseInt(prompt("Ingrese el divisor: "));
        while (num2<=0) {
            num2 = parseInt(prompt("Error! No puede ser igual o menor a 0! Ingrese el divisor: "));
        }
        alert("La multiplicacion resultante es: " + (num1 / num2));
        break;
    default:
        alert("Opcion invalida! Ingrese otra opcion!");
        break;
}