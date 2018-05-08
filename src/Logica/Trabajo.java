/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Astrid
 */
public class  Trabajo implements Serializable{
    protected String codigo;
    protected int numeroHora;
    protected int plazoMaximo;
    protected double precioMaterial;
    protected String tipoTrabajo;
    protected ArrayList<Material> piezas;
    protected String diagnostico;
    protected String nombreTrabajo;
    protected boolean trabajoFinalizado;

    public Trabajo(String codigo, int numeroHora, int plazoMaximo, boolean trabajoFinalizado,ArrayList<Material>piezas, double precioMaterial, String tipoTrabajo) {
        this.codigo = codigo;
        this.numeroHora = numeroHora;
        this.plazoMaximo = plazoMaximo;
        this.trabajoFinalizado = trabajoFinalizado;
        this.piezas = piezas;
        this.tipoTrabajo  = tipoTrabajo;
    }
    public Trabajo(){
        codigo = "";
        numeroHora = 0;
        plazoMaximo = 0;
        piezas = new ArrayList<Material>();
        trabajoFinalizado = false;
        precioMaterial = 0;
        tipoTrabajo = "";
        diagnostico = "";
        nombreTrabajo = "";
    }

    /// getters y setters  //////
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumeroHora() {
        return numeroHora;
    }

    public void setNumeroHora(int numeroHora) {
        this.numeroHora = numeroHora;
    }

    public int getPlazoMaximo() {
        return plazoMaximo;
    }

    public void setPlazoMaximo(int plazoMaximo) {
        this.plazoMaximo = plazoMaximo;
    }

    public ArrayList<Material> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Material> piezas) {
        this.piezas = piezas;
    }

    public boolean isTrabajoFinalizado() {
        return trabajoFinalizado;
    }

    public void setTrabajoFinalizado(boolean trabajoFinalizado) {
        this.trabajoFinalizado = trabajoFinalizado;
            }

    public double getPrecioMaterial() {
        return precioMaterial;
    }

    public void setPrecioMaterial(double precioMaterial) {
        this.precioMaterial = precioMaterial;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getNombreTrabajo() {
        return nombreTrabajo;
    }

    public void setNombreTrabajo(String nombreTrabajo) {
        this.nombreTrabajo = nombreTrabajo;
    }
    
    
    ///// Fin de getters y Setters
    
   public void agregarMaterial(Material obj){
      piezas.add(obj);  /// agrega al Arraylist de Materiales una pieza 
     
   }
   
   
  
}
