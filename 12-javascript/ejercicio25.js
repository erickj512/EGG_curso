function mostrarValores() {
    
    const form = document.querySelector('#form1');
    
    const nombre = form.elements['nombre'].value;
    const apellido = form.elements['apellido'].value;
    
    const resultados = document.querySelector('#resultados');
    resultados.textContent = `Nombre: ${nombre}, Apellido: ${apellido}`;
}
