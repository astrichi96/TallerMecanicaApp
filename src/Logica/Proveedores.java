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
public class Proveedores implements Serializable {
    
    private String nombre;
    private  String codigo;
    private String fax;
    private String pais;

    public Proveedores() {
        nombre = "";
        codigo = "";
        fax = "";
        pais = "";
    }

    public Proveedores(String nombre, String codigo, String fax, String pais) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fax = fax;
        this.pais = pais;
    }
 
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
   
}
