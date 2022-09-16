
package VISTAS.CRUD_INSTRUCTOR;
import  LOGICA.logica_cr_instruc_inactiv;
import VISTAS.CRUD_INSTRUCTOR.jframe_main_cr_instr;



/*todas las partes basicamente de este jframe se han declarado como publicas
y se han enviado sus actributos 
a una clase la cual se llama logica_cr_instruc_inactiv*/

public class jframe_instructores_inactiv extends javax.swing.JFrame {
    
    //instanceo las clases a utilizar
    logica_cr_instruc_inactiv logica_cr_instr_inactiv = new logica_cr_instruc_inactiv();
    
    jframe_main_cr_instr jframe_cr_instr_main = new jframe_main_cr_instr ();
    
    public jframe_instructores_inactiv() {
        initComponents();
        //centro la ventana en la pantalla
        this.setLocationRelativeTo(null);
        //llamo al objecto y saco el metodo que se llama buscar
        logica_cr_instr_inactiv.buscar();
        //traigo  el menu flotante y le otorgo como atributo un panel que tiene varios paneles dentro
        this.jPopupMenu1.add(menu);
        this.txt_id_edit.setVisible(false);//hago invisible el texfield que utilizaremos mas adelante
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btn_activar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_eliminar = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txt_id_edit = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setAutoscrolls(true);
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(204, 204, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_activar.setFont(new java.awt.Font("Roboto Light", 1, 10)); // NOI18N
        btn_activar.setForeground(new java.awt.Color(255, 255, 255));
        btn_activar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_activar.setText("ACTIVAR");
        btn_activar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_activar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_activarMousePressed(evt);
            }
        });
        jPanel9.add(btn_activar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        menu.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_eliminar.setFont(new java.awt.Font("Roboto Light", 1, 10)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_eliminarMousePressed(evt);
            }
        });
        jPanel2.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));

        menu.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 20));

        jPopupMenu1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "documento", "nombre", "apellido", "edad", "telefono", "email", "contraseña", "tipo_de_contrato", "estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setComponentPopupMenu(jPopupMenu1);
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla.setGridColor(new java.awt.Color(0, 0, 0));
        tabla.setSelectionBackground(new java.awt.Color(255, 153, 0));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 860, 390));
        jPanel1.add(txt_id_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 20, 30));

        txt_buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_buscar.setBorder(null);
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });
        jPanel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 160, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icono_buscar.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, 40, 30));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 160, 3));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

        jMenu1.setText("Recargar");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Volver");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu2MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        logica_cr_instr_inactiv.cliquear();//llamo este objecto y tomo el metodo cliquear
    }//GEN-LAST:event_tablaMouseClicked

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        logica_cr_instr_inactiv.buscar();//llamo el mismo objecto y tomo esta vez el metodo de buscar
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void btn_activarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_activarMousePressed
       //llamo el mismo objecto y tomo todos estos metodos
        logica_cr_instr_inactiv.cliquear();
        logica_cr_instr_inactiv.activar();
        logica_cr_instr_inactiv.buscar();
    }//GEN-LAST:event_btn_activarMousePressed

    private void btn_eliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMousePressed
        //llamo el mismo objecto y tomo todos estos metodos
        logica_cr_instr_inactiv.cliquear();
        logica_cr_instr_inactiv.eliminar();
        logica_cr_instr_inactiv.buscar();
    }//GEN-LAST:event_btn_eliminarMousePressed

    private void jMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MousePressed
        
        jframe_cr_instr_main.setVisible(true);//llamo este objecto tomando sus atributos haciendo visible la ventana
        this.setVisible(false);//cerramos la venta en la que estamos posisionados
    }//GEN-LAST:event_jMenu2MousePressed

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
       logica_cr_instr_inactiv.buscar();//llamamos otraves a este objecto y tomamos el metodo buscar
    }//GEN-LAST:event_jMenu1MousePressed

   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(jframe_instructores_inactiv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe_instructores_inactiv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe_instructores_inactiv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe_instructores_inactiv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_instructores_inactiv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_activar;
    private javax.swing.JLabel btn_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    public static javax.swing.JTable tabla;
    public static javax.swing.JTextField txt_buscar;
    public static javax.swing.JTextField txt_id_edit;
    // End of variables declaration//GEN-END:variables
}
