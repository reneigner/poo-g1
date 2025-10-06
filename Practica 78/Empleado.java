public class Empleado {
    private String nombre;
    private int numEmpleado, sueldo;

    public Empleado(String nombre, int sueldo, int numEmpleado) {
        setNombre(nombre);
        setNumEmpleado(numEmpleado);
        setSueldo(sueldo);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumEmpleado() {
        return numEmpleado;
    }
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    public int getSueldo() {
        return sueldo;
    }
    public void setSueldo(int sueldo) {
        if (sueldo >= 0) {
            this.sueldo = sueldo;
        }
    }

    public void aumentarSueldo(int porcentaje) {
        sueldo += (int)(sueldo * porcentaje / 100);
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + 
            "\nNúmero: " + getNumEmpleado() + 
            "\nSueldo: " + getSueldo();
    }
}