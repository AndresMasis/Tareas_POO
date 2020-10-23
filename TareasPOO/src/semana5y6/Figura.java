/*
Superclase
Posee los métodos y atributos más elementales.
 */
package semana5y6;

import java.util.Scanner;

public abstract class Figura {

    // Variables universales (semana 5)
    protected double area, perimetro;
    protected Scanner in = new Scanner(System.in);

    // Metodos universales (semana 5)
    public void mostrarPerimetro() {
        System.out.println("El perimetro de la figura es " + perimetro);
    }

    public void mostrarArea() {
        System.out.println("El area de la figura es " + area);
    }

    // Metodos que se sobreescriben (semana 5)
    public abstract void pedirDatos();
    public abstract double calcularPerimetro();
    public abstract double calcularArea();
    
    // Metodo abstracto de catnidad de lados (semana 6)
    public abstract int cantidadLados();
}
