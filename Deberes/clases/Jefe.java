package clases;

// Objeto clase Jefe
public class Jefe {
    public String nombre;
    public int salario;

    public Jefe(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    //Acciones a realizar
    public void pagar(Empleado empleado) {
        System.out.println("El jefe " + nombre + " está pagando a "+ empleado.nombre);
    }
    public void administrar() {
        System.out.println("El jefe " + nombre + " está administrando su salario de "
                + salario + "$");
    }
}

