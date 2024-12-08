package clases;

// Objeto clase Pedido
public class Pedido {
    public String nombreCliente;
    public double costo;
    public int numRecibo;

    public Pedido(String nombreCliente, double costo, int numRecibo){
        this.nombreCliente = nombreCliente;
        this.costo = costo;
        this.numRecibo = numRecibo;
    }

    //Acciones a realizar
    public void calcularValor() {
        System.out.println("Calculando el valor del pedido de " + nombreCliente + ", cuyo valor "
                + "es " + costo + "$ con el numero de recibo " + numRecibo);
    }
}
