/************************************************* ***********************
* Palabra de honor:
* - No he discutido ni mostrado el código de mi programa con alguien que no sea mi compañero
*   Profesor o con el monitor asignado a este curso
* 
* - No he utilizado código obtenido de otro u otros estudiantes,
* O cualquier otra fuente no autorizada, ya sea modificado o sin modificar.
*
* - Si cualquier código o documentación utilizada en mi programa
* Fue obtenido de otra fuente, tal como un libro de texto o curso
* Notas, debe ser claramente señalado con una cita apropiada en
* Los comentarios de mi programa.
*
* ASTRID VANEGAS CHINCHILLA - 0221320005
*
************************************************** ********************* /
*/


package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Astrid
 */
public class TallerMecanico implements Serializable {
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Material> materialesPredeterminados;
    
    public TallerMecanico(){
        clientes = new ArrayList<>();
        materialesPredeterminados = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Material> getMaterialesPredeterminados() {
        return materialesPredeterminados;
    }

    public void setMaterialesPredeterminados(ArrayList<Material> materialesPredeterminados) {
        this.materialesPredeterminados = materialesPredeterminados;
    }
    
    public void agregarCliente(Cliente e){
        clientes.add(e);
//        for(int i=0; i<clientes.size(); i++){
//        JOptionPane.showMessageDialog(null,"nombre: "+clientes.get(i).getNombre()); 
//        }
    }
    
    public void agregarListaMateriales(Material obj){
       JOptionPane.showMessageDialog(null,"agrego");
        materialesPredeterminados.add(obj);
    }
    public void aplicarDescuento(double n, int a){
        for(int i = 0; i< clientes.get(a).getMecanico().size(); i++){
        if(clientes.get(a).getMecanico().get(i).getValorPagar()>450000){
            clientes.get(a).getMecanico().get(i).setValorPagar(clientes.get(a).getMecanico().get(i).getValorPagar()-(clientes.get(a).getMecanico().get(i).getValorPagar()*0.15));
            clientes.get(a).setDescuento(true);
            }else{
            JOptionPane.showMessageDialog(null,"El cliente no tiene descuentos disponibles");
        }
       
        }
    }
}
