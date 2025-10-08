public class Triangulo extends Poligono {
    private int a, b, c;
    private double base, altura;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return (base * altura) / 2;
    }

    public double perimetro() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triángulo";
    }
}