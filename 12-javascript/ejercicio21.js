
function Persona (nombre, edad, sexo, peso, altura){
    nombre = this.nombre;
    edad = this.edad;
    sexo = this.sexo;
    peso = this.peso;
    altura = this.altura;
}
let p1 = new Persona();
function crearPersona(p1) {
    p1.nombre = prompt("Ingrese su nombre: ");
    p1.edad = prompt("Ingrese su edad: ");
    p1.sexo = prompt("Ingrese su sexo: (H-Hombre / M-Mujer / O-Otro)");
    p1.peso = prompt("Ingrese su peso: ");
    p1.altura = prompt("Ingrese su altura: ");
}

alert(`Bienvenido al array de objeto persona :)`);
crearPersona(p1);
alert(Object.values(p1));
console.log(Object.values(p1));