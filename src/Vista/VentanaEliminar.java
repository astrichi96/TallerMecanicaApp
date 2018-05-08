/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Logica.Cliente;
import Logica.Persistencia;
import static Vista.TallerDeMecanicaApp.op;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Astrid
 */
public class VentanaEliminar extends javax.swing.JDialog {
    
     String titulo[]={"Nombre","Telefono","Direccion","Identificacion","Cargo"};
     Object datos[][];
     
     DefaultTableModel modelo ;
    
    /**
     * Creates new form VentanaEliminar
     */
    public VentanaEliminar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cerrar();
        //llenarTablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEliminar = new javax.swing.JTable();
        btnEliminarTrabajo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Trabajos");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true), "Trabajos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 102, 102))); // NOI18N

        tablaEliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Telefono", "Direccion", "Identificacion", "Cargo"
            }
        ));
        jScrollPane1.setViewportView(tablaEliminar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEliminarTrabajo.setText("Eliminar Trabajo");
        btnEliminarTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTrabajoActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione lo que deseea eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarTrabajo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarTrabajo)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTrabajoActionPerformed
        // TODO add your handling code here:
       
        this.dispose(); 
       
        try{
        //// elimina un trabajo de la tabla de trabajos
        DefaultTableModel model = (DefaultTableModel) tablaEliminar.getModel();
        int a = tablaEliminar.getSelectedRow();
        model.removeRow(a);
        op.getClientes().remove(a);
//        Persistencia.escribirContacto(op);
        VentanaMecanico mecanico = new VentanaMecanico(null,true);
        mecanico.setLocationRelativeTo(null);
        mecanico.setVisible(true);
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,"Debe seleccionar lo que desea eliminar","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        VentanaPrincipal.archivo = false;
    }//GEN-LAST:event_btnEliminarTrabajoActionPerformed

    public void llenarTablas(){
        modelo =  new DefaultTableModel(datos,titulo);
        tablaEliminar.setModel(modelo);
    
        DefaultTableModel model = (DefaultTableModel) tablaEliminar.getModel();
        Object datos[] = new Object[5];
      
        for(int i=0;i<op.getClientes().size();i++){
            datos[0] = op.getClientes().get(i).getNombre();
            datos[1] = op.getClientes().get(i).getTelefono();
            datos[2] = op.getClientes().get(i).getDireccion();
            datos[3] = op.getClientes().get(i).getIdentificacion();
            datos[4] = op.getClientes().get(i).getCargo();
            model.addRow(datos);
        }
        tablaEliminar.setModel(model);
    }
    
    public void cerrar() {
        try {
            /*confirmacion de salida*/
            this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            addWindowListener( new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();
                }
            });
         //   this.setVisible(true);//hacemos visible el frame
        }catch (Exception e) {
//            e.printStackTrace();
        }
    }
    
    public void confirmarSalida(){
//        int i =JOptionPane.showConfirmDialog(this,"¿Esta seguro de salir del programa?","Confirmar Salida",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
//        if(i==0){
//            ;
            this.dispose();
            VentanaMecanico mecanico = new VentanaMecanico(null,true);
            mecanico.setLocationRelativeTo(null);
            mecanico.setVisible(true);
            //System.exit(0);  
            
//        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaEliminar dialog = new VentanaEliminar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarTrabajo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEliminar;
    // End of variables declaration//GEN-END:variables
}