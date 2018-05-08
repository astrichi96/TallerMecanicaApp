/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Astrid
 */
public class Cliente implements Serializable{
    ///// DATOS DEL CLIENTE /////
    private String nombre;
    private String telefono;
    private String correo;
    private String identificacion;
    private String direccion;
    private String cargo;
    private String tipo;
    private boolean descuento;
    private boolean pago;
    ////// DATOS DEL CONTACTO DEL CLIENTE ////
    private String nombreContacto;
    private String correoContacto;
    private String identificacionContacto;
    private String telefonoContacto;
    private String cargoContacto;
    
    
    private ArrayList<Vehiculo> vehiculo = new ArrayList<Vehiculo>();
    private ArrayList<Mecanico> mecanico = new ArrayList<Mecanico>();

    public Cliente(String nombre, String telefono, String correo, String identificacion, String direccion, String cargo, String tipo, String nombreContacto, String correoContacto, String identificacionContacto, String telefonoContacto, String cargoContacto, ArrayList<Vehiculo> vehiculo, ArrayList<Mecanico> mecanico) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.cargo = cargo;
        this.tipo = tipo;
        this.nombreContacto = nombreContacto;
        this.correoContacto = correoContacto;
        this.identificacionContacto = identificacionContacto;
        this.telefonoContacto = telefonoContacto;
        this.cargoContacto = cargoContacto;
        this.vehiculo = vehiculo;
        this.mecanico = mecanico;
          }

    
    public Cliente(){
        nombre = "";
        telefono = "";
        correo = "";
        identificacion = "";
        direccion = "";
        cargo = "";
        nombreContacto = "";
        correoContacto = "";
        identificacionContacto = "";
        telefonoContacto = "";
        cargoContacto = "";
        descuento = false;
        pago = false;
//        vehiculo = new ArrayList<Vehiculo>();
//        mecanico = new ArrayList<Mecanico>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ArrayList<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ArrayList<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ArrayList<Mecanico> getMecanico() {
        return mecanico;
    }

    public void setMecanico(ArrayList<Mecanico> mecanico) {
        this.mecanico = mecanico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    public String getIdentificacionContacto() {
        return identificacionContacto;
    }

    public void setIdentificacionContacto(String identificacionContacto) {
        this.identificacionContacto = identificacionContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getCargoContacto() {
        return cargoContacto;
    }

    public void setCargoContacto(String cargoContacto) {
        this.cargoContacto = cargoContacto;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    

    public void agregarVehiculo(Vehiculo obj, Mecanico obj1){
        vehiculo.add(obj);
        mecanico.add(obj1);
       
    }
  public void calcularManoObra(String o,int a, double c, int h){
       if(o.equals("Latoneria")){
       mecanico.get(a).setValorPagar((h*12000)+(c*1.3));
       }
       if(o.equals("Mecanico")){
       mecanico.get(a).setValorPagar((h*12000)+(c*1.1));
       }   
       if(o.equals("Revision")){
       mecanico.get(a).setValorPagar(85000);
      }
   }
    
    
}
