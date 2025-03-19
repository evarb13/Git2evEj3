

public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;

    void incrementarSueldo(int porcentaheIncremento){
        this.sueldo+=sueldo*(1+porcentaheIncremento/100.0);
    }
}
