/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Datos.Pais;
import Datos.Provincia;

/**
 *
 * @author fernando guiñazú
 */
public class FormProvincia extends javax.swing.JFrame {

    /**
     * Creates new form FromProvincia
     */
    public FormProvincia() {
        initComponents();
        look();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProv = new javax.swing.JTable();
        comboPais = new javax.swing.JComboBox();
        nombreProv = new javax.swing.JTextField();
        altaProvincia = new javax.swing.JButton();
        modificarProvincia = new javax.swing.JButton();
        dato = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        eliminarProvincia = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tablaProv.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProv);

        comboPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        altaProvincia.setText("Alta de provincia");
        altaProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaProvinciaActionPerformed(evt);
            }
        });

        modificarProvincia.setText("Modificar Provincia");
        modificarProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarProvinciaActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        eliminarProvincia.setText("Eliminar provincia");
        eliminarProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProvinciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(altaProvincia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modificarProvincia)
                        .addGap(152, 152, 152))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboPais, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dato, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscar)
                                .addGap(18, 18, 18)
                                .addComponent(eliminarProvincia)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar)
                    .addComponent(eliminarProvincia))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarProvincia)
                    .addComponent(altaProvincia))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaProvinciaActionPerformed
        
        ControlForm control = new ControlForm();
        Provincia prov = new Provincia();
        
        String nombre = nombreProv.getText();
        Pais pais     = (Pais) comboPais.getSelectedItem();
        prov.insertProvincia(nombre,pais.getId());
        
        tablaProv.setModel(control.cargarTabla("",prov));
        nombreProv.setText("");
        control.ocultarColumnas(2, tablaProv);
    }//GEN-LAST:event_altaProvinciaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ControlForm control = new ControlForm();
        comboPais.setModel(control.cargarComboPais());
        
        Provincia prov = new Provincia();
        tablaProv.setModel(control.cargarTabla("", prov));
        control.ocultarColumnas(2, tablaProv);
        
    }//GEN-LAST:event_formWindowActivated

    private void tablaProvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProvMouseClicked
         int fila   = tablaProv.getSelectedRow();
         String nombre  = tablaProv.getValueAt(fila,2).toString();
         nombreProv.setText(nombre);
         
         int idpais     = Integer.parseInt(tablaProv.getValueAt(fila,0).toString());
         String nompais = tablaProv.getValueAt(fila,3).toString();
         
         Pais pais = new Pais(idpais,nompais);
         comboPais.getModel().setSelectedItem(pais);
         
    }//GEN-LAST:event_tablaProvMouseClicked

    private void eliminarProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProvinciaActionPerformed
        int fila   = tablaProv.getSelectedRow();
        int idprov = Integer.parseInt(tablaProv.getValueAt(fila,1).toString());
        
        ControlForm control = new ControlForm();
        Provincia prov      = new Provincia();
        prov.eliminarProvincia(idprov);
        
        tablaProv.setModel(control.cargarTabla("", prov));
        control.ocultarColumnas(2, tablaProv);
        
        
    }//GEN-LAST:event_eliminarProvinciaActionPerformed

    private void modificarProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarProvinciaActionPerformed
        int fila   = tablaProv.getSelectedRow();
        int idprov = Integer.parseInt(tablaProv.getValueAt(fila,0).toString());
        
        
        ControlForm control = new ControlForm();
        
        Pais pais = (Pais) comboPais.getSelectedItem();
        
        Provincia prov = new Provincia();
        prov.modifcarProvincia(nombreProv.getText(), idprov, pais.getId());
        
        tablaProv.setModel(control.cargarTabla("", prov));
        control.ocultarColumnas(2, tablaProv);
        nombreProv.setText("");
    }//GEN-LAST:event_modificarProvinciaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        ControlForm control = new ControlForm();
        Provincia provi = new Provincia();
        tablaProv.setModel(control.cargarTabla(dato.getText(),provi));
        control.ocultarColumnas(2, tablaProv);
        dato.setText("");
    }//GEN-LAST:event_buscarActionPerformed


    public static void look() {        
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
            java.util.logging.Logger.getLogger(FormProvincia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProvincia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProvincia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProvincia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altaProvincia;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox comboPais;
    private javax.swing.JTextField dato;
    private javax.swing.JButton eliminarProvincia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarProvincia;
    private javax.swing.JTextField nombreProv;
    private javax.swing.JTable tablaProv;
    // End of variables declaration//GEN-END:variables
}
