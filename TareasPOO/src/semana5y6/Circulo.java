/*
Subclase
 */
package semana5y6;

public final class Circulo extends Figura {

    // Variables propias (semana 5)
    private double radio;

    // Se sobreescriben los metodos segun se ocupa (semana 5)
    @Override
    public void pedirDatos() {
        System.out.println("Dame el radio del circulo");
        radio = in.nextInt();
    }

    @Override
    public double calcularPerimetro() {
        perimetro = 2 * radio * 3.14;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        area = 3.14 * radio * radio;
        return area;
    }

    // Metodo abstracto semana 6
    @Override
    public int cantidadLados() {
        // Un circulo tiene un unico lado, la circunferencia
        return 1;
    }

}
