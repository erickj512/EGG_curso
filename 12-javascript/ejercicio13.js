
function Persona(nombre, edad, sexo, peso, altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
}  

var bartolo = new Persona("Juan", 22, "H", 86.5, 1.92);

console.log(bartolo);

//Lamba + ForEach
Object.keys(bartolo).forEach(function(prop) {
    document.write(prop + ": " + bartolo[prop] + "<br>"); 
});

//For In
for(let propiedad in bartolo) {
    document.write(propiedad + ": " + bartolo[propiedad] + "<br>");
}