package clases;

// Objeto clase Cliente
public class Cliente {
    public String nombre;
    public double dinero;
    public double saldo;

    public Cliente(String nombre, int dinero, int saldo){
        this.nombre = nombre;
        this.dinero = dinero;
        this.saldo = saldo;
    }
    //Acciones a realizar
    public void comprar(Producto producto) {
        System.out.println("El cliente " + nombre + " está comprando " + producto.nombre + ", pagando " +
                "con un total de " + dinero + "$");
    }

    public void pagar(Pedido pedido) {
        System.out.println("El cliente " + nombre + " está pagando " + pedido.costo + "$ ," +
                " quedando con un saldo pendiente de: " + saldo + "$");
    }
}
