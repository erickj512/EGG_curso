var frase = prompt("Ingrese una frase: ");
var fraseNueva = "";
for (let i = 0; i < frase.length; i++) {
    fraseNueva += frase.substring(i,i+1) + " ";
}
alert(fraseNueva);