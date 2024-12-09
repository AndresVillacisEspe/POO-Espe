package clases;
// Objeto clase Producto
public class Producto {
    public String nombre;
    public double precio;
    public int cantidad;

    public Producto(String nombre,double precio,int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    //Acciones a realizar
    public void consultarStock() {
        System.out.println("Consultando el stock del producto, en total hay " + cantidad
                + " " + nombre);
    }
    public void comprarCantidad(Pedido pedido) {
        System.out.println("Comprando cantidad del producto del pedido número: " + pedido.numRecibo);
    }
}
