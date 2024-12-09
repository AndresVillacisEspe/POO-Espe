package Proyecto;

class Tarea {
    public String nombre;
    public String descripcion;
    public String responsable;
    public String estado;

    public Tarea(String nombre,String descripcion, String responsable) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.responsable = responsable;
        this.estado = "Pendiente";
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void completar() {
        this.estado = "Completada";
    }

    public void tareaInformormacion() {
        System.out.println("Tarea: "+ nombre + ", Descripcion: " + descripcion + ", Responsable: " + responsable
                + ", Estado: " + estado);
    }
}