/*
Subclase
 */
package semana5y6;


public final class Rectangulo extends Figura implements Comparable<Rectangulo> {

    // Variables propias (semana 5)
    private double largo, ancho;

    // Se sobreescriben los metodos segun se ocupa (semana 5)
    @Override
    public void pedirDatos() {
        System.out.println("Dame el largo del rectangulo");
        largo = in.nextInt();

        System.out.println("Dame el ancho del rectangulo");
        ancho = in.nextInt();
    }

    @Override
    public double calcularPerimetro() {
        perimetro = (2 * largo) + (2 * ancho);
        return perimetro;
    }

    @Override
    public double calcularArea() {
        area = largo * ancho;
        return area;
    }

    // Metodo abstracto semana 6
    @Override
    public int cantidadLados() {
        return 4;
    }

    
    // Metodo CompareTo (semana6)
    public int compareTo(Rectangulo rectPorComparar) {
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();

        if (miArea == areaPorComparar) {
            return 0;
        } else if (miArea > areaPorComparar) {
            return 1;
        } else {
            // Se compara por numero de lados (semana 6)
            int misLados = this.cantidadLados();
            int ladosPorComparar = rectPorComparar.cantidadLados();

            if (misLados == ladosPorComparar) {
                return 0;
            } else if(misLados > ladosPorComparar){
                return 1;
            } else {
                return -1;
            }
        }
    }

}
