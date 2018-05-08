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
public class Mecanico implements Serializable {
     
    private String fechaIngreso;
    private String nombreMecanico;
  
    private String telefonoMecanico;
    private String identificacionMecanico;
    private String correoMecanico;
   
    private String seguroMecanico;
    private String observacion;
    private double valorPagar;
    private ArrayList<Trabajo> trabajos = new ArrayList<Trabajo>();

 
//// CONSTRUCTOR POR DEFECTO ////////
    public Mecanico(){
//        trabajos = new ArrayList<Trabajo>();
        nombreMecanico = "";
        fechaIngreso = "";
       
        telefonoMecanico = "";
        identificacionMecanico = "";
        correoMecanico = "";
      
        seguroMecanico = "";
        observacion = "";
        valorPagar=0;
    }
//// CONSTRUCTOR POR DEFECTO ////////
    
    //// CONSTRUCTOR POR PARAMETRO ////////
    public Mecanico(String fechaIngreso, String nombreMecanico, String telefonoMecanico, String identificacionMecanico, String correoMecanico, String seguroMecanico, String observacion) {
        this.fechaIngreso = fechaIngreso;
        this.nombreMecanico = nombreMecanico;
       
        this.telefonoMecanico = telefonoMecanico;
        this.identificacionMecanico = identificacionMecanico;
        this.correoMecanico = correoMecanico;
       
        this.seguroMecanico = seguroMecanico;
        this.observacion = observacion;
     }
  //// CONSTRUCTOR POR PARAMETRO ////////
    
    ////////// SETTERS Y GETTERS
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombreMecanico() {
        return nombreMecanico;
    }

    public void setNombreMecanico(String nombreMecanico) {
        this.nombreMecanico = nombreMecanico;
    }

    public String getTelefonoMecanico() {
        return telefonoMecanico;
    }

    public void setTelefonoMecanico(String telefonoMecanico) {
        this.telefonoMecanico = telefonoMecanico;
    }

    public String getIdentificacionMecanico() {
        return identificacionMecanico;
    }

    public void setIdentificacionMecanico(String identificacionMecanico) {
        this.identificacionMecanico = identificacionMecanico;
    }

    public String getCorreoMecanico() {
        return correoMecanico;
    }

    public void setCorreoMecanico(String correoMecanico) {
        this.correoMecanico = correoMecanico;
    }

    public String getSeguroMecanico() {
        return seguroMecanico;
    }

    public void setSeguroMecanico(String seguroMecanico) {
        this.seguroMecanico = seguroMecanico;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
   
     public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }
    
    public ArrayList<Trabajo> getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(ArrayList<Trabajo> trabajos) {
        this.trabajos = trabajos;
    }
   
    //// SETTERES Y GETTERS ////////
    
    
    public void agregarTrabajo(Trabajo tr){
      trabajos.add(tr);
    }
    
///// Metodos de trabajo ///////
    public void agregarMaterial(int a, Material n){

        if(trabajos.get(a).getPiezas().get(0).getNombre().equals("") && trabajos.get(a).getPiezas().get(0).getCantidad()==0){
            trabajos.get(a).getPiezas().get(0).setNombre(n.getNombre());
            trabajos.get(a).getPiezas().get(0).setCantidad(n.getCantidad());
            trabajos.get(a).getPiezas().get(0).setPrecio(n.getPrecio());
           
            trabajos.get(a).getPiezas().get(0).agregarProveedor(n.getProveedores().get(0));
            
            trabajos.get(a).setPrecioMaterial(trabajos.get(a).getPrecioMaterial()+(n.getPrecio()*n.getCantidad()));
          
        }else{
            System.out.println("pasa por aqui");
            trabajos.get(a).agregarMaterial(n);
            trabajos.get(a).setPrecioMaterial(trabajos.get(a).getPrecioMaterial()+(n.getPrecio()*n.getCantidad()));
            
        }
        for(int i=0; i<trabajos.get(a).getPiezas().size(); i++){
            JOptionPane.showMessageDialog(null,"Material Agregado!! -- nombre: "+trabajos.get(a).getPiezas().get(i).getNombre()+" cantidad "+trabajos.get(a).getPiezas().get(i).getCantidad());
            JOptionPane.showMessageDialog(null,"Total en piezas: "+trabajos.get(a).getPrecioMaterial());
            System.out.println(trabajos.get(a).getPiezas().get(i).getProveedores().size());
//            for(int j=0; j<trabajos.get(a).getPiezas().get(i).getProveedores().size(); j++){
//             JOptionPane.showMessageDialog(null,"Proveedores!! -- nombre: "+trabajos.get(a).getPiezas().get(i).getProveedores().get(j).getNombre());
//            }
            }
    }
    
    public void aumentarHoras(int a, int n){
        if(trabajos.get(a).getPlazoMaximo()-n > 0){
        trabajos.get(a).setNumeroHora(trabajos.get(a).getNumeroHora()+n);
        trabajos.get(a).setPlazoMaximo(trabajos.get(a).getPlazoMaximo()-n);
        if(trabajos.get(a).getPlazoMaximo()-n > 0 && trabajos.get(a).getPlazoMaximo()-n <10 ){
            JOptionPane.showMessageDialog(null,"Se acaba el tiempo limite para realizar el Trabajo","Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        }else{
            JOptionPane.showMessageDialog(null,"Ha sobrepasado el plazo maximo a cumplir -- NO SE AGREGAN MAS HORAS DE TRABAJO --");
            trabajos.get(a).setTrabajoFinalizado(true);
            trabajos.get(a).setNumeroHora(trabajos.get(a).getPlazoMaximo());
        }
    }
    public void finalizarTrabajo(int a){
       trabajos.get(a).setTrabajoFinalizado(true);
    }
    
   
    //// fin de los metodos de trabajo ///
}
