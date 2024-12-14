/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion_parqueaderos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GESTION_PARQUEADEROS {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        //Vehiculo veh1 = new Vehiculo (1, "PCY5868","WILLIAM","MOTOCICLETA");
        //System.out.println("el id del vehiculo es: " + veh1.getPlaca());
        
    Parqueadero parqueadero = new Parqueadero();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu Parqueadero ===");
            System.out.println("1. Registrar vehiculo");
            System.out.println("2. Consultar vehiculo");
            System.out.println("3. Actualizar vehiculo");
            System.out.println("4. Lista de vehiculos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese la placa: ");
                    String placa = scanner.next();
                    System.out.print("Ingrese Propietario: ");
                    String propietario = scanner.next();
                    System.out.print("Ingrese Tipo Vehiculo: ");
                    String tipo = scanner.next();
                    parqueadero.registrarVehiculo(new Vehiculo(placa, propietario, tipo));
            }
                case 2 -> {
                    System.out.print("Ingrese la placa del vehículo a consultar: ");
                String placa = scanner.next();
                Vehiculo vehiculo = parqueadero.consultarVehiculo(placa);
                if (vehiculo != null) {
                    System.out.println("\nINFORMACIÓN ENCONTRADA: \n");
                    System.out.println("Placa: " + vehiculo.getPlaca());
                    System.out.println("Propietario: " + vehiculo.getPropietario());
                    System.out.println("Tipo: " + vehiculo.getTipo());
                } else {
                    System.out.println("Vehículo no encontrado.");
                }
            }
                case 3 -> {
                    System.out.print("Ingrese la placa del vehículo a actualizar: ");
                String placa = scanner.next();
                System.out.print("Ingrese nuevo propietario: ");
                String nuevoPropietario = scanner.next();
                System.out.print("Ingrese nuevo tipo: ");
                String nuevoTipo = scanner.next();
                parqueadero.actualizarVehiculo(placa, nuevoPropietario, nuevoTipo);
            }
                case 4 -> {
                parqueadero.listarVehiculos();
            }
                case 5 -> {
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                
            }
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}
    
