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

// Objeto clase Cliente
class Cliente {
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

// Objeto clase Empleado
class Empleado {
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

// Objeto clase Jefe
class Jefe {
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

// Objeto clase Pedido
class Pedido {
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

// Objeto clase Producto
class Producto {
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
