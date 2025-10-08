public class InstrumentoCuerdas extends Object implements InstrumentoMusical {
    public void tocar() {
        System.out.println("Tocando instrumento de cuerdas.");
    }
    public void afinar() {
        System.out.println("Afinando las cuerdas del instrumento.");
    }
    public String tipoInstrumento() {
        return "Instrumento de cuerdas";
    }
}