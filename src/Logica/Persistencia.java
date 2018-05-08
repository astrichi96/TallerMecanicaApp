/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Astrid
 */
public class Persistencia {
     ////// Metodo para escribir los datos de la Agenda /////
    
    public static void escribirContacto(TallerMecanico op){
//        try {
//            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("Datos.txt"));
//            escribir.writeObject(op);
//            //escribir.close();
//            JOptionPane.showMessageDialog(null,"Archivo creado con exito");
//        } catch (IOException ex) {
//             ex.printStackTrace();
//        }
        try {
            ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream("Datos.txt"));
            guardar.writeObject(op);
            JOptionPane.showMessageDialog(null, "Archivo guardado satisfactoriamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error , no se pudo guardar");
            System.out.println(e.getMessage());
        }
     }
   ////// Metodo para leer los datos de la Agenda 
    public static TallerMecanico leerContacto(){
//        try{
//              ObjectInputStream leer = new ObjectInputStream (new FileInputStream("Datos.txt"));
//             TallerMecanico op = (TallerMecanico)leer.readObject();
//              leer.close();
//              
//              //JOptionPane.showMessageDialog(null,"Archivo Leido Con exito");
//              return op;
//        }catch(IOException e ){
//                //e.printStackTrace();
//                return null;
//        }catch(ClassNotFoundException e){
//            //e.printStackTrace();
//            return null;
//        }
        try {
            ObjectInputStream cargar = new ObjectInputStream(new FileInputStream("Datos.txt"));
            TallerMecanico administracion = (TallerMecanico) cargar.readObject();   
            return administracion;
         } catch (IOException | ClassNotFoundException e) {
            return null;
        }
      
    }
}
