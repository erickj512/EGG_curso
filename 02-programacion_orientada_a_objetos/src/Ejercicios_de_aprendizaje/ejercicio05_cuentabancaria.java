/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Erick Almeida
 */
public class ejercicio05_cuentabancaria {

    /*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta 
    
    /**
     * @param args the command line arguments
     */
    
  
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double saldo = 0.0;
        Cuenta cuenta = new Cuenta();
        while (opcion != 7) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Ingresar saldo");
            System.out.println("3. Retirar saldo");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Realizar extracción");
             System.out.println("6. Consultar datos");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

        
            switch (opcion) {
                case 1:
                    cuenta.crearCuenta()
                    ;
                    break;
                case 2:
                    System.out.print("Ingresa la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    cuenta.ingresar(deposito);
                    break;
                case 3:
                    System.out.print("Ingresa la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 4:
                    cuenta.consultarSaldo();
                    break;
                
                case 5:
                    System.out.print("Ingresa la cantidad a extraer: ");
                    cuenta.extraccionRapida();
                    break;
                case 6:
                     cuenta.consultarDatos();
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor selecciona una opción válida.");
            }
        }

        scanner.close();
    }
}

         
        