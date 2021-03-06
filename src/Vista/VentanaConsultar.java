/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import static Vista.TallerDeMecanicaApp.op;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Astrid
 */
public class VentanaConsultar extends javax.swing.JDialog {

    
    String titulo[]={"Nombre","Identificacion","Telefono","Correo","Cargo","Matricula Vehiculo","Numero de Horas trabajadas","Diagnostico"};
    Object datos[][];
    DefaultTableModel modelo ;
    /**
     * Creates new form VentanaConsultar
     */
    public VentanaConsultar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cerrar();
        modelo =  new DefaultTableModel(datos,titulo);
        tablaCliente.setModel(modelo);
     }
    
    public boolean buscar(String id){
        for(int i= 0; i<op.getClientes().size();i++){
            for(int j=0; j<op.getClientes().get(i).getVehiculo().size(); j++){
                if(op.getClientes().get(i).getIdentificacion().equals(id) || op.getClientes().get(i).getVehiculo().get(j).getMatricula().equals(id)){
                    for(int l=0; l<op.getClientes().get(i).getMecanico().size(); l++){
                        for(int k= 0; k<op.getClientes().get(i).getMecanico().get(l).getTrabajos().size(); k++){
                            txtTrabajo.setText(op.getClientes().get(i).getMecanico().get(l).getTrabajos().get(k).getCodigo());
                            txtFecha.setText(""+op.getClientes().get(i).getMecanico().get(l).getTrabajos().get(k).getPlazoMaximo()/24+" Dias");
                            txtObservaciones.setText(""+op.getClientes().get(i).getMecanico().get(l).getObservacion());
                            if(op.getClientes().get(i).getMecanico().get(l).getTrabajos().get(k).isTrabajoFinalizado()==true){txtEstado.setText("Finalizado");}
                            if(op.getClientes().get(i).getMecanico().get(l).getTrabajos().get(k).isTrabajoFinalizado()==false){txtEstado.setText("En proceso");}
                            return true;
                                }
                            }
                }
            }
        
        }
        return false;
        }
    
    public void llenarTabla(String ide){
     int a=0;
     for(int i=0; i<tablaCliente.getRowCount();i++){
                modelo.removeRow(i);
        }
    
     for(int i=0; i<op.getClientes().size(); i++){
         for(int j=0; j<op.getClientes().get(i).getVehiculo().size();j++){
             if(op.getClientes().get(i).getIdentificacion().equals(ide) || op.getClientes().get(i).getVehiculo().get(j).getMatricula().equals(ide)){
                 a = i;
             }
         }
     }
     
     
   
        String nombre= op.getClientes().get(a).getNombre();
        String id= op.getClientes().get(a).getIdentificacion();
        String telefono= op.getClientes().get(a).getTelefono();
        String correo = op.getClientes().get(a).getCorreo();
        String cargo = op.getClientes().get(a).getCargo();
        String matricula="";
        String horasTrabajadas="";
        String diagnostico = "";
        for(int j=0; j<op.getClientes().get(a).getVehiculo().size();j++){
            matricula = op.getClientes().get(a).getVehiculo().get(j).getMatricula();
            }
        for(int j=0; j<op.getClientes().get(a).getMecanico().size();j++){
            for(int k=0; k<op.getClientes().get(a).getMecanico().get(j).getTrabajos().size(); k++){
            horasTrabajadas = ""+op.getClientes().get(a).getMecanico().get(j).getTrabajos().get(k).getNumeroHora();
            diagnostico = op.getClientes().get(a).getMecanico().get(j).getTrabajos().get(k).getDiagnostico();
               }
            }
    String datos2[]={nombre,id,telefono,correo,cargo,matricula,horasTrabajadas,diagnostico};
    modelo.addRow(datos2);
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConsulta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTrabajo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Cliente");
        setResizable(false);

        panelConsulta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));

        jLabel1.setText("Codigo del Trabajo");

        jLabel3.setText("Estado del Trabajo");

        jLabel2.setText("Plazo Maximo");

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaCliente);

        jLabel4.setText("Observaciones:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConsultaLayout = new javax.swing.GroupLayout(panelConsulta);
        panelConsulta.setLayout(panelConsultaLayout);
        panelConsultaLayout.setHorizontalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(txtObservaciones)
                    .addGroup(panelConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar)))
                .addContainerGap())
        );
        panelConsultaLayout.setVerticalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnAceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        VentanaMecanico mecanico = new VentanaMecanico(null,true);
        mecanico.setLocationRelativeTo(null);
        mecanico.setVisible(true);
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaConsultar dialog = new VentanaConsultar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelConsulta;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtTrabajo;
    // End of variables declaration//GEN-END:variables
}
