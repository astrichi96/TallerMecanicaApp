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
public class Material implements Serializable {
    
    private String nombre;
    private double precio;
    private int cantidad;
    private ArrayList<Proveedores> proveedores;

    public Material(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        proveedores = new ArrayList<Proveedores>();
    }

    ///// Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList<Proveedores> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<Proveedores> proveedores) {
        this.proveedores = proveedores;
    }
    
    public void agregarProveedor(Proveedores e){
    proveedores.add(e);
    }
    
}
