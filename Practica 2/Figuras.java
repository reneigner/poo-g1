import java.util.Scanner;

public class Figuras {
    final static double PI = 3.1416;
    public static void main(String[] args) {
        int opcion;
        Scanner e = new Scanner(System.in);
        do {
            System.out.println("Elige una opcion:");
            System.out.println("1 - Área del Círculo");
            System.out.println("2 - Área del Triángulo");
            System.out.println("3 - Área del Cuadrado");
            System.out.println("4 - Salir");
            opcion = e.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste círculo");
                    System.out.println("El área del círculo es " + areaCirculo(15.0));
                    break;
                case 2:
                    System.out.println("Seleccionaste triángulo");
                    System.out.println("El área del triángulo es " + areaTriangulo(8.0, 5.0));
                    break;
                case 3:
                    System.out.println("Seleccionaste cuadrado");
                    System.out.println("El área del cuadrado es " + areaCuadrado(10.0));
                    break;
                case 4:
                    System.out.println("Salida de la aplicación...");
                    continue;
                default:
                    System.out.println("Opción no válida...");
                    continue;
            }
        } while (opcion != 4);
        e.close();
    }

    public static double areaCirculo(double radio) {
        return PI * radio * radio;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2.0;
    }

    public static double areaCuadrado(double lado) {
        return lado * lado;
    }
}
