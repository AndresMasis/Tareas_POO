/*
Se realiza un programa qu calcule areas y perimetros de figuras usando herencia
Esto corresponde al ejercicio de la semana 5 del curso de Programación Orientada a Objetos
Tambien se van agregaron las modificaciones indicadas en semana 6
Este código es realizado por Andres Masis
Carne 2020127158
 */
package semana5y6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Variables (semana 5)
        int opcion;
        Scanner in = new Scanner(System.in);
        
        // Instancias (semana 5)
        Triangulo triangle = new Triangulo();
        Rectangulo rectangle = new Rectangulo();
        Circulo circle = new Circulo();
        
        // Ejecucion (semana 5)
        do {
            System.out.println("¿Que figura deseas calcularle el perimetro y area?"
                    + "\n1.Triangulo "
                    + "\n2.Rectangulo "
                    + "\n.3.Circulo "
                    + "\n4.Salir");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    triangle.pedirDatos();
                    triangle.pedirLados();
                    triangle.calcularPerimetro();
                    triangle.calcularArea();
                    triangle.mostrarPerimetro();
                    triangle.mostrarArea();
                    break;
                    
                case 2: 
                    rectangle.pedirDatos();
                    rectangle.calcularPerimetro();
                    rectangle.calcularArea();
                    rectangle.mostrarPerimetro();
                    rectangle.mostrarArea();
                    break;
                    
                case 3:
                    circle.pedirDatos();
                    circle.calcularPerimetro();
                    circle.calcularArea();
                    circle.mostrarPerimetro();
                    circle.mostrarArea();
                    break;
                    
                case 4:
                    System.out.println("Gracias por su uso");
                    break;
                    
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            
        } while (opcion != 4);
    }

}
