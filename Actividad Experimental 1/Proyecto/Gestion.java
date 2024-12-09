package Proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestion {
    public static void main(String[] args) {
        List<Proyecto> proyectos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú de Gestión de Proyectos:");
            System.out.println("1. Añadir Proyecto");
            System.out.println("2. Asignar Tarea");
            System.out.println("3. Cambiar Estado de Tarea");
            System.out.println("4. Ver Proyectos");
            System.out.println("5. Cerrar");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del proyecto: ");
                    String nombreProyecto = scanner.nextLine();
                    proyectos.add(new Proyecto(nombreProyecto));
                    System.out.println("Proyecto añadido correctamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del proyecto donde asignar la tarea: ");
                    String proyectoParaTarea = scanner.nextLine();
                    Proyecto proyectoEncontrado = null;

                    for (Proyecto proyecto : proyectos) {
                        if (proyecto.obtenerNombreProyecto().equalsIgnoreCase(proyectoParaTarea)) {
                            proyectoEncontrado = proyecto;
                            break;
                        }
                    }

                    if (proyectoEncontrado != null) {
                        System.out.print("Ingrese el nombre de la tarea: ");
                        String nombreTarea = scanner.nextLine();
                        System.out.print("Ingrese la descripción de la tarea: ");
                        String descripcionTarea = scanner.nextLine();
                        System.out.print("Ingrese el responsable de la tarea: ");
                        String responsable = scanner.nextLine();
                        proyectoEncontrado.agregarTarea(nombreTarea,descripcionTarea, responsable);
                        System.out.println("Tarea asignada correctamente.");
                    } else {
                        System.out.println("Proyecto no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del proyecto donde está la tarea: ");
                    String proyectoParaEstado = scanner.nextLine();
                    Proyecto tareaEstado = null;

                    for (Proyecto proyecto : proyectos) {
                        if (proyecto.obtenerNombreProyecto().equalsIgnoreCase(proyectoParaEstado)) {
                            tareaEstado = proyecto;
                            break;
                        }
                    }

                    if (tareaEstado != null) {
                        System.out.print("Ingrese el nombre de la tarea a completar: ");
                        String nombreTarea = scanner.nextLine();
                        tareaEstado.cambiarEstadoTarea(nombreTarea);
                    } else {
                        System.out.println("Proyecto no encontrado.");
                    }
                    break;

                case 4:
                    if (proyectos.isEmpty()) {
                        System.out.println("No hay proyectos registrados.");
                    } else {
                        for (Proyecto proyecto : proyectos) {
                            proyecto.mostrarInformacionProyecto();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Cerrando el sistema. ¡Hasta pronto!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}
