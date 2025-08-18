import java.util.Scanner;

public class Ejemplo0 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Ingresa valor de operador 1: ");
        int op1 = e.nextInt();
        System.out.print("Ingresa valor de operador 2: ");
        int op2 = e.nextInt();
        e.close();
        op1 += op2;
        boolean res = op1 > 0 ? true : false;
        System.out.println("El resultado de la comparación es: " + res);
    }   
}