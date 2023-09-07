const formulario = document.querySelector('#formulario');
formulario.addEventListener('submit', (event) => {
    event.preventDefault();
    const circunferencia = document.querySelector('#circunferencia').value;
    const radio = circunferencia / (2 * Math.PI);
    const resultado = document.querySelector('#resultado');
    resultado.textContent = `El radio del círculo es: ${radio}`;
});
