
package VISTAS.LOGIN;

import java.awt.Color;
import LOGICA.logica_jframe_historico_asistencia;
import static VISTAS.LOGIN.jframe_login.txt_contraseña;
import javax.swing.JOptionPane;


/*todas las partes basicamente de este jframe se han declarado como publicas
y se han enviado sus actributos 
a una clase la cual se llama logica_jframe_historico_asistencia*/




public class jframe_historico_asistencia extends javax.swing.JFrame {

    jframe_login login = new jframe_login();
    
    logica_jframe_historico_asistencia historico_asistencia = new logica_jframe_historico_asistencia();
   
    public jframe_historico_asistencia() {
        initComponents();
        this.setLocationRelativeTo(null);//pongo la ventana en el centro de la pantalla
        this.txt_documento.grabFocus();//posiciono el cursor intermitente en la caja txt documento
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel3 = new javax.swing.JPanel();
        label_documento = new javax.swing.JLabel();
        txt_documento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JPasswordField();
        btt_iniciar_seccion = new javax.swing.JPanel();
        label_iniciar_seccion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        label_titulo_admin1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel3.setBackground(new java.awt.Color(255, 255, 255));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_documento.setBackground(new java.awt.Color(255, 255, 255));
        label_documento.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_documento.setForeground(new java.awt.Color(255, 153, 0));
        label_documento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_documento.setText("DOCUMENTO");
        panel3.add(label_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 170, 20));

        txt_documento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_documento.setBorder(null);
        txt_documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_documentoKeyTyped(evt);
            }
        });
        panel3.add(txt_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 150, 30));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONTRASEÑA");
        panel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 150, 20));

        txt_contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_contraseña.setBorder(null);
        txt_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contraseñaKeyTyped(evt);
            }
        });
        panel3.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 150, 30));

        btt_iniciar_seccion.setBackground(new java.awt.Color(255, 153, 0));
        btt_iniciar_seccion.setForeground(new java.awt.Color(51, 51, 51));
        btt_iniciar_seccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_iniciar_seccion.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        label_iniciar_seccion.setForeground(new java.awt.Color(255, 255, 255));
        label_iniciar_seccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_iniciar_seccion.setText("VER ACTIVIDAD");
        label_iniciar_seccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        panel3.add(btt_iniciar_seccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 120, 40));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        panel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 170, 3));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        panel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 170, 3));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icono_contraseña.png"))); // NOI18N
        panel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 20, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icono_usuario.png"))); // NOI18N
        panel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 20, 20));

        label_titulo_admin1.setBackground(new java.awt.Color(255, 204, 0));
        label_titulo_admin1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        label_titulo_admin1.setForeground(new java.awt.Color(255, 153, 0));
        label_titulo_admin1.setText("Mi ASISTENCIA");
        panel3.add(label_titulo_admin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 150, 42));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "documento", "fecha entrada", "hora entrada", "fecha salida", "hora salida", "estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 600, 310));

        txt_buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_buscar.setBorder(null);
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });
        jPanel2.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 140, 30));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 140, 3));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icono_buscar.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 22, 50, 50));

        panel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 610, -1));

        getContentPane().add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 480));

        jMenu1.setText("Salir");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_documentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_documentoKeyTyped

        char c = evt.getKeyChar();//verificacion de campos para que sea solo campos numericos
        if (c<'0'|| c>'9')evt.consume();
        
        if(txt_documento.getText().length()==12){evt.consume();}

    }//GEN-LAST:event_txt_documentoKeyTyped

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
        this.campos_vacios();//comprobacion de campos vacios
        historico_asistencia.logeo_buscar();//traigo el metodo logeo buscar
            
       
    }//GEN-LAST:event_label_iniciar_seccionMousePressed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        historico_asistencia.buscar();//traigo el metodo buscar desde la logica historico aistencia
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        
        login.setVisible(true);//hago visible el logeo
        this.setVisible(false);//y cierro la ventana en la que esta
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
            java.util.logging.Logger.getLogger(jframe_historico_asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe_historico_asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe_historico_asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe_historico_asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_historico_asistencia().setVisible(true);
            }
        });
    }
    
    //metodo para los campos vacios
    private void campos_vacios(){
    
        if( 
           txt_documento.getText().equals("")
           || txt_contraseña.getText().equals("") ){  
           JOptionPane.showMessageDialog(null,"hay campos vacios");}
    
    }
    
     private void limpiar(){/*metodo para limpiar los texfield*/
        txt_documento.setText("");
        txt_contraseña.setText("");}
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btt_iniciar_seccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_documento;
    private javax.swing.JLabel label_iniciar_seccion;
    private javax.swing.JLabel label_titulo_admin1;
    private javax.swing.JPanel panel3;
    public static javax.swing.JTable tabla;
    public static javax.swing.JTextField txt_buscar;
    public static javax.swing.JPasswordField txt_contraseña;
    public static javax.swing.JTextField txt_documento;
    // End of variables declaration//GEN-END:variables
}
