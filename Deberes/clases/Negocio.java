package clases;
// Clase principal
public class Negocio {
    public static void main(String[] args) {
        // Creamos instancias de los objetos
        Jefe jefe = new Jefe("Carlos",5000);
        Empleado empleado = new Empleado("Juan",18);
        Pedido pedido = new Pedido("Marco",350.57,56981);
        Producto producto = new Producto("Procesador",350.57,10);
        Cliente cliente = new Cliente("Marco",500,0);

        // Establecemos relación entre los objetos y vemos el resultado de los métodos
        jefe.pagar(empleado);
        jefe.administrar();

        empleado.cobrar(pedido);
        empleado.vender(producto);

        pedido.calcularValor();

        producto.consultarStock();
        producto.comprarCantidad(pedido);

        cliente.comprar(producto);
        cliente.pagar(pedido);
    }
}
