


public class Departamento {
    private String nombre;
    private int numEmpleados;
    private Empleado[] empleados = new Empleado[2];
    void anadir(Empleado v){
        empleados[0]=v;
    }

    public Departamento(String nombre, int numEmpleados) {
        this.nombre = nombre;
        this.numEmpleados = numEmpleados;
    }
}
