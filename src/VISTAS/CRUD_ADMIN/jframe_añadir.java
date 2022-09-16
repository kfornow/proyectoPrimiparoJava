
package VISTAS.CRUD_ADMIN;
import LOGICA.logica_cr_admin;
import static VISTAS.CRUD_ADMIN.jframe_cr_editar_admin.txt_contraseña;
import static VISTAS.CRUD_ADMIN.jframe_cr_editar_admin.txt_documento;
import javax.swing.JOptionPane;



/*todas las partes basicamente de este jframe se han declarado como publicas
y se han enviado sus actributos 
a una clase la cual se llama logica_cr_admin*/





public class jframe_añadir extends javax.swing.JFrame {

   
    //instanceo la logica a utilizar
    logica_cr_admin crud_admin =new logica_cr_admin();
    public jframe_añadir() {
        
        initComponents();
        //pongo  el cursor intermitente el la caja de texto documento
        this.txt_documento.grabFocus(); 
        //invisiviliso el mensaje de la contraseña invalida
        this.mensaje_contrasena_invalid.setVisible(false);
        //centro la ventana
        setLocationRelativeTo(null);
        
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_documento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        mensaje_contrasena_invalid = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        precauciones_contrase = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DOCUMENTO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, -1));

        txt_documento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_documento.setBorder(null);
        txt_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_documentoActionPerformed(evt);
            }
        });
        txt_documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_documentoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 150, 20));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONTRASEÑA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, -1));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AÑADIR");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 90, 40));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icono_admin.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 80));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, 2));

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 150, 2));

        mensaje_contrasena_invalid.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        mensaje_contrasena_invalid.setForeground(new java.awt.Color(255, 51, 0));
        mensaje_contrasena_invalid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje_contrasena_invalid.setText("Contraseña invalida(*)");
        jPanel2.add(mensaje_contrasena_invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 130, 20));

        jPanel5.setBackground(new java.awt.Color(255, 102, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VOLVER");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jLabel5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel5KeyPressed(evt);
            }
        });
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 80, 30));

        jPanel6.setBackground(new java.awt.Color(255, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        precauciones_contrase.setText("✔ la contraseña debe tener");
        jPanel6.add(precauciones_contrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 30));

        jLabel6.setText("✔como minimo 8 caracteres");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 160, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 150, 80));

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
        jPanel2.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 340, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        
       //llamo al metodo privado verificar_campos
        this.verificacion_campos();
       
    }//GEN-LAST:event_jLabel3MousePressed

    private void txt_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_documentoActionPerformed
       
    }//GEN-LAST:event_txt_documentoActionPerformed

    private void txt_documentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_documentoKeyTyped
        char c = evt.getKeyChar();//verificacion de campos para que sea solo campos numericos
        if (c<'0'|| c>'9')evt.consume();
        if(txt_documento.getText().length()==10){evt.consume();}//limito los caracteres de el documento de identidad con grab focus
    }//GEN-LAST:event_txt_documentoKeyTyped

    private void jLabel5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel5KeyPressed
       
    }//GEN-LAST:event_jLabel5KeyPressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        //instanceo la logica del crud principal del administrador
        jframe_main_cr_admin main = new jframe_main_cr_admin();
        main.setVisible(true);//lo hago visible
        this.setVisible(false);//cierro la venta actual
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txt_contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyTyped
       
    }//GEN-LAST:event_txt_contraseñaKeyTyped

    private void txt_contraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyReleased
       
        //manejo de condicionales para mostrar el mensaje de contraseña invalida en la ventana editar

        if (this.txt_contraseña.getText().length()<8) {
            this.mensaje_contrasena_invalid.setVisible(true);
        }
        
        if(this.txt_contraseña.getText().length()>=8  ){
            this.mensaje_contrasena_invalid.setVisible(false);
        }
    }//GEN-LAST:event_txt_contraseñaKeyReleased

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jframe_añadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe_añadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe_añadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe_añadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_añadir().setVisible(true);
            }
        });
    }

    

      
    //establesco un metodo para la verificacion de campos 
    //este metodo contiene otro metodo el cual es el de la verificacion contraseña
       
    private void verificacion_campos(){
        if (
                
               this .txt_documento.getText().equals("")//verifico si hay campos vacios
            || this .txt_contraseña.getText().equals("")
                
            ) {JOptionPane.showMessageDialog(null, "hay campos vacios");}
        
        else{
        
            this.verificacion_contraseña();//llamo al metodo verificacion contraseña
        }
    }
    
    
    
    
     //establesco este metodo para la verificacion de la contraseña
    //este metodo es padre un metodo externo traido desde la logica_cr_admin
    
    private void  verificacion_contraseña(){

        if (txt_contraseña.getText().length()<8) {
          JOptionPane.showMessageDialog(null, "La contraseña elegida es inferior a 8 caracteres ");}


        if (txt_contraseña.getText().length()>=8){
              crud_admin.añadir();}//aqui estan el metodo externo llamado por medio del objecto crud_admin
     }

     
     
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JLabel mensaje_contrasena_invalid;
    private javax.swing.JLabel precauciones_contrase;
    public static javax.swing.JPasswordField txt_contraseña;
    public static javax.swing.JTextField txt_documento;
    // End of variables declaration//GEN-END:variables
}
