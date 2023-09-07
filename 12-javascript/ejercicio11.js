let frase = prompt("Ingrese una frase: ");
let letra = "";
let palabraLarga = () =>{
    frase.split(" ").forEach(i => {
        letra = (i.length > letra.length) ? i : letra;
    });
    alert(letra);
}
palabraLarga(frase);