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
public class Mecanica extends Trabajo implements Costo{

    public Mecanica() {
        super();
    }

    @Override
    public double calcularManoObra(double x, int h) {
        return (h*12000)+(x*1.1);
    }
}
