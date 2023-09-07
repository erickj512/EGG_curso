
let longitud = prompt("Ingrese la cantidad de elementos en el arry ");
let array1 = [];

for (let index = 0; index < longitud; index++) {
    array1[index] = prompt("Ingrese los elementos ");
}
alert(`Contunto inicial: ${array1}`);

array1.splice(array1.length-2,2);

alert(`Conjunto final: ${array1}`);