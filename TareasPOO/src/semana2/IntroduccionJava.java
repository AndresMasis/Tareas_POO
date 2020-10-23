/*
Se realiza un programa sencillo para familiarizarse con Java
Esto corresponde al ejercicio de la semana 2 del curso de Programación Orientada a Objetos
Este código es realizado por Andres Masis
Carne 2020127158
 */
package semana2;

import java.util.Scanner;

public class IntroduccionJava {

    public static void main(String[] args) {
        // Se declaran las variables que se necesitan
        Scanner key = new Scanner(System.in);
        int opcion, a, b;

        
        // Ejecucion del programa
        System.out.println("-------------PROGRAMA DE CALCULADORA---------------");
        do {
            // Pide los datos
            System.out.println("Dame un numero");
            a = key.nextInt();

            System.out.println("Dame otro numero");
            b = key.nextInt();
            
            
            // Pide la operacion
            System.out.println("¿Que deseas hacer? \n1.Sumar \n2.Restar \n.3Multiplicar \n4.Dividir \n5.Salir");
            opcion = key.nextInt();
            
            
            // Realiza la respectiva operacion
            switch (opcion) {

                case 1:
                    // Suma
                    System.out.println("Tu suma equivale a " + (a + b));
                    break;
                case 2:
                    // Resta
                    System.out.println("Tu resta equivale a " + (a - b));
                    break;
                case 3:
                    // Multiplicacion
                    System.out.println("Tu multiplicacion equivale a " + (a * b));
                    break;
                case 4:
                    // Division
                    if (b == 0) {
                        // Se verifica que no se divida po 0
                        System.out.println("No se puede dividir entre 0");

                    } else {
                        System.out.println("Tu division equivale a " + (a / b));
                    }
                    break;
                case 5:
                    // SALIR
                    System.out.println("Gracias por su uso.");
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opcion != 5);
    }

}
