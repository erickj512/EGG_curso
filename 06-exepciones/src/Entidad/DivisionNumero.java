/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Erick Almeida
 */


public class DivisionNumero {

    private int num1, num2;

    public DivisionNumero() {
    }

    public DivisionNumero(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }   

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }    

    public void conversor(String n1, String n2) {

        try {
            
            num1 = Integer.parseInt(n1);
            num2 = Integer.parseInt(n2);
            
            System.out.println("La division de los numeros es: " + (num1/num2));
            
        } catch (NumberFormatException ex) {
            System.out.println("Uno de los numeros no es valido!");
        }        
    }
}