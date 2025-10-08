public class Cuadrado extends Poligono {
    private int l;
    private double lado;
    public int getL() {
        return l;
    }
    public void setL(int l) {
        this.l = l;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return lado * 4;
    }

    @Override
    public String toString() {
        return "Cuadrado";
    }
}