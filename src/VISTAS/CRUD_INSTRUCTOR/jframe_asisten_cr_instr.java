
package VISTAS.CRUD_INSTRUCTOR;

import LOGICA.logica_cr_asistencia;

/*todas las partes basicamente de este jframe se han declarado como publicas
y se han enviado sus actributos 
a una clase la cual se llama logica_cr_asistencia*/

public class jframe_asisten_cr_instr extends javax.swing.JFrame {
    
    //instanceo la clase
    logica_cr_asistencia logica_cr_asisten =new logica_cr_asistencia();
  
    public jframe_asisten_cr_instr() {
        initComponents();
        //vuelvo invicible el textfield  txt_id_edit 
        this.txt_id_edit.setVisible(false);
        //posisiono la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        //tomo el objecto de la clase que instancee antes y tomo el metodo de buscar
        logica_cr_asisten.buscar();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txt_id_edit = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_autodestruir = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_bar_recargar = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "documento", "fecha ingreso", "hora  ingreso", "fecha salida", "hora salida", "estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 590, 310));
        jPanel1.add(txt_id_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 20, 30));

        txt_buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_buscar.setBorder(null);
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });
        jPanel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 140, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icono_buscar.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 68, 50, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 140, 3));

        btn_autodestruir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icono_precaucion.png"))); // NOI18N
        btn_autodestruir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_autodestruir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 70, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 460));

        menu_bar_recargar.setText("Recargar");
        menu_bar_recargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_bar_recargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_bar_recargarMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_bar_recargar);

        jMenu2.setText("Volver");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
       logica_cr_asisten.buscar();//tomo el objecto de la clase que instancee antes y tomo el metodo de buscar
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void menu_bar_recargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_bar_recargarMouseClicked
        logica_cr_asisten.buscar();//tomo el objecto de la clase que instancee antes y tomo el metodo de buscar
    }//GEN-LAST:event_menu_bar_recargarMouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
       //instanceo la clase jframe_main_cr_instr para usarla nada mas aqui en este metodo
        jframe_main_cr_instr jframe_main_cr_instr = new jframe_main_cr_instr();
        jframe_main_cr_instr.setVisible(true);//tomo el objecto y hago visible la ventana 
        this.setVisible(false);//cierro la ventana en la que me encontraba posisionado
    }//GEN-LAST:event_jMenu2MouseClicked

    
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
            java.util.logging.Logger.getLogger(jframe_asisten_cr_instr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe_asisten_cr_instr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe_asisten_cr_instr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe_asisten_cr_instr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_asisten_cr_instr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel btn_autodestruir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menu_bar_recargar;
    public static javax.swing.JTable tabla;
    public static javax.swing.JTextField txt_buscar;
    public static javax.swing.JTextField txt_id_edit;
    // End of variables declaration//GEN-END:variables
}
