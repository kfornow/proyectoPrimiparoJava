
package VISTAS.CRUD_INSTRUCTOR;
import LOGICA.logica_cr_main_instructor;
import static VISTAS.LOGIN.jframe_login.txt_contraseña;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/*todas las partes basicamente de este jframe se han declarado como publicas
y se han enviado sus actributos 
a una clase la cual se llama logica_cr_main_instructor*/

public class jframe_editar_cr_instr extends javax.swing.JFrame {

     
    //instanceo la clase que usare para llamar la logica pertinente
    logica_cr_main_instructor crud_instructor =new logica_cr_main_instructor();
    
    public jframe_editar_cr_instr() {
        initComponents();
        //hago inivisible el txt_id_edit
        this.txt_id_edit.setVisible(false);
        //desabilito el texfield del documeto esto para prevenir que cambio algo que identifica a esa persona como tal
        this.txt_cc_instruc.setEnabled(false);
        //hago invisible el mensaje de error del email
        this.mensaje_error_email_invalid.setVisible(false);
        //hago invisible el mensaje de error de la contraseña
        this.mensaje_contrasena_invalid.setVisible(false);
        //centro la ventana en la pantalla
        this.setLocationRelativeTo(null);
        //tomo el objecto y llamo el metodo para cargar el combo box 
        crud_instructor.cargar_combo();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        btt_continuar = new javax.swing.JPanel();
        label_continuar = new javax.swing.JLabel();
        mensaje_error_email_invalid = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_cc_instruc = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        cb_edad = new javax.swing.JComboBox<>();
        cb_tipo_d_contrato = new javax.swing.JComboBox<>();
        txt_contraseña = new javax.swing.JPasswordField();
        mensaje_contrasena_invalid = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        precauciones_contrase = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_id_edit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Documento (*)");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 20));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Apellido  (*)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 130, 20));

        txt_apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellido.setBorder(null);
        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 130, 30));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Email  (*)");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 140, 20));

        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_email.setBorder(null);
        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_emailKeyReleased(evt);
            }
        });
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 130, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Telefono  (*)");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 150, 20));

        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(null);
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 140, 30));

        jPanel6.setBackground(new java.awt.Color(255, 153, 0));
        jPanel6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel6.setMaximumSize(new java.awt.Dimension(327, 32767));
        jPanel6.setMinimumSize(new java.awt.Dimension(5, 5));
        jPanel6.setPreferredSize(new java.awt.Dimension(10, 100));
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 130, 3));

        jPanel7.setBackground(new java.awt.Color(255, 153, 0));
        jPanel7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel7.setMaximumSize(new java.awt.Dimension(327, 32767));
        jPanel7.setMinimumSize(new java.awt.Dimension(5, 5));
        jPanel7.setPreferredSize(new java.awt.Dimension(10, 100));
        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 3));

        jPanel10.setBackground(new java.awt.Color(255, 153, 0));
        jPanel10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel10.setMaximumSize(new java.awt.Dimension(327, 32767));
        jPanel10.setMinimumSize(new java.awt.Dimension(5, 5));
        jPanel10.setPreferredSize(new java.awt.Dimension(10, 100));
        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 140, 3));

        jPanel11.setBackground(new java.awt.Color(255, 153, 0));
        jPanel11.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel11.setMaximumSize(new java.awt.Dimension(327, 32767));
        jPanel11.setMinimumSize(new java.awt.Dimension(5, 5));
        jPanel11.setPreferredSize(new java.awt.Dimension(10, 100));
        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 130, 3));

        jPanel12.setBackground(new java.awt.Color(255, 153, 0));
        jPanel12.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel12.setMaximumSize(new java.awt.Dimension(327, 32767));
        jPanel12.setMinimumSize(new java.awt.Dimension(5, 5));
        jPanel12.setPreferredSize(new java.awt.Dimension(10, 100));
        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 140, 3));

        btt_continuar.setBackground(new java.awt.Color(255, 153, 0));
        btt_continuar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_continuar.setBackground(new java.awt.Color(255, 153, 0));
        label_continuar.setForeground(new java.awt.Color(255, 255, 255));
        label_continuar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_continuar.setText("CONTINUAR");
        label_continuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_continuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_continuarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_continuarMousePressed(evt);
            }
        });
        btt_continuar.add(label_continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        jPanel2.add(btt_continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 90, 30));

        mensaje_error_email_invalid.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        mensaje_error_email_invalid.setForeground(new java.awt.Color(255, 51, 0));
        mensaje_error_email_invalid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje_error_email_invalid.setText("Email invalido(*)");
        jPanel2.add(mensaje_error_email_invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 140, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contraseña  (*)");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 160, 20));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre  (*)");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 140, 20));

        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(null);
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 140, 30));

        txt_cc_instruc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cc_instruc.setBorder(null);
        txt_cc_instruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cc_instrucKeyTyped(evt);
            }
        });
        jPanel2.add(txt_cc_instruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 32, 130, 30));

        jPanel8.setBackground(new java.awt.Color(255, 153, 0));
        jPanel8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel8.setMaximumSize(new java.awt.Dimension(327, 32767));
        jPanel8.setMinimumSize(new java.awt.Dimension(5, 5));
        jPanel8.setPreferredSize(new java.awt.Dimension(10, 100));
        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 140, 3));

        cb_edad.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        cb_edad.setForeground(new java.awt.Color(255, 153, 0));
        cb_edad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Edad", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        cb_edad.setToolTipText("");
        cb_edad.setBorder(null);
        cb_edad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cb_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 30));

        jPanel2.add(cb_tipo_d_contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 150, 30));

        txt_contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_contraseña.setBorder(null);
        txt_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_contraseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contraseñaKeyTyped(evt);
            }
        });
        jPanel2.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 140, 30));

        mensaje_contrasena_invalid.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        mensaje_contrasena_invalid.setForeground(new java.awt.Color(255, 51, 0));
        mensaje_contrasena_invalid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje_contrasena_invalid.setText("Contraseña invalida(*)");
        jPanel2.add(mensaje_contrasena_invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 140, 20));

        jPanel9.setBackground(new java.awt.Color(255, 153, 153));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        precauciones_contrase.setText("✔ la contraseña debe tener");
        jPanel9.add(precauciones_contrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 30));

        jLabel7.setText("✔como minimo 8 caracteres");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 160, -1));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, 80));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 700, 350));
        jPanel5.add(txt_id_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 20, 20));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_continuarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_continuarMousePressed

       this.verificacion_final_campos();//traigo el metodo privado  para verificar los campos

       
    }//GEN-LAST:event_label_continuarMousePressed

    private void label_continuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_continuarMouseExited
        /*creo este metodo con el evento exit cambiando el color a su colo original  para
        hacer un efecto tipo hover en el boton */
        btt_continuar.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_label_continuarMouseExited

    private void label_continuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_continuarMouseEntered
         /*creo este metodo con el evento entered cambiando el color a un color distinto  para
        hacer un efecto tipo hover en el boton */
        btt_continuar.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_label_continuarMouseEntered

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        char c = evt.getKeyChar();//verificacion de campos para que sea solo campos numericos
        if (c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyReleased

        if (verificacion_email(txt_email.getText())){ //para que muestre el mensaje cada vez que tipea
            mensaje_error_email_invalid.setVisible(false);}

        else{
            mensaje_error_email_invalid.setVisible(true);}
    }//GEN-LAST:event_txt_emailKeyReleased

    private void txt_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyTyped
        char c = evt.getKeyChar();//verificacion de campos para que sea solo campos de texto
        if ((c<'a'|| c>'z')&&(c<'A'|| c>'Z')&& (c<' '|| c>' '))evt.consume();
    }//GEN-LAST:event_txt_apellidoKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c = evt.getKeyChar();//verificacion de campos para que sea solo campos de texto
        if ((c<'a'|| c>'z')&&(c<'A'|| c>'Z')&& (c<' '|| c>' '))evt.consume();
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_contraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyReleased
         if (this.txt_contraseña.getText().length()<8) {
            this.mensaje_contrasena_invalid.setVisible(true);
        }

        if(this.txt_contraseña.getText().length()>=8  ){
            this.mensaje_contrasena_invalid.setVisible(false);
        }
    }//GEN-LAST:event_txt_contraseñaKeyReleased

    private void txt_contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyTyped
        if(txt_contraseña.getText().length()==10){evt.consume();}

    }//GEN-LAST:event_txt_contraseñaKeyTyped

    private void txt_cc_instrucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cc_instrucKeyTyped
         if(txt_cc_instruc.getText().length()==10){evt.consume();}
    }//GEN-LAST:event_txt_cc_instrucKeyTyped

    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(jframe_editar_cr_instr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe_editar_cr_instr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe_editar_cr_instr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe_editar_cr_instr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_editar_cr_instr().setVisible(true);
            }
        });
    }
    
    
     private boolean verificacion_email(String correo){//metodo para caracteres especiales del correo
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = patron.matcher(correo);
        return mat.find();}
    
     
    
     
     /*como final en este metodo llamo al metodo verificacion email el cual contiene el metodo verificacion email
     el cual contiene otro metodo el cual es el de verificar la contraseña que asu ves trae el metodo que utilisaremos para editar los datos*/
     private void  verificacion_final_campos(){
     
          if(
            txt_nombre.getText().equals("")
            ||txt_apellido.getText().equals("")
            ||txt_telefono.getText().equals("")   //comprobacion de campos vacios
            ||txt_email.getText().equals("")
            ||txt_contraseña.getText().equals("")
            ||cb_edad.getSelectedItem().equals("Edad")
            ||cb_tipo_d_contrato.getSelectedItem().equals("tipo de contrato"))
            
        {JOptionPane.showMessageDialog(null,"hay campos vacios que deben ser llenados"); }
          
          else{
          
            this.verificacion_email();
          
          }
     
     }
     
     
     //llamo en este metodo , otro metodo  que se encarga de verificar la contraseña
    private void verificacion_email(){
     
          if(verificacion_email(txt_email.getText())){ //verificacion del email
            this.verificacion_contraseña();
            }

            else{JOptionPane.showMessageDialog(null," el email ingresado no es valido  ");}
         
     }
     
     //llamo en este metodo  que contiene otro metodo que se encarga de editar y recargar
    private void  verificacion_contraseña(){
        
        
       
         if (txt_contraseña.getText().length()<8 || txt_contraseña.getText().length()>10) {
                JOptionPane.showMessageDialog(null, "La contraseña elegida es inferior a 8 caracteres o superior a 10 por favor rectifica una contraseña que sea mayor o  igual a 8 pero menor o igual a 10 ");}


              if (txt_contraseña.getText().length()>=8 && txt_contraseña.getText().length()<=10){
                    crud_instructor.editar();
                    crud_instructor.buscar();}
     }

    
     
     //metodo para limpiar cajas de texto
    private void limpiar(){
        
        this.txt_nombre.setText("");
        this.txt_apellido.setText("");
        this.txt_telefono.setText("");
        this.txt_email.setText("");
        this.cb_edad.setSelectedItem("Edad");
        this.cb_tipo_d_contrato.setSelectedItem("tipo de contrato");
   
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btt_continuar;
    public static javax.swing.JComboBox<String> cb_edad;
    public static javax.swing.JComboBox<String> cb_tipo_d_contrato;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel label_continuar;
    public static javax.swing.JLabel mensaje_contrasena_invalid;
    public static javax.swing.JLabel mensaje_error_email_invalid;
    private javax.swing.JLabel precauciones_contrase;
    public static javax.swing.JTextField txt_apellido;
    public static javax.swing.JTextField txt_cc_instruc;
    public static javax.swing.JPasswordField txt_contraseña;
    public static javax.swing.JTextField txt_email;
    public static javax.swing.JTextField txt_id_edit;
    public static javax.swing.JTextField txt_nombre;
    public static javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
