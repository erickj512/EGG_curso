
let matriz = [[3], [6], [9], [12], [15]];
alert(`Matriz = ${matriz}`);
let array = matriz.flatMap(function Pasaje(x) {return x[0]+=3});
alert(`Array = ${array}`);