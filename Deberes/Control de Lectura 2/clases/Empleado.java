package clases;

// Objeto clase Empleado
public class Empleado {
    public String nombre;
    public int edad;

    public Empleado(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    //Acciones a realizar
    public void cobrar(Pedido pedido) {
        System.out.println("El empleado " + nombre + " está cobrando " + pedido.costo +"$ del pedido de "
                + pedido.nombreCliente);
    }
    public void vender(Producto producto) {
        System.out.println("El empleado " + nombre + " está vendiendo " + producto.nombre + " a un precio " +
                "de " + producto.precio + "$");
    }
}