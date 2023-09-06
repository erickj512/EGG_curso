/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_aprendizaje;

/**
 *
 * @author Erick Almeida
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
///////////////////////////////////////////////////////////////////////////////////////        
//Clase 1: 
    //Imprime: ”Valor final del try: 44”
    //Imprime: ”Valor final del finally: 45”
    //Imprime: ”Valor antes del return: 46”
    //Imprime: "46"
/////////////////////////////////////////////////////////////////////////////////////// 
//Clase 2: 
    //Imprime: ”Valor final del catch: 43”
    //Imprime: ”Valor final del finally: 44”
    //Imprime: ”Valor antes del return: 45”
    //Imprime: "45"
/////////////////////////////////////////////////////////////////////////////////////// 
//Clase 3: 
    //Imprime: ”Valor final del finally: 2”
    //Imprime: "java.lang.NumberFormatException"
/////////////////////////////////////////////////////////////////////////////////////// 

/////////////////////////////////////////////////////////////////////////////////////// 
//          class Uno {
//
//              private static int metodo() {
//                  int valor = 0;
//                  try {
//                    valor = valor + 1;
//                    valor = valor + Integer.parseInt(”42”);
//                    valor = valor + 1;
//                    System.out.println(”Valor final del try :” + valor) ;
//                  } catch (NumberFormatException e) {
//                    Valor = valor + Integer.parseInt(”42”);
//                    System.out.println(“Valor final del catch  :” + valor);
//                  }finally {
//                    valor = valor + 1;
//                    System.out.println(”Valor final del finally: ” + valor) ;
//                  }
//                  valor = valor + 1;
//                  System.out.println(”Valor antes del return: ” + valor) ;
//                  return valor;
//                   }
//
//            public static void main(String[] args) {
//                try {
//                    System.out.println(metodo());
//                } catch (Exception e) {
//                    System.err.println(”Excepcion en metodo() ”) ;
//                      e.printStackTrace();
//                }
//            }
//        }
///////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////
//          class Dos {
//
//              private static int metodo() {
//                  int valor = 0;
//                  try {
//                      valor = valor + 1;
//                      valor = valor + Integer.parseInt(”W”);
//                      valor = valor + 1;
//                      System.out.println(”Valor final del try : ” + valor) ;
//                  } catch (NumberFormatException e) {
//                      valor = valor + Integer.parseInt(”42”);
//                      System.out.println(”Valor final del catch  : ” + valor) ;
//                  }finally {
//                      valor = valor + 1;
//                      System.out.println(”Valor final del finally: ” + valor) ;
//                  }
//                  valor = valor + 1;
//                  System.out.println(”Valor antes del return: ” + valor) ;
//                  return valor;
//                  }
//
//
//              public static void main(String[] args) {
//                  try {
//                      System.out.println(metodo());
//                  } catch (Exception e) {
//                      System.err.println( ” Excepcion en metodo() ” ) ;
//                      e.printStackTrace();
//                  }
//              }
//          }
///////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////
//          class Tres {
//
//              private static int metodo() {
//                  int valor = 0;
//                  try {
//                      valor = valor + 1;
//                      valor = valor + Integer.parseInt(”W”);
//                      valor = valor + 1;
//                      System.out.println(”Valor final del try : ” + valor);
//                  } catch (NumberFormatException e) {
//                      valor = valor + Integer.parseInt(”W”);
//                      System.out.println(”Valor final del catch  : ” + valor);
//                  }finally{
//                      valor = valor + 1;
//                      System.out.println(”Valor final del finally:” + valor);
//                  }
//                  valor = valor + 1;
//                  System.out.println(”Valor antes del return: ” + valor) ;
//                  return valor;
//                  }
//
//
//              public static void main(String[] args) {
//                  try {
//                      System.out.println(metodo());
//                  } catch (Exception e) {
//                      System.err.println(”Excepcion en metodo() ” ) ;
//                      e.printStackTrace();
//                }
//            }
//        }
    }
}