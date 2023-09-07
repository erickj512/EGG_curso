
let arreglo1 = [];
let arreglo2 = [];

for (let i = 0; i < 50; i++) {
    arreglo1[i] = Math.floor(Math.random()*(100));    
}
alert(`Arreglo A aleatorio ${arreglo1}`); 

arreglo1.sort(compare);
alert(`los 10 primero del arreglo ordenado ${arreglo1.slice(0,10)}`); 
for (let i = 0; i < 20; i++) {
    (i<10)?arreglo2[i]=arreglo1[i]:arreglo2[i] = 0.5;        
}
alert(`Arreglo B combinado ${arreglo2}`);

function compare(a, b) {
    if (a > b) return 1; 
    if (a == b) return 0; 
    if (a < b) return -1; 
}