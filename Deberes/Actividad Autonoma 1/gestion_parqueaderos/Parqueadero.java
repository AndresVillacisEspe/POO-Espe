package gestion_parqueaderos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;

public class Parqueadero {
    
    private ArrayList<Vehiculo> listaVehiculos;

    public Parqueadero() {
        listaVehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
        System.out.println("Vehículo registrado con éxito.");
    }
    
    
    
    public Vehiculo consultarVehiculo(String placa) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }

    public void listarVehiculos() {
        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
        } else {
            System.out.println("\n=== Lista de Vehículos Registrados ===");
            for (Vehiculo v : listaVehiculos) {
                System.out.println("Placa: " + v.getPlaca() + ", Propietario: " + v.getPropietario() + ", Tipo Vehiculo: " + v.getTipo());
            }
        }
    }
    
    public void actualizarVehiculo(String placa, String propietario, String tipo) {
        Vehiculo vehiculo = consultarVehiculo(placa);
        if (vehiculo != null) {
            vehiculo.setPlaca(placa);
            vehiculo.setPropietario(propietario);
            vehiculo.setTipo(tipo);
            System.out.println("Vehículo actualizado con éxito.");
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }
}


