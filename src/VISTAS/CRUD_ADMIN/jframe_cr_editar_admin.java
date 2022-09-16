
package VISTAS.CRUD_ADMIN;
import LOGICA.logica_cr_admin;
import javax.swing.JOptionPane;



/*todas las partes basicamente de este jframe se han declarado como publicas
y se han enviado sus actributos 
a una clase la cual se llama logica_cr_admin*/



public class jframe_cr_editar_admin extends javax.swing.JFrame {

     
    //instanceo la logica a usar
    logica_cr_admin crud_admin =new logica_cr_admin();
    
    public jframe_cr_editar_admin() {
        initComponents();
        //pongo  el cursor intermitente el la caja de texto documento
        this.txt_documento.grabFocus();
        //invisiviliso la caja de texto txt_id_admin
        this.txt_id_admin.setVisible(false);
        //invisiviliso el mesaje de contraseña invaldia
        this.mensaje_contrasena_invalid.setVisible(false);
        //posisiono la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_documento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_id_admin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        mensaje_contrasena_invalid = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        precauciones_contrase = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 102, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DOCUMENTO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, -1));

        txt_documento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_documento.setBorder(null);
        txt_documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_documentoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 20));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONTRASEÑA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, 20));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel3.setForeground(new java.awt.Color(255, 102, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GUARDAR CAMBIOS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 130, 40));
        jPanel2.add(txt_id_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 10, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icono_editar.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 90));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, 2));

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 150, 2));

        mensaje_contrasena_invalid.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        mensaje_contrasena_invalid.setForeground(new java.awt.Color(255, 51, 0));
        mensaje_contrasena_invalid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje_contrasena_invalid.setText("Contraseña invalida(*)");
        jPanel2.add(mensaje_contrasena_invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 130, 20));

        txt_contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_contraseña.setBorder(null);
        txt_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_contraseñaKeyReleased(evt);
            }
        });
        jPanel2.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 150, 20));

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        precauciones_contrase.setText("✔ la contraseña debe tener");
        jPanel5.add(precauciones_contrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 30));

        jLabel6.setText("✔como minimo 8 caracteres");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 160, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 150, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed

        this.verificacion_campos();//llamo al metodo privado antes creado
    }//GEN-LAST:event_jLabel4MousePressed

    private void txt_documentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_documentoKeyTyped
        
        char c = evt.getKeyChar();//verificacion de campos para que sea solo campos numericos
        if (c<'0'|| c>'9')evt.consume();
        if(txt_documento.getText().length()==10){evt.consume();}//con este evento punto consumo propongo que el documento no sea mayor a 12 caracteres

    }//GEN-LAST:event_txt_documentoKeyTyped

    private void txt_contraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyReleased
         //condicionales para mostra  y para ocultar el mensaje de error en la contraseña
        if (this.txt_contraseña.getText().length()<8) {
            this.mensaje_contrasena_invalid.setVisible(true);
        }
        
        if(this.txt_contraseña.getText().length()>=8  ){
            this.mensaje_contrasena_invalid.setVisible(false);
        }
    }//GEN-LAST:event_txt_contraseñaKeyReleased

    public static void main(String args[]) {
      

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_cr_editar_admin().setVisible(true);
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
    //este metodo es padre varios metodos externos traidos desde la logica_cr_admin
     private void  verificacion_contraseña(){

        if (txt_contraseña.getText().length()<8) {
          JOptionPane.showMessageDialog(null, "La contraseña elegida es inferior  a 8 caracteres");}

        if (txt_contraseña.getText().length()>=8){
              crud_admin.editar();//aqui estan lo metodos externos llamado por medio del objecto crud_admin
              crud_admin.buscar();}
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JLabel mensaje_contrasena_invalid;
    private javax.swing.JLabel precauciones_contrase;
    public static javax.swing.JPasswordField txt_contraseña;
    public static javax.swing.JTextField txt_documento;
    public static javax.swing.JTextField txt_id_admin;
    // End of variables declaration//GEN-END:variables
}
