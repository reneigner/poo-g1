public class Ejercicio1 {
    public static void main(String[] args) {
        Poligono poligono;

        //Polimorfismo estático
        poligono = new Triangulo();
        System.out.println(poligono);
        poligono = new Cuadrado();
        System.out.println(poligono);
        poligono = new TrianguloEq();
        System.out.println(poligono);
    }
}