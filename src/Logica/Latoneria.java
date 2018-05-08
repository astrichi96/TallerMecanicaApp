/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.util.ArrayList;

/**
 *
 * @author Astrid
 */
public class Latoneria extends Trabajo implements Costo{

    public Latoneria() {
        super();
    }
    
    @Override
    public double calcularManoObra(double c,int h){
        return (h*12000)+(c*1.3);
    }
}
