public class Ejercicio2 {
    public static void main(String[] args) {
        InstrumentoMusical instrumento;

        instrumento = new Guitarra();
        instrumento.afinar();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
    }
}