/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author Diegp
 */
public class frmcel extends javax.swing.JFrame {

    /**
     * Creates new form frmcel
     */
    public frmcel() {
        initComponents();
        txtprin.setEnabled(false);
        txtsecun.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chprinci = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        chsecundaria = new javax.swing.JCheckBox();
        txtprin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtsecun = new javax.swing.JTextField();
        cmbmarca = new javax.swing.JComboBox<>();
        chflash = new javax.swing.JCheckBox();
        txtcpu = new javax.swing.JTextField();
        btnejecutar = new javax.swing.JButton();
        txtpantalla = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();
        txtram = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtgarantia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chprinci.setText("Principal");
        chprinci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chprinciActionPerformed(evt);
            }
        });

        jLabel5.setText("Tiempo de garantia:");

        chsecundaria.setText("Secundaria");
        chsecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chsecundariaActionPerformed(evt);
            }
        });

        txtprin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprinActionPerformed(evt);
            }
        });
        txtprin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprinKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprinKeyTyped(evt);
            }
        });

        jLabel7.setText("Marca :");

        txtsecun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsecunKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsecunKeyTyped(evt);
            }
        });

        cmbmarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SAMSUNG ", "ZTE", "HUAWEII", "MOTOROLA", "IPHONE", "NEXUS ", "WINDOW", "LENOVO", "SONY", "ALCATEL ", "LG" }));

        chflash.setText("FLASH");

        txtcpu.setToolTipText("");
        txtcpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpuActionPerformed(evt);
            }
        });
        txtcpu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcpuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcpuKeyTyped(evt);
            }
        });

        btnejecutar.setText("Ejecutar");
        btnejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnejecutarActionPerformed(evt);
            }
        });

        txtpantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpantallaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpantallaKeyTyped(evt);
            }
        });

        info.setColumns(20);
        info.setRows(5);
        jScrollPane1.setViewportView(info);

        txtram.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtramKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtramKeyTyped(evt);
            }
        });

        jLabel1.setText("Puntaje de Moviles");

        txtgarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtgarantiaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtgarantiaKeyTyped(evt);
            }
        });

        jLabel2.setText("CPU numero de nucleos:");

        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprecioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });

        jLabel3.setText("Tamaño de Pantalla:");

        jLabel8.setText("Camara:");

        jLabel4.setText("Cantidad de Ram");

        jLabel6.setText("Precio: ");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jButton1)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(214, 214, 214)
                    .addComponent(jLabel1)
                    .addContainerGap(190, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(178, 178, 178)
                    .addComponent(btnejecutar)
                    .addContainerGap(243, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(cmbmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(205, 205, 205))
                        .addComponent(jLabel4)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addGap(73, 73, 73)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtram)
                                .addComponent(txtcpu)
                                .addComponent(txtpantalla)
                                .addComponent(txtgarantia)
                                .addComponent(txtprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chprinci)
                                .addComponent(txtprin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(chsecundaria)
                                    .addGap(28, 28, 28)
                                    .addComponent(chflash))
                                .addComponent(txtsecun, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel6)
                .addGap(183, 183, 183)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2))
                        .addComponent(txtcpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtpantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(txtram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtgarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(cmbmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(chprinci)
                        .addComponent(chsecundaria)
                        .addComponent(chflash))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtprin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsecun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addComponent(btnejecutar)
                    .addContainerGap(186, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chprinciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chprinciActionPerformed
         if (chprinci.isSelected()){
            txtprin.setEnabled(true);
        }
    }//GEN-LAST:event_chprinciActionPerformed

    private void chsecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chsecundariaActionPerformed
        if (chsecundaria.isSelected()){
            txtsecun.setEnabled(true);
        }
    }//GEN-LAST:event_chsecundariaActionPerformed

    private void txtprinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprinActionPerformed

    private void txtprinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprinKeyPressed
        if (evt.getKeyCode()==evt.VK_ENTER){
       txtsecun.requestFocus();
        }
    }//GEN-LAST:event_txtprinKeyPressed

    private void txtprinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprinKeyTyped
       char c=evt.getKeyChar();
        
        if(Character.isLetter(c)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
        }
        String Caracteres = txtsecun.getText();
        if(Caracteres.length()>=4){
            evt.consume();
        
    }
    }//GEN-LAST:event_txtprinKeyTyped

    private void txtsecunKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsecunKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsecunKeyPressed

    private void txtsecunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsecunKeyTyped
 char c=evt.getKeyChar();
        
        if(Character.isLetter(c)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
        }
        String Caracteres = txtsecun.getText();
        if(Caracteres.length()>=4){
            evt.consume();
        
    }
    }//GEN-LAST:event_txtsecunKeyTyped

    private void txtcpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpuActionPerformed

    private void txtcpuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpuKeyPressed
        if (evt.getKeyCode()==evt.VK_ENTER){
       txtpantalla.requestFocus();
    }
    }//GEN-LAST:event_txtcpuKeyPressed

    private void txtcpuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpuKeyTyped
        char c=evt.getKeyChar();
            
        
                
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
              
          
        
        }
          
       
          
          String Caracteres = txtcpu.getText();
        if(Caracteres.length()>=2){
            evt.consume();
        } 
        
        
       
         
    }//GEN-LAST:event_txtcpuKeyTyped

    private void btnejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnejecutarActionPerformed
        String datos;
datos=("El cpu es de :"+txtcpu.getText()+"\n"+"La pantalla es de: "+txtpantalla.getText()+"\n"+"La ram es de:  "+txtram.getText()+"\n"+"El tiempo de garantia es :"+txtgarantia.getText()+"  años "+"\n"+"El precio es de : $ "+txtprecio.getText())+"\nLa marca es :"+cmbmarca.getSelectedItem()+"\n La camaraprincipal es de :"+txtprin.getText()+" y flash :"+chflash.isSelected()+"\nCamara Secundaria es de :"+txtsecun.getText();
                info.setText(String.valueOf(datos));
    }//GEN-LAST:event_btnejecutarActionPerformed

    private void txtpantallaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpantallaKeyPressed
         if (evt.getKeyCode()==evt.VK_ENTER){
       txtram.requestFocus();
        }
    }//GEN-LAST:event_txtpantallaKeyPressed

    private void txtpantallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpantallaKeyTyped
         char c=evt.getKeyChar();
            
        
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
              
          
        
        }String Caracteres = txtpantalla.getText();
        if(Caracteres.length()>=3){
            evt.consume();
          
    }                                    
    }//GEN-LAST:event_txtpantallaKeyTyped

    private void txtramKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtramKeyPressed
         if (evt.getKeyCode()==evt.VK_ENTER){
       txtgarantia.requestFocus();
        }
    }//GEN-LAST:event_txtramKeyPressed

    private void txtramKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtramKeyTyped
         char c=evt.getKeyChar();
            
        
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
              
          
        
        }
          String Caracteres = txtram.getText();
        if(Caracteres.length()>=3){
            evt.consume();
    }                               
    }//GEN-LAST:event_txtramKeyTyped

    private void txtgarantiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgarantiaKeyPressed
        if (evt.getKeyCode()==evt.VK_ENTER){
       txtprecio.requestFocus();
        }
    }//GEN-LAST:event_txtgarantiaKeyPressed

    private void txtgarantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgarantiaKeyTyped
        char c=evt.getKeyChar();
            
        
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
        }
          String Caracteres = txtgarantia.getText();
        if(Caracteres.length()>=2){
            evt.consume();
    }                             
    }//GEN-LAST:event_txtgarantiaKeyTyped

    private void txtprecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyPressed
        if (evt.getKeyCode()==evt.VK_ENTER){
       cmbmarca.requestFocus();
        }
    }//GEN-LAST:event_txtprecioKeyPressed

    private void txtprecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyReleased
        
    }//GEN-LAST:event_txtprecioKeyReleased

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
                char c=evt.getKeyChar();
            
        
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
        }
          String Caracteres = txtprecio.getText();
        if(Caracteres.length()>=6){
            evt.consume();
    }  
    }//GEN-LAST:event_txtprecioKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmcel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnejecutar;
    private javax.swing.JCheckBox chflash;
    private javax.swing.JCheckBox chprinci;
    private javax.swing.JCheckBox chsecundaria;
    private javax.swing.JComboBox<String> cmbmarca;
    private javax.swing.JTextArea info;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcpu;
    private javax.swing.JTextField txtgarantia;
    private javax.swing.JTextField txtpantalla;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtprin;
    private javax.swing.JTextField txtram;
    private javax.swing.JTextField txtsecun;
    // End of variables declaration//GEN-END:variables
}
