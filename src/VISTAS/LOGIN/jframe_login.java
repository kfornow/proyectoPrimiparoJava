package VISTAS.LOGIN;
import java.awt.Color;
import javax.swing.JOptionPane;
import LOGICA.logica_login_admin;
import LOGICA.logica_login_instructor;
import VISTAS.REGISTRO.jframe_registro;
public class jframe_login extends javax.swing.JFrame  {
    
/*todas las partes basicamente de este jframe se han declarado como publicas
y se han enviado sus actributos 
a una clase la cual se llama logica_login_instrutor y otra clase que se llama logica login_admin */
    
     /*  instanceo la clase  login_admin la cual me trae toda la logica del logeo del administrador como tal */
    logica_login_admin login_admin =new logica_login_admin();
    
    /*  instanceo la clase  login_instructor la cual me trae toda la logica del logeo del instructor como tal */
    logica_login_instructor  login_instructor = new logica_login_instructor();
    
    //instanceo el jframe_registro para usarlo cuando preciones el boton de registrarse 
    
    
  
    
    
    public jframe_login() {
         
        initComponents();
     
        this.label_titulo_admin1.setVisible(false);//inivisibiliso el label que tiene como titulo iniciar seccion cuando se inicie el sistema 
        this.label_titulo_instructor.setVisible(true);//hago visible el label que tiene como titulo asistencia cuando incio el sistema
        this.setLocationRelativeTo(null); //posisionamos la ventana centradamente
    }
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        label_documento = new javax.swing.JLabel();
        txt_documento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JPasswordField();
        btt_iniciar_seccion = new javax.swing.JPanel();
        label_iniciar_seccion = new javax.swing.JLabel();
        btt_registrarse = new javax.swing.JPanel();
        label_resgistrarse = new javax.swing.JLabel();
        cb_seleccion = new javax.swing.JComboBox<>();
        label_titulo_instructor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        label_titulo_admin1 = new javax.swing.JLabel();
        cb_entrada_salida = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(850, 403));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/svg_login_sena.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 400));

        panel3.setBackground(new java.awt.Color(255, 255, 255));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_documento.setBackground(new java.awt.Color(255, 255, 255));
        label_documento.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_documento.setForeground(new java.awt.Color(255, 153, 0));
        label_documento.setText("DOCUMENTO");
        panel3.add(label_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 20));

        txt_documento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_documento.setBorder(null);
        txt_documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_documentoKeyTyped(evt);
            }
        });
        panel3.add(txt_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 160, 20));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("CONTRASEÑA");
        panel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 170, 20));

        txt_contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_contraseña.setBorder(null);
        txt_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contraseñaKeyTyped(evt);
            }
        });
        panel3.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 170, 20));

        btt_iniciar_seccion.setBackground(new java.awt.Color(255, 153, 0));
        btt_iniciar_seccion.setForeground(new java.awt.Color(51, 51, 51));
        btt_iniciar_seccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_iniciar_seccion.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        label_iniciar_seccion.setForeground(new java.awt.Color(255, 255, 255));
        label_iniciar_seccion.setText("   INICIAR SECCION");
        label_iniciar_seccion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_iniciar_seccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_iniciar_seccionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_iniciar_seccionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_iniciar_seccionMousePressed(evt);
            }
        });
        btt_iniciar_seccion.add(label_iniciar_seccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        panel3.add(btt_iniciar_seccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 120, 40));

        btt_registrarse.setBackground(new java.awt.Color(255, 153, 0));
        btt_registrarse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_resgistrarse.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        label_resgistrarse.setForeground(new java.awt.Color(255, 255, 255));
        label_resgistrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_resgistrarse.setText("REGISTRARSE");
        label_resgistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_resgistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_resgistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_resgistrarseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_resgistrarseMousePressed(evt);
            }
        });
        btt_registrarse.add(label_resgistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        panel3.add(btt_registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 110, 40));

        cb_seleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "instructor", "administrador" }));
        cb_seleccion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cb_seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seleccionActionPerformed(evt);
            }
        });
        panel3.add(cb_seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 130, -1));

        label_titulo_instructor.setBackground(new java.awt.Color(255, 204, 0));
        label_titulo_instructor.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        label_titulo_instructor.setForeground(new java.awt.Color(255, 153, 0));
        label_titulo_instructor.setText("ASISTENCIA");
        panel3.add(label_titulo_instructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, 42));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        panel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 180, 2));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        panel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 2));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icono_contraseña.png"))); // NOI18N
        panel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 20, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icono_usuario.png"))); // NOI18N
        panel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 20, 20));

        label_titulo_admin1.setBackground(new java.awt.Color(255, 204, 0));
        label_titulo_admin1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        label_titulo_admin1.setForeground(new java.awt.Color(255, 153, 0));
        label_titulo_admin1.setText("INICIAR SECCIÓN");
        panel3.add(label_titulo_admin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 180, 42));

        cb_entrada_salida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Salida" }));
        panel3.add(cb_entrada_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 130, -1));

        getContentPane().add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 410, 400));

        jMenu1.setText("Mi asistencia");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_iniciar_seccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iniciar_seccionMouseEntered
        /*creo este metodo con el evento entered cambiando el color a un color distinto  para
        hacer un efecto tipo hover en el boton */
        this.btt_iniciar_seccion.setBackground(new Color(255,102,0));  
    }//GEN-LAST:event_label_iniciar_seccionMouseEntered

    private void label_iniciar_seccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iniciar_seccionMouseExited
         /*creo este metodo con el evento exit cambiando el color a su colo original  para
        hacer un efecto tipo hover en el boton */
        this.btt_iniciar_seccion.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_label_iniciar_seccionMouseExited

    private void label_iniciar_seccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iniciar_seccionMousePressed
        //llamo los metodos nesesarios para el logeo de los usuarios
        comprobacion_final_campos();
    }//GEN-LAST:event_label_iniciar_seccionMousePressed

    private void cb_seleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seleccionActionPerformed
       //llamo este metodo  para el cambio entre elementos del combovox 
        this.cambio_entre_combobox();
        
    }//GEN-LAST:event_cb_seleccionActionPerformed

    private void txt_documentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_documentoKeyTyped

        char c = evt.getKeyChar();//verificacion de campos para que sea solo campos numericos
        if (c<'0'|| c>'9')evt.consume();
        
         if(txt_documento.getText().length()==10){evt.consume();}
    }//GEN-LAST:event_txt_documentoKeyTyped

    private void label_resgistrarseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_resgistrarseMousePressed
        /*al haber instanceado el registro en la parte de la 
        clase lo llamo para hacerlo visible cuando precione el boton 
        de registrarse*/
       jframe_registro registro=new jframe_registro();
       registro.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_label_resgistrarseMousePressed

    private void label_resgistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_resgistrarseMouseEntered
        /*creo este metodo con el evento entered cambiando el color a un color distinto  para
        hacer un efecto tipo hover en el boton */   
        this.btt_registrarse.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_label_resgistrarseMouseEntered

    private void label_resgistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_resgistrarseMouseExited
       /*creo este metodo con el evento exit cambiando el color a su colo original  para
        hacer un efecto tipo hover en el boton */
        
        this.btt_registrarse.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_label_resgistrarseMouseExited

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        jframe_historico_asistencia historial_asistencia =new jframe_historico_asistencia();
        historial_asistencia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void txt_contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyTyped
         if(txt_contraseña.getText().length()==12){evt.consume();}
    }//GEN-LAST:event_txt_contraseñaKeyTyped

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jframe_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
       

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_login().setVisible(true);
            }
        });
    }
    
    
    
    /*con este metodo realizo operaciones como limpiar los datos de los texfield cuando se cambia entre combobox
      o mostrar los diferentes label que acompañan a los logeos
    */
    
    /*cabe recalcar que dentro de este metodo se encuentra un metodo llamado limpiar el cual lo e llamado para esa funcion
      cuando se cambien entre combo box
    */
    private void cambio_entre_combobox(){
 
        if (cb_seleccion.getSelectedItem().equals("instructor")){  //condicional cuando en el combo box este seleccionado instructor
            this.label_titulo_instructor.setVisible(true);//hago visible el titulo asistencia
            //////
            /*como esto es un panel que contiene un
            label el boton en si es la conjugacion de estos dos por lo que  hago visible estos dos */
            this.label_resgistrarse.setVisible(true);
            this.btt_registrarse.setVisible(true);
            /////
            this.label_titulo_admin1.setVisible(false);//invisiviliso el label que contiene el titulo iniciar seccion 
            this.cb_entrada_salida.setVisible(true);

             
        }
        
        if (cb_seleccion.getSelectedItem().equals("administrador")) {//condicional cuando en el combo box este seleccionado administrador
            
            this.label_titulo_instructor.setVisible(false);//hago  el titulo asistencia invisible
            //////
            /*como esto es un panel que contiene un
            label el boton en si es la conjugacion de estos dos por lo que  hago visible estos dos */
            this.label_resgistrarse.setVisible(false);
            this.btt_registrarse.setVisible(false);
             /////
            this.label_titulo_admin1.setVisible(true);//vuelvo visible el label que contiene el titulo iniciar seccion
            this.cb_entrada_salida.setVisible(false);
           
        }  
    }
    
    
     /*este metodo comprueba si hay campos vacios y manda un mensaje si los hay*/
    private void comprobacion_final_campos(){
    
         if( 
            txt_documento.getText().equals("")
            || txt_contraseña.getText().equals("") 
            ){  
            JOptionPane.showMessageDialog(null,"hay campos vacios");}
         
         else{
         
             login_usuarios();
         }
    
    }
    
    
 
    
    /*este metodo es muy parecido al metodo cambio entre combo box con la singularidad de que este 
      no hace cambios en el  jframe de manera respectiva si no que interactual con las clases de la logica 
    de inicio de seccion de cada usuario como el instructor o administrador
    */
    private void login_usuarios(){
        if (cb_seleccion.getSelectedItem().equals("instructor")) {//condicion mientras el instructor en el combobox este seleccionado
            //llamo el objecto encargado de traerme los metodos y traigo el metodo que permite logear al instructor
            if (cb_entrada_salida.getSelectedItem().equals("Entrada")) {
                login_instructor.entrada();
                }   //metodo   para limpiar  capos txtfield}
            
            else{
                login_instructor.salida();
                }
    
            }

        if (cb_seleccion.getSelectedItem().equals("administrador")) {//condicion mientras el administrador en el combobox este seleccionado
            //llamo el objecto encargado de traerme los metodos, y traigo el metodo que permite logear al administrador
            login_admin.login_admin();
            }  //metodo   para limpiar  capos txtfield
    }
    
    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btt_iniciar_seccion;
    private javax.swing.JPanel btt_registrarse;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JComboBox<String> cb_entrada_salida;
    public static javax.swing.JComboBox<String> cb_seleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label_documento;
    private javax.swing.JLabel label_iniciar_seccion;
    private javax.swing.JLabel label_resgistrarse;
    private javax.swing.JLabel label_titulo_admin1;
    private javax.swing.JLabel label_titulo_instructor;
    private javax.swing.JPanel panel3;
    public static javax.swing.JPasswordField txt_contraseña;
    public static javax.swing.JTextField txt_documento;
    // End of variables declaration//GEN-END:variables

    
}
