let array = [true, 5, false, "hola", "adios", 2];
let palabra = "";
let contB = 0, num1 = 0, num2 = 0;
let msj = ""

alert("resolviendo el array");
alert("el array es:  "+ array);
for (let i = 0; i < array.length; i++) {
    if (typeof array[i] == "string") {
        palabra = (array[i].length > palabra.length)?array[i]:palabra;
    }    
    (typeof array[i] == "boolean")?contB++:contB;
    ((typeof array[i] == "number")&&(num1 == 0))?num1=array[i]:((typeof array[i] == "number")&&(num2 == 0))?num2=array[i]:num2;
}
(contB <= 2)?msj="Hay 2 boleanos en el Array":msj+="No hay 2 boleanos en el array";
(contB > 2)?msj+=" existe  mas de 2 boleanos.":msj+=" no hay mas de 2 boleanos en el array.";

alert(`
A) ${palabra}
B) ${msj}
C)  Operaciones: 
Suma: ${num1 + num2}
Resta: ${num1 - num2}
Multiplicacion: ${num1 * num2}
Division: ${num1 / num2}
Potencia: ${Math.pow(num1,num2)}
`);