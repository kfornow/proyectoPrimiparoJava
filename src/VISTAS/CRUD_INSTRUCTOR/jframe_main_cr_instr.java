
package VISTAS.CRUD_INSTRUCTOR;
import VISTAS.AJUSTES.jframe_ajustes;
import VISTAS.REGISTRO.jframe_registro;
import LOGICA.logica_cr_main_instructor;
import VISTAS.CRUD_INSTRUCTOR.jframe_editar_cr_instr;
import VISTAS.CRUD_INSTRUCTOR.jframe_instructores_inactiv;
import VISTAS.CRUD_INSTRUCTOR.jframe_asisten_cr_instr;


/*todas las partes basicamente de este jframe se han declarado como publicas
y se han enviado sus actributos 
a una clase la cual se llama logica_cr_main_instructor*/

        
public class jframe_main_cr_instr extends javax.swing.JFrame {

    //instanceo las clases pertinentes  a trabajar
    logica_cr_main_instructor logica_cr_instructor = new logica_cr_main_instructor();
    
    jframe_editar_cr_instr jframe_editar_cr_instr =new jframe_editar_cr_instr();
    

    
    public jframe_main_cr_instr() {
        initComponents();
        //inivisiviliso la caja de texto txt_id_edit 
        this.txt_id_edit.setVisible(false);
        //centro la ventena
        this.setLocationRelativeTo(null);
        //llamo al menu flotante pasandole como atributo un panel que tiene otros paneles dentro
        this.jPopupMenu1.add(menu);  
        //llamo al objecto y llamo al metodo buscar
        logica_cr_instructor.buscar();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btn_editar = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn_desactivar = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_id_edit = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_recargar = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menu_ajustes = new javax.swing.JMenu();
        menu_agregar = new javax.swing.JMenu();

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setAutoscrolls(true);
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 51, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_editar.setFont(new java.awt.Font("Roboto Light", 1, 10)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_editar.setText("EDITAR");
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_editarMousePressed(evt);
            }
        });
        jPanel7.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));

        menu.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));

        jPanel8.setBackground(new java.awt.Color(204, 0, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_desactivar.setBackground(new java.awt.Color(255, 255, 255));
        btn_desactivar.setFont(new java.awt.Font("Roboto Light", 1, 10)); // NOI18N
        btn_desactivar.setForeground(new java.awt.Color(255, 255, 255));
        btn_desactivar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_desactivar.setText("DESACTIVAR");
        btn_desactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_desactivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_desactivarMousePressed(evt);
            }
        });
        jPanel8.add(btn_desactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));

        menu.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 20));

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
                "documento", "nombre", "apellido", "edad", "telefono", "email", "contraseña", "tipo_d_contrato", "estado"
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
        tabla.setGridColor(new java.awt.Color(0, 0, 0));
        tabla.setSelectionBackground(new java.awt.Color(255, 153, 0));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 860, 330));

        txt_buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_buscar.setBorder(null);
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });
        jPanel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 170, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icono_buscar.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 40, 30));
        jPanel1.add(txt_id_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 20, 30));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 200, 3));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 440));

        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menu_recargar.setBorder(null);
        menu_recargar.setText("Recargar");
        menu_recargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_recargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_recargarMousePressed(evt);
            }
        });
        jMenuBar1.add(menu_recargar);

        jMenu2.setBorder(null);
        jMenu2.setText("Asistencia Instructor");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(null);
        jMenu3.setText("Usuarios desactivados");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        menu_ajustes.setBorder(null);
        menu_ajustes.setText("Ajustes");
        menu_ajustes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_ajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_ajustesMousePressed(evt);
            }
        });
        jMenuBar1.add(menu_ajustes);

        menu_agregar.setBorder(null);
        menu_agregar.setText("agregar");
        menu_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_agregarMousePressed(evt);
            }
        });
        jMenuBar1.add(menu_agregar);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        logica_cr_instructor.cliquear();//llamo al objecto a al metodo cliquear
    }//GEN-LAST:event_tablaMouseClicked

    private void btn_editarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMousePressed

        jframe_editar_cr_instr.setVisible(true);//hago visible al jframe editar
        logica_cr_instructor.cliquear();//llamo al objecto y tomo el metodo cliquear otra vez
    }//GEN-LAST:event_btn_editarMousePressed

    private void btn_desactivarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_desactivarMousePressed
        //llamo distintos metodos por medio del mismo objecto
        logica_cr_instructor.cliquear();
        logica_cr_instructor.desactivar();
        logica_cr_instructor.buscar();
        
    }//GEN-LAST:event_btn_desactivarMousePressed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        logica_cr_instructor.buscar();//llamo otraves al mismo objecto y tomo el metodo buscar
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void menu_agregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_agregarMousePressed
        //instanceo  la clase jframe añadir
        jframe_añadir agregar = new jframe_añadir();
        agregar.setVisible(true);//tomo su objecto y la hago visible
        logica_cr_instructor.buscar();//llamo a este objecto otraves y tomamos otravez el metodo buscar
        this.setVisible(false);//cerramos la ventana actual
    }//GEN-LAST:event_menu_agregarMousePressed

    private void menu_recargarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_recargarMousePressed
        logica_cr_instructor.buscar();//llamo otra vez a este objecto y tomo el metodo buscar otra vez
    }//GEN-LAST:event_menu_recargarMousePressed

    private void menu_ajustesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_ajustesMousePressed
        
        //instanceo la clase jframe ajustes 
        jframe_ajustes jframe_ajustes = new jframe_ajustes();
        jframe_ajustes.setVisible(true);//tomo el objecto y por medio de el obtengo el atributo para hacerla visible
        this.setVisible(false);//cerramos la ventana en la que estamos posisionados
        
        
    }//GEN-LAST:event_menu_ajustesMousePressed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
          
       // instaceno la clase jframe_instructores_inactiv    
        jframe_instructores_inactiv  jframe_instr_inactiv = new jframe_instructores_inactiv();
        jframe_instr_inactiv.setVisible(true);//tomo el objecto y por medio de elobtengo el atributo para hacerlo visible 
         this.setVisible(false);//cierro la ventana actual
          
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // instanceo la clase jframe_asisten_cr_instr 
        jframe_asisten_cr_instr jframe_asisten_cr_instr = new jframe_asisten_cr_instr();  
        jframe_asisten_cr_instr.setVisible(true);//tomo el objecto y por medio de el hago visible la ventana
        this.setVisible(false);//cierro la ventana actual
    }//GEN-LAST:event_jMenu2MouseClicked

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe_main_cr_instr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(() -> {
            new jframe_main_cr_instr().setVisible(true);
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_desactivar;
    private javax.swing.JLabel btn_editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    private javax.swing.JMenu menu_agregar;
    private javax.swing.JMenu menu_ajustes;
    private javax.swing.JMenu menu_recargar;
    public static javax.swing.JTable tabla;
    public static javax.swing.JTextField txt_buscar;
    public static javax.swing.JTextField txt_id_edit;
    // End of variables declaration//GEN-END:variables
}
