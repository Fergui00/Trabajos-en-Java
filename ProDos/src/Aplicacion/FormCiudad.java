/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

/**
 *
 * @author fernando guiñazú
 */

import Datos.Ciudad;
import Datos.Provincia;
import Datos.Pais;

public class FormCiudad extends javax.swing.JFrame {

    /**
     * Creates new form FormCiudad
     */
    public FormCiudad() {
        initComponents();
        look();
        
        Ciudad ciu = new Ciudad();
        
        ControlForm cform = new ControlForm();
        tablaciudad.setModel(cform.cargarTabla("", ciu));
        cform.ocultarColumnas(3, tablaciudad);
        
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
        tablaciudad = new javax.swing.JTable();
        datobusqueda = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboProv = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        comboPais = new javax.swing.JComboBox();
        crudprov = new javax.swing.JButton();
        crudpais = new javax.swing.JButton();
        darAlta = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tablaciudad.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaciudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaciudadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaciudad);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese la ciudad");

        jLabel2.setText("Seleccione Provincia");

        comboProv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Seleccione Pais");

        comboPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPaisItemStateChanged(evt);
            }
        });

        crudprov.setText("CRUDPR");
        crudprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudprovActionPerformed(evt);
            }
        });

        crudpais.setText("CRUDPS");
        crudpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudpaisActionPerformed(evt);
            }
        });

        darAlta.setText("Alta");
        darAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darAltaActionPerformed(evt);
            }
        });

        modificar.setText("Mod");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setText("Elim");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombre)
                                    .addComponent(comboPais, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(datobusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(buscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(comboProv, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eliminar)
                            .addComponent(crudprov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(crudpais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(darAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datobusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar)
                    .addComponent(eliminar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modificar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crudpais))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crudprov))
                .addGap(18, 18, 18)
                .addComponent(darAlta)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void darAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darAltaActionPerformed
       ControlForm cformu = new ControlForm();
       
       Ciudad ciu = new Ciudad();
       Provincia prov = (Provincia) comboProv.getSelectedItem();
       
       String  ciudad = nombre.getText();
       int     idprov = prov.getId();
       
       ciu.insertCiudad(ciudad,idprov);
       tablaciudad.setModel(cformu.cargarTabla("",ciu));
       cformu.ocultarColumnas(3, tablaciudad);
    }//GEN-LAST:event_darAltaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ControlForm formu = new ControlForm();
        comboPais.setModel(formu.cargarComboPais());
        
        Pais pais = (Pais) comboPais.getSelectedItem();
        comboProv.setModel(formu.cargarComboProvincia(pais.getId()));
        
    }//GEN-LAST:event_formWindowActivated

    private void comboPaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPaisItemStateChanged
        ControlForm formu = new ControlForm();
        
        Pais pais = (Pais) comboPais.getSelectedItem();
        comboProv.setModel(formu.cargarComboProvincia(pais.getId()));
    }//GEN-LAST:event_comboPaisItemStateChanged

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        ControlForm cformu = new ControlForm();
        Ciudad ciu = new Ciudad();
        tablaciudad.setModel(cformu.cargarTabla(datobusqueda.getText(),ciu));
        cformu.ocultarColumnas(3, tablaciudad);
    }//GEN-LAST:event_buscarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        ControlForm cformu = new ControlForm();
        
        Ciudad ciu = new Ciudad();
        Provincia prov = (Provincia) comboProv.getSelectedItem();
        
        int fila = tablaciudad.getSelectedRow();
        int id   = Integer.parseInt(tablaciudad.getValueAt(fila,0).toString());
        
        ciu.modificarCiudad(id,nombre.getText(),prov.getId());
        tablaciudad.setModel(cformu.cargarTabla("", ciu));
        cformu.ocultarColumnas(3, tablaciudad);
        
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        ControlForm cform = new ControlForm();
        int fila = tablaciudad.getSelectedRow();
        
        Ciudad ciu = new Ciudad();
        
        int id = Integer.parseInt(tablaciudad.getValueAt(fila,0).toString());
        ciu.eliminarCiudad(id);
        
        tablaciudad.setModel(cform.cargarTabla("",ciu));
        cform.ocultarColumnas(3, tablaciudad);
    }//GEN-LAST:event_eliminarActionPerformed

    private void tablaciudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaciudadMouseClicked
        int fila = tablaciudad.getSelectedRow();
        
        String ciudad  = tablaciudad.getValueAt(fila,3).toString();
        String nompais = tablaciudad.getValueAt(fila,5).toString();
        String nomprov = tablaciudad.getValueAt(fila,4).toString();
        
        int idpais = Integer.parseInt(tablaciudad.getValueAt(fila,2).toString());
        int idprov = Integer.parseInt(tablaciudad.getValueAt(fila,1).toString());
        
        Pais pais = new Pais(idpais,nompais);
        Provincia prov = new Provincia(idprov,nomprov);
        
        nombre.setText(ciudad);
        comboPais.getModel().setSelectedItem(pais);
        comboProv.getModel().setSelectedItem(prov);
    }//GEN-LAST:event_tablaciudadMouseClicked

    private void crudprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudprovActionPerformed
        FormProvincia fprov = new FormProvincia();
        fprov.setVisible(true);
    }//GEN-LAST:event_crudprovActionPerformed

    private void crudpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudpaisActionPerformed
        FormPais fpais = new FormPais();
        fpais.setVisible(true);
    }//GEN-LAST:event_crudpaisActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox comboPais;
    private javax.swing.JComboBox comboProv;
    private javax.swing.JButton crudpais;
    private javax.swing.JButton crudprov;
    private javax.swing.JButton darAlta;
    private javax.swing.JTextField datobusqueda;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tablaciudad;
    // End of variables declaration//GEN-END:variables
}
