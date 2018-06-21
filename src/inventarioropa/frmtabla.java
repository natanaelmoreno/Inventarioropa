
package inventarioropa;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class frmtabla extends javax.swing.JFrame {
    metodos mos=new metodos();
    ResultSet rs=null;
    /**
     * Creates new form frmtabla
     */
    DefaultTableModel modelotabla=new DefaultTableModel(); 
    public frmtabla() {
        initComponents();
        setSize(850,500);
       
       this.setLocationRelativeTo(rootPane);
      
        setTitle(" bodega yael");
        
        
        modelotabla.addColumn("Codigo");
        modelotabla.addColumn("Articulo");
        modelotabla.addColumn("Material");
        modelotabla.addColumn("Marca");
        modelotabla.addColumn("Talla");
        modelotabla.addColumn("Pais");
        modelotabla.addColumn("Existencias");
        tblmostrar.setModel(modelotabla);
      mostrar();
    }
    
     public void mostrar(){
         rs=null;
        rs=mos.llenarTabla();
        modelotabla.setRowCount(0);
        try {
            while (rs.next()) {                
              String codigo = rs.getString(1);
                String articulo = rs.getString(2);
                String material = String.valueOf(rs.getInt(3));
                String marca = String.valueOf(rs.getInt(4));
                  String talla =String.valueOf(rs.getInt(5));
                   String pais = String.valueOf(rs.getInt(6));
                   String existencias = rs.getString(7);
                Object datos[]=new Object[7];
            datos[0]=codigo;
            datos[1]=articulo;
            datos[2]=material;
            datos[3]=marca;
            datos[4]=talla;
            datos[5]=pais;
            datos[6]=existencias;
            modelotabla.addRow(datos);
            tblmostrar.setModel(modelotabla);
            }
            
        } catch (Exception e) {
        }
        
        
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblmostrar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnregresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblmostrar.setModel(modelotabla);
        tblmostrar.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblmostrar.setAutoscrolls(false);
        tblmostrar.setColumnSelectionAllowed(true);
        tblmostrar.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(tblmostrar);
        tblmostrar.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 775, 350));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 648, 77, 49));

        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dfgh.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
       Principal obj=new Principal ();
        obj.setVisible(true);
        
        //SIRVE PARA OCULTAR EL FORMULARIO ANTERIOR
        dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmtabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmtabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmtabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmtabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmtabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblmostrar;
    // End of variables declaration//GEN-END:variables
}
