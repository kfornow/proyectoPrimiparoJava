
package VISTAS.REGISTRO;


import java.awt.Color;
import javax.swing.JOptionPane;
import LOGICA.logica_registro_instructor;
import VISTAS.LOGIN.jframe_login;
import static VISTAS.LOGIN.jframe_login.txt_contraseña;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*todas las partes basicamente de este jframe se han declarado como publicas
y se han enviado sus actributos 
a una clase la cual se llama logica_registro_instrutor*/


public class jframe_registro extends javax.swing.JFrame {

    /* instacio la clase  la cual tiene la logica que nesesitamos para
    registrar el usuario utilisando los campos de este jframe
    como objecto    */
    logica_registro_instructor registro_instructor = new logica_registro_instructor();
        
    
    public jframe_registro() {
        
        initComponents();   
        //declaro en falso todos estos mensajes para cuando se inicie el aplicativo no inicien si no cuando los llame otra vez
        mensaje_contrasena_invalid.setVisible(false);
        
        mensaje_invalid_confim_contra.setVisible(false);
        
        mensaje_invalid_email.setVisible(false);
       
        setLocationRelativeTo(null); //posisionamos la ventana centradamente
        
        registro_instructor.cargar_combo();//cargamos el combo box con los tipos de contrato
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb_edad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_documento = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        btt_continuar = new javax.swing.JPanel();
        label_continuar = new javax.swing.JLabel();
        mensaje_invalid_confim_contra = new javax.swing.JLabel();
        cb_tipo_d_contrato = new javax.swing.JComboBox<>();
        txt_contraseña = new javax.swing.JPasswordField();
        txt_confirmContr = new javax.swing.JPasswordField();
        mensaje_invalid_email = new javax.swing.JLabel();
        mensaje_contrasena_invalid = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        precauciones_contrase = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel11.setBackground(new java.awt.Color(255, 153, 0));
        jPanel11.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel11.setMaximumSize(new java.awt.Dimension(327, 32767));
        jPanel11.setMinimumSize(new java.awt.Dimension(5, 5));
        jPanel11.setPreferredSize(new java.awt.Dimension(10, 100));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Documento   (*)");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 20));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre  (*)");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 140, 20));

        cb_edad.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        cb_edad.setForeground(new java.awt.Color(255, 153, 0));
        cb_edad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Edad", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        cb_edad.setBorder(null);
        cb_edad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cb_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 90, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Apellido  (*)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 130, 20));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Contraseña  (*)");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 130, -1));

        txt_documento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_documento.setBorder(null);
        txt_documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_documentoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 30));

        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(null);
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 140, 30));

        txt_apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellido.setBorder(null);
        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 130, 30));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Confirmar Contraseña  (*)");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 160, 20));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Email  (*)");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 70, 20));

        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_email.setBorder(null);
        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_emailKeyReleased(evt);
            }
        });
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 130, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Telefono  (*)");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 140, 20));

        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(null);
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 140, 30));

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));
        jPanel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel5.setMaximumSize(new java.awt.Dimension(327, 32767));
        jPanel5.setMinimumSize(new java.awt.Dimension(5, 5));
        jPanel5.setPreferredSize(new java.awt.Dimension(10, 100));
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 130, 3));

        jPanel6.setBackground(new java.awt.Color(255, 153, 0));
        jPanel6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel6.setMaximumSize(new java.awt.Dimension(327, 32767));
        jPanel6.setMinimumSize(new java.awt.Dimension(5, 5));
        jPanel6.setPreferredSize(new java.awt.Dimension(10, 100));
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 140, 3));

        jPanel7.setBackground(new java.awt.Color(255, 153, 0));
        jPanel7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel7.setMaximumSize(new java.awt.Dimension(327, 32767));
        jPanel7.setMinimumSize(new java.awt.Dimension(5, 5));
        jPanel7.setPreferredSize(new java.awt.Dimension(10, 100));
        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 130, 3));

        jPanel9.setBackground(new java.awt.Color(255, 153, 0));
        jPanel9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel9.setMaximumSize(new java.awt.Dimension(327, 32767));
        jPanel9.setMinimumSize(new java.awt.Dimension(5, 5));
        jPanel9.setPreferredSize(new java.awt.Dimension(10, 100));
        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 140, 3));

        jPanel10.setBackground(new java.awt.Color(255, 153, 0));
        jPanel10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel10.setMaximumSize(new java.awt.Dimension(327, 32767));
        jPanel10.setMinimumSize(new java.awt.Dimension(5, 5));
        jPanel10.setPreferredSize(new java.awt.Dimension(10, 100));
        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 130, 3));

        jPanel12.setBackground(new java.awt.Color(255, 153, 0));
        jPanel12.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel12.setMaximumSize(new java.awt.Dimension(327, 32767));
        jPanel12.setMinimumSize(new java.awt.Dimension(5, 5));
        jPanel12.setPreferredSize(new java.awt.Dimension(10, 100));
        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 130, 3));

        jPanel13.setBackground(new java.awt.Color(255, 153, 0));
        jPanel13.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jPanel13.setMaximumSize(new java.awt.Dimension(327, 32767));
        jPanel13.setMinimumSize(new java.awt.Dimension(5, 5));
        jPanel13.setPreferredSize(new java.awt.Dimension(10, 100));
        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 140, 3));

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

        jPanel2.add(btt_continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 90, 30));

        mensaje_invalid_confim_contra.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        mensaje_invalid_confim_contra.setForeground(new java.awt.Color(255, 51, 0));
        mensaje_invalid_confim_contra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje_invalid_confim_contra.setText("Contraseñas no coinciden(*)");
        jPanel2.add(mensaje_invalid_confim_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 200, 20));

        jPanel2.add(cb_tipo_d_contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 150, 30));

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
        jPanel2.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 130, 30));

        txt_confirmContr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_confirmContr.setBorder(null);
        txt_confirmContr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_confirmContrKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_confirmContrKeyTyped(evt);
            }
        });
        jPanel2.add(txt_confirmContr, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 192, 140, 30));

        mensaje_invalid_email.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        mensaje_invalid_email.setForeground(new java.awt.Color(255, 51, 0));
        mensaje_invalid_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje_invalid_email.setText("Email invalido(*)");
        jPanel2.add(mensaje_invalid_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 130, 20));

        mensaje_contrasena_invalid.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        mensaje_contrasena_invalid.setForeground(new java.awt.Color(255, 51, 0));
        mensaje_contrasena_invalid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje_contrasena_invalid.setText("Contraseña invalida(*)");
        jPanel2.add(mensaje_contrasena_invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 130, 20));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VOLVER");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 1, 70, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 70, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 550, 350));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        precauciones_contrase.setText("✔ la contraseña debe tener");
        jPanel3.add(precauciones_contrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 30));

        jLabel6.setText("✔como minimo 8 caracteres");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 160, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 160, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_continuarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_continuarMousePressed
      
      this.verificacion_final_campos(); //traemos todos los campos para acceder al registro
      

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
        
        if(txt_telefono.getText().length()>=12){evt.consume();}
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyReleased
       /*traigo este metodo declarado en la parte de abajo para que cadavez que el usuario tipee
        se muestre este mensaje hasta que dijire todo los caracteres comprendidos en un email
        */
      this.mostrar_mensaje_error_email();
    }//GEN-LAST:event_txt_emailKeyReleased

    private void txt_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyTyped
        char c = evt.getKeyChar();//verificacion de campos para que sea solo campos de texto
        if ((c<'a'|| c>'z')&&(c<'A'|| c>'Z')&& (c<' '|| c>' '))evt.consume();
    }//GEN-LAST:event_txt_apellidoKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped

        char c = evt.getKeyChar();//verificacion de campos para que sea solo campos de texto
        if ((c<'a'|| c>'z')&&(c<'A'|| c>'Z')&& (c<' '|| c>' '))evt.consume();

    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_documentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_documentoKeyTyped
       
        char c = evt.getKeyChar();//verificacion de campos para que sea solo campos numericos
        if (c<'0'|| c>'9')evt.consume();
        
        if(txt_documento.getText().length()==10){evt.consume();}//le indicamos con un evento . consume que el documento del instructor no debe ser mayor a 10 caracteres 

    }//GEN-LAST:event_txt_documentoKeyTyped

    private void txt_contraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyReleased
        //manejo de condicionales para mostrar los mensajes en el registro
        
        if (this.txt_contraseña.getText().length()<8) {
            this.mensaje_contrasena_invalid.setVisible(true);
        }
        
        if(this.txt_contraseña.getText().length()>=8  ){
            this.mensaje_contrasena_invalid.setVisible(false);
        }
    }//GEN-LAST:event_txt_contraseñaKeyReleased

    private void txt_confirmContrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_confirmContrKeyReleased
          
        //manejo de condicionales para mostrar error si las contraseña no coinciden
        if(txt_contraseña.getText().equals(txt_confirmContr.getText())){
            this.mensaje_invalid_confim_contra.setVisible(false);
        }
        
        if(txt_contraseña.getText() == null ? txt_confirmContr.getText() != null : !txt_contraseña.getText().equals(txt_confirmContr.getText())){
        
            this.mensaje_invalid_confim_contra.setVisible(true);
        }
    }//GEN-LAST:event_txt_confirmContrKeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        //instaceo el login en este boton
        jframe_login login =new jframe_login();
        login.setVisible(true);//lo hago visible
        this.setVisible(false);//cierro esta ventana
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txt_contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyTyped
         if(txt_contraseña.getText().length()==12){evt.consume();}
    }//GEN-LAST:event_txt_contraseñaKeyTyped

    private void txt_confirmContrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_confirmContrKeyTyped
         if(txt_confirmContr.getText().length()==12){evt.consume();}
    }//GEN-LAST:event_txt_confirmContrKeyTyped

    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jframe_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
       

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_registro().setVisible(true);
            }
        });
      
    }
    
    //metodo final para la comprobacion de todos los campos incluidos los campos contraseña y email
    private void verificacion_final_campos(){

        if(
              this.txt_documento.getText().equals("")
            ||this.txt_nombre.getText().equals("")
            ||this.txt_apellido.getText().equals("")
            ||this.txt_telefono.getText().equals("")   //comprobacion de campos vacios
            ||this.txt_email.getText().equals("")
            ||this.txt_contraseña.getText().equals("")
            ||this.txt_confirmContr.getText().equals("")
            ||this.cb_edad.getSelectedItem().equals("Edad")
            ||this.cb_tipo_d_contrato.getSelectedItem().equals("tipo de contrato")){JOptionPane.showMessageDialog(null,"hay campos vacios");}
        /*si no hay campos vacios traigo el metodo verificacion 
        email que contiene otro metodo que es el de verificion contraseña,
        y este a su ves trae el metodo instanceado de la clase logica_registro_instructor
        la cual posee un objecto que contiene un metodo registro("este es el que esta en el metodo contraseña") */
        else{this.verificacion_email();}
     
    }
    
    //creacion de un metodo voleano para la verficacion de caracteres especiales
    private boolean verifi_caracteres_email(String correo){//ponemos un parametro para porder meter el campo email una ves intanceado
        /*con patter definimos el patron de busqueda de nuestra cadena de caracteres 
        en este caso quiero que compile todos los caracteres nesesarios para que los correos ingresados esten bien*/
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        /*mather es el objecto resultante de la creacion del patron el cual usamos para realisar la revicion de la cadena de texto introducida por el usuario*/
        Matcher mat = patron.matcher(correo);
        return mat.find();}//returnamos el objecto para su posterios utilisacion
    
    
    
    /*creacion del metodo para mostrar el mensaje de error si
    la cadena de texto introducida el campo email
    no tiene lo caracteres adecuados que identifican a un correo ,para ellos instanciamos el metodo boleano llamado 
    verifi_caracteres_email dentro del un codicional y como el metodo es boleano y lo returnome devolvera
    false si el correo cumple con las caracteriticas adecuadas de un correo si no  me devolvera un true 
    el cual significa que el correo ingresado esta mal y mostrara el label con el mensajes*/
    private void  mostrar_mensaje_error_email(){
        
         if (verifi_caracteres_email(txt_email.getText())){ //para que muestre el mensaje cada vez que tipea
              this.mensaje_invalid_email.setVisible(false);}

         else{
              mensaje_invalid_email.setVisible(true);}
    }

    /* este metodo contiene otro metodo el cual es el de verificar contraseña todo con el ambito de usar condicionales
    y haci no permitir al usuario registrarse si se equivoca en lo que estamos pidiendo como es en el campo del email
    o en campo contraseña
    */
    private void verificacion_email(){
        
        if(verifi_caracteres_email(txt_email.getText())){ 
            this.verficar_contraseña();}

        else{JOptionPane.showMessageDialog(null," el email ingresado no es valido  ");}
    
    }
          
    /*este metodo contiene el objecto con el metodo que permitira al usuario regitrase en caso de que cumpla con los requisitos propuestos*/
    private void verficar_contraseña(){ 
        
        if(txt_contraseña.getText().equals(txt_confirmContr.getText())){
            
            
            
            if (txt_contraseña.getText().length()<8) {
                JOptionPane.showMessageDialog(null, "La contraseña elegida es inferior a 8 caracteres");}


              if (txt_contraseña.getText().length()>=8){
                    registro_instructor.registro();}
            }
        
        if(txt_contraseña.getText() == null ? txt_confirmContr.getText() != null : !txt_contraseña.getText().equals(txt_confirmContr.getText())){
            JOptionPane.showMessageDialog(null, "la contraseñas no coinciden por favor verfifica nuevamente!!");
            this.txt_confirmContr.setText("");
        }
        
    }
    
    
    
    
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btt_continuar;
    public static javax.swing.JComboBox<String> cb_edad;
    public static javax.swing.JComboBox<String> cb_tipo_d_contrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel label_continuar;
    public static javax.swing.JLabel mensaje_contrasena_invalid;
    public static javax.swing.JLabel mensaje_invalid_confim_contra;
    public static javax.swing.JLabel mensaje_invalid_email;
    private javax.swing.JLabel precauciones_contrase;
    public static javax.swing.JTextField txt_apellido;
    public static javax.swing.JPasswordField txt_confirmContr;
    public static javax.swing.JPasswordField txt_contraseña;
    public static javax.swing.JTextField txt_documento;
    public static javax.swing.JTextField txt_email;
    public static javax.swing.JTextField txt_nombre;
    public static javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
