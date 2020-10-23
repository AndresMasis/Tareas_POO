/*
Subclase
 */
package semana5y6;

public final class Triangulo extends Figura {

    // Variables propias (semana 5)
    private double base, altura, a, b, c;
    
    // Metodo propio (semana 5)
    public void pedirLados(){
        System.out.println("Dame un lado del triangulo");
        a = in.nextInt();
        
        System.out.println("Dame otro lado del triangulo");
        b = in.nextInt();
        
        System.out.println("Dame el tercer lado del triangulo");
        c = in.nextInt();
    }

    // Se sobreescriben los metodos segun se ocupa (semana 5)
    @Override
    public void pedirDatos() {
        System.out.println("Dame la base del triangulo");
        base = in.nextInt();

        System.out.println("Dame la altura del triangulo");
        altura = in.nextInt();
    }
    
    @Override
    public double calcularPerimetro() {
        perimetro = a + b + c;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        area = (base * altura) / 2;
        return area;
    }
    
    // Metodo abstracto semana 6
    @Override
    public int cantidadLados() {
        return 3;
    }

}
