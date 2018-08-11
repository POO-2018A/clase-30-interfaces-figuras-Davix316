
package figuras;

/**
 *
 * @author TOSHIBA
 */
public class Cuadrado implements Interfaz{

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculararea() {
        return (lado*lado);
    }

    @Override
    public double calcularperimetro() {
        return (4*lado);
    }
    
}
