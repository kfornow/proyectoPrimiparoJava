
package VISTAS.CRUD_ADMIN;
import VISTAS.CRUD_ADMIN.jframe_añadir;
import LOGICA.logica_cr_admin;
import VISTAS.AJUSTES.jframe_ajustes;


/*todas las partes basicamente de este jframe se han declarado como publicas
y se han enviado sus actributos 
a una clase la cual se llama logica_cr_admin*/



public class jframe_main_cr_admin extends javax.swing.JFrame {

    
    //instanseo las clases a utilizar
    logica_cr_admin logica_crud_admin =new logica_cr_admin();
    jframe_cr_editar_admin editar =new jframe_cr_editar_admin();
    jframe_añadir añadir =new jframe_añadir();
   
    public jframe_main_cr_admin() {
        initComponents();
        //centramos la ventana en la pantalla
        this.setLocationRelativeTo(null);
        //pocicionamos el menu
        jPopupMenu1.add(menu);
        //volvemos invisible en textfiel
        txt_id.setVisible(false);
        //llamamos al metodo por medio del objecto
        logica_crud_admin.buscar();

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_editar = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_eliminar = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        label_añadir = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setAutoscrolls(true);
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 51, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel5.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 20));

        menu.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 20));

        jPanel6.setBackground(new java.awt.Color(204, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_eliminar.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel6.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 20));

        menu.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 60, 20));

        jPopupMenu1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id_admin", "cc_admin", "contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setComponentPopupMenu(jPopupMenu1);
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.setGridColor(new java.awt.Color(204, 204, 204));
        tabla.setSelectionBackground(new java.awt.Color(255, 102, 0));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 620, 330));

        txt_buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_buscar.setBorder(null);
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });
        jPanel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 160, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icono_buscar.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, 40));

        label_añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icono_añadir.png"))); // NOI18N
        label_añadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_añadirMousePressed(evt);
            }
        });
        jPanel1.add(label_añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, 70));
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 10, -1));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 190, 2));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 480));

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
        logica_crud_admin.cliquear();//llamamos al metodo cliquear
    }//GEN-LAST:event_tablaMouseClicked

    private void btn_editarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMousePressed

        editar.setVisible(true);//hacemos visible la ventana de editar
  
    }//GEN-LAST:event_btn_editarMousePressed

    private void btn_eliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMousePressed
       //traemos todos estos metodos si clieque la opcion eliminar del popmenu
        logica_crud_admin.cliquear();
        logica_crud_admin.eliminar();
        logica_crud_admin.buscar();
    }//GEN-LAST:event_btn_eliminarMousePressed

    private void label_añadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_añadirMousePressed
       //hacemos visible la ventana añadir
        añadir.setVisible(true);
        //cerramos la ventana actual
        this.setVisible(false);
    }//GEN-LAST:event_label_añadirMousePressed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        logica_crud_admin.buscar();//llamamos al metodo buscar
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
        logica_crud_admin.buscar();
    }//GEN-LAST:event_jMenu1MousePressed

    private void jMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MousePressed
        //instanceamos esta clase
        jframe_ajustes jframe_ajustes = new jframe_ajustes();
        //la llamamos y hacemos visible una ventana
        jframe_ajustes.setVisible(true);
        //cerramos la ventana actual
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2MousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_main_cr_admin().setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_editar;
    private javax.swing.JLabel btn_eliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_añadir;
    private javax.swing.JPanel menu;
    public static javax.swing.JTable tabla;
    public static javax.swing.JTextField txt_buscar;
    public static javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
