package Proyecto;

import java.util.ArrayList;
import java.util.List;

class Proyecto {
    public String nombre;
    public List<Tarea> tareas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public String obtenerNombreProyecto() {
        return nombre;
    }

    public void agregarTarea(String nombre, String descripcion, String responsable) {
        Tarea nuevaTarea = new Tarea(nombre,descripcion, responsable);
        tareas.add(nuevaTarea);
    }

    public void cambiarEstadoTarea(String nombre) {
        for (Tarea tarea : tareas) {
            if (tarea.obtenerNombre().equalsIgnoreCase(nombre)) {
                tarea.completar();
                System.out.println("Tarea marcada como completada.");
                return;
            }
        }
        System.out.println("Tarea no encontrada.");
    }
    public void mostrarInformacionProyecto() {
        System.out.println("Proyecto: " + nombre);
        for (Tarea tarea : tareas) {
            tarea.tareaInformormacion();
        }
    }
}
