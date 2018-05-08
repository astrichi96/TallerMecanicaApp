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

package Vista;


import Logica.Persistencia;
import Logica.TallerMecanico;
import static java.lang.System.exit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Astrid
 */
public class TallerDeMecanicaApp {
    static TallerMecanico op = new TallerMecanico();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaPrincipal obj = new VentanaPrincipal();
        obj.setVisible(true);
        
//        op = Persistencia.leerContacto();
        
        try{
            if(Persistencia.leerContacto()!= null){
                op.getClientes().addAll(Persistencia.leerContacto().getClientes());
                op.getMaterialesPredeterminados().addAll(Persistencia.leerContacto().getMaterialesPredeterminados());
                
                JOptionPane.showMessageDialog(null,"Se han cargado los datos","Cargar",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"No se han cargado los datos","Cargar",JOptionPane.ERROR_MESSAGE); 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se han cargado los datos Exepcion","Cargar",JOptionPane.ERROR_MESSAGE); 
            exit(0);
        }
        
    }
    
}
