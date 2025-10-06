public class MainApp {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Don Cangrejo", 20000, 1001, 100000);
        gerente.aumentarSueldo(20);
        System.out.println(gerente);
    }
}