/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.io.Serializable;

/**
 *
 * @author Astrid
 */
public class Vehiculo implements Serializable{
 
   private String marca;
   private String modelo;
   private String anioVehiculo;
   private String matricula;
   private String clase;
   private String serial;
   private String observaciones;

    public Vehiculo(String marca, String modelo, String anioVehiculo, String matricula, String clase, String serial, String observaciones) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioVehiculo = anioVehiculo;
        this.matricula = matricula;
        this.clase = clase;
        this.serial = serial;
        this.observaciones = observaciones;
    }
  
   public Vehiculo(){
       modelo = "";
       matricula = "";
       anioVehiculo = "";
       marca = "";
       clase = "";
       serial = "";
       observaciones = "";
   }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAnioVehiculo() {
        return anioVehiculo;
    }

    public void setAnioVehiculo(String anioVehiculo) {
        this.anioVehiculo = anioVehiculo;
    }
   
}
