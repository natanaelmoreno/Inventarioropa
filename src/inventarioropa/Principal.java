/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioropa;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author NATANAEL MORENO
 */
public class Principal extends javax.swing.JFrame {

    ResultSet rs = null;

    DefaultComboBoxModel modeloarticulo = new DefaultComboBoxModel();
    DefaultComboBoxModel modelomaterial = new DefaultComboBoxModel();
    DefaultComboBoxModel modelomarca = new DefaultComboBoxModel();
    DefaultComboBoxModel modelotalla = new DefaultComboBoxModel();
    DefaultComboBoxModel modelopais = new DefaultComboBoxModel();

    metodosdos articulo = new metodosdos();
    metodosdos material = new metodosdos();
    metodosdos marca = new metodosdos();
    metodosdos talla = new metodosdos();
   metodosdos pais = new metodosdos();

    /**
     * Creates new form Principal
     */
    metodos llamar = new metodos();
    boolean encontrado = false;
    
    public Principal() {
        initComponents();
         this.setLocationRelativeTo(rootPane);

        setTitle(" YAEL");

        // llenado de combobox articulos
        rs = articulo.llenarArticulos();
        modeloarticulo.addElement("seleccione");
        try {
            while (rs.next()) {
                modeloarticulo.addElement(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
        }
        //cmbarticulo.setModel(modeloarticulo);

        // llenado de combobox materiales
        rs = material.llenarMateriales();
        modelomaterial.addElement("seleccione");
        try {
            while (rs.next()) {
                modelomaterial.addElement(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
        }
        cmbmaterial.setModel(modelomaterial);

        // llenado de combobox marcas
        rs = marca.llenarMarcas();
        modelomarca.addElement("seleccione");
        try {
            while (rs.next()) {
                modelomarca.addElement(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
        }
        cmbmarca.setModel(modelomarca);

        // llenado de combobox tallas
        rs = talla.llenarTallas();
        modelotalla.addElement("seleccione");
        try {
            while (rs.next()) {
                modelotalla.addElement(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
        }
        cmbtalla.setModel(modelotalla);

        // llenado de combobox pais 
        rs = pais.llenarPaises();
        modelopais.addElement("seleccione");
        try {
            while (rs.next()) {
                modelopais.addElement(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
        }
        cmbpais.setModel(modelopais);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtexistencia = new javax.swing.JTextField();
        txtarticulo = new javax.swing.JTextField();
        cmbtalla = new javax.swing.JComboBox<>();
        cmbmarca = new javax.swing.JComboBox<>();
        cmbmaterial = new javax.swing.JComboBox<>();
        cmbpais = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGModificar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("bodega Yael");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 28, -1, -1));

        jLabel2.setText("Codigo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 99, -1, -1));

        jLabel3.setText("Existencia");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 155, -1, -1));

        jLabel4.setText("Articulo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 210, -1, -1));

        jLabel5.setText("Talla");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 263, -1, -1));

        jLabel6.setText("Marca");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 315, -1, -1));

        jLabel7.setText("Material");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 371, -1, -1));

        jLabel8.setText("Pais");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 422, -1, -1));
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 96, 166, -1));
        jPanel1.add(txtexistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 152, 166, -1));
        jPanel1.add(txtarticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 207, 166, -1));

        jPanel1.add(cmbtalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 260, 166, -1));

        jPanel1.add(cmbmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 312, 166, -1));

        jPanel1.add(cmbmaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 368, 166, -1));

        jPanel1.add(cmbpais, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 419, 166, -1));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 95, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 151, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 206, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 259, -1, -1));

        btnGModificar.setText("Guardar Modificacion");
        btnGModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 367, -1, -1));

        btnSalir.setText("salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 418, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
          txtarticulo.setText("");
        cmbmaterial.setSelectedIndex(0);
        cmbmarca.setSelectedIndex(0);
        cmbtalla.setSelectedIndex(0);
        cmbpais.setSelectedIndex(0); 

        desbloquear();
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
          if (this.txtarticulo.getText() == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un articulo", "AVISO DEL SISTEMA", 2);

        } else if (this.cmbmaterial.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un material", "AVISO DEL SISTEMA", 2);

        } else if (this.cmbmarca.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una marca", "AVISO DEL SISTEMA", 2);

        } else if (this.cmbtalla.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una talla", "AVISO DEL SISTEMA", 2);

        } else if (this.cmbpais.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un pais", "AVISO DEL SISTEMA", 2);

        } else {
            llamar.insertar7(this.txtcodigo.getText(),this.txtarticulo.getText(), this.cmbmaterial.getSelectedIndex(), this.cmbmarca.getSelectedIndex(), this.cmbtalla.getSelectedIndex(), this.cmbpais.getSelectedIndex(), Integer.parseInt(this.txtexistencia.getText()));
            System.out.println("ingreso exitoso");
    }        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         String codigo = JOptionPane.showInputDialog("Ingrese el código del articulo a búscar:");
        if (codigo != null) {
            rs = llamar.buscar7(codigo);
        } else {

            JOptionPane.showMessageDialog(null, "nell perro no puede");
        }

        encontrado = false;

        try {
            
            while (rs.next()) {
                this.txtcodigo.setText(rs.getString(1));
                
                this.txtarticulo.setText(rs.getString(2));
                this.cmbmarca.setSelectedIndex(rs.getInt(3));
                this.cmbtalla.setSelectedIndex(rs.getInt(4));
                this.cmbpais.setSelectedIndex(rs.getInt(5));
                 this.cmbmaterial.setSelectedIndex(rs.getInt(6));
                this.txtexistencia.setText(rs.getString(7));
                
                encontrado = true;
                JOptionPane.showMessageDialog(null, "encontrado");

                txtarticulo.setEnabled(false);
                cmbmaterial.setEnabled(false);
                cmbmarca.setEnabled(false);
                cmbtalla.setEnabled(false);
                cmbpais.setEnabled(false);
                  txtexistencia.setEnabled(false);
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(rootPane, "Registro no encontrado!!!", "AVISO DEL SISTEMA", 0);
               
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (encontrado == true) {
            desbloquear();

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGModificarActionPerformed
          llamar.modificar7(this.txtcodigo.getText(), this.txtarticulo.getText(),this.cmbmarca.getSelectedIndex(), this.cmbtalla.getSelectedIndex() , this.cmbpais.getSelectedIndex(),this.cmbmaterial.getSelectedIndex(),  Integer.parseInt(this.txtexistencia.getText()));
        JOptionPane.showMessageDialog(rootPane, "Registro modificado con éxito.", "AVISO DEL SISTEMA", 1);
    }//GEN-LAST:event_btnGModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
       //  frmtabla ropa=new frmtabla();
    //ropa.setVisible(true);
    dispose();
    }//GEN-LAST:event_btnMostrarActionPerformed
 public void limpiar() {
        txtcodigo.setText("");
        txtexistencia.setText("");
    }

    public void desbloquear() {
        txtcodigo.setEnabled(true);
        txtarticulo.setEnabled(true);
        cmbmaterial.setEnabled(true);
        cmbmarca.setEnabled(true);
        cmbtalla.setEnabled(true);
        cmbpais.setEnabled(true);

    }

    public void bloquear() {
        txtcodigo.setEnabled(false);
        txtarticulo.setEnabled(false);
        cmbmaterial.setEnabled(false);
        cmbmarca.setEnabled(false);
        cmbtalla.setEnabled(false);
        cmbpais.setEnabled(false);
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGModificar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbmarca;
    private javax.swing.JComboBox<String> cmbmaterial;
    private javax.swing.JComboBox<String> cmbpais;
    private javax.swing.JComboBox<String> cmbtalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtarticulo;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtexistencia;
    // End of variables declaration//GEN-END:variables
}
