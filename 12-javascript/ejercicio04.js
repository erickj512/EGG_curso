do {
    var resp = prompt("comiste hoy? S / N").toUpperCase();  
    if (resp == "S") {
        alert("que chevere");
    } else if (resp == "N") {
        alert("deberias ir a comer");
    } else {
        alert(mensaje);
    }
} while (resp != "S" && resp != "N");