package gestion_parqueaderos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    //atributos
    //int idVehiculo;
    String placa;
    String propietario;
    String tipo;
    //Time horaEntrada;
    //Time horaSalida;
    
    
    //Constructor:
    public Vehiculo(String placa, String propietario, String tipo) {
        //this.idVehiculo = idVehiculo;
        this.placa = placa;
        this.propietario = propietario;
        this.tipo = tipo;
    }
    
    //Getter y setter va antes de los métodos
    
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getPropietario(){
        return propietario;
    }
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}
