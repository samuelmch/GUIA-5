/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Diegp
 */
public class frmpromedio extends javax.swing.JFrame {

    /**
     * Creates new form frmpromedio
     */
    public frmpromedio() {
        initComponents();
       txtsegundo.setEnabled(false);
       txttercero.setEnabled(false);
       txtcuarto.setEnabled(false);
       txtquinto.setEnabled(false);
       txtsexto.setEnabled(false);
       txtseptimo.setEnabled(false);
       txtoctavo.setEnabled(false);
       txtnoveno.setEnabled(false);
       txtdecimo.setEnabled(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtprimero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtsegundo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txttercero = new javax.swing.JTextField();
        txtcuarto = new javax.swing.JTextField();
        txtquinto = new javax.swing.JTextField();
        txtsexto = new javax.swing.JTextField();
        txtseptimo = new javax.swing.JTextField();
        txtoctavo = new javax.swing.JTextField();
        txtnoveno = new javax.swing.JTextField();
        txtdecimo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblpromedio = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("     Calcular Promedio");

        jLabel2.setText("ingrese primer numero");

        txtprimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprimeroActionPerformed(evt);
            }
        });
        txtprimero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprimeroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprimeroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprimeroKeyTyped(evt);
            }
        });

        jLabel3.setText("Ingrese segundo numero:");

        txtsegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsegundoActionPerformed(evt);
            }
        });
        txtsegundo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsegundoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsegundoKeyTyped(evt);
            }
        });

        jLabel4.setText("Ingrese tercer numero:");

        jLabel5.setText("Ingrese cuarto  numero:");

        jLabel6.setText("Ingrese quinto numero:");

        jLabel7.setText("Ingrese sexto numero:");

        jLabel8.setText("Ingrese septimo numero:");

        jLabel9.setText("Ingrese octavo numero:");

        jLabel10.setText("Ingrese noveno numero:");

        jLabel11.setText("Ingrese decimo numero:");

        txttercero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtterceroActionPerformed(evt);
            }
        });
        txttercero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtterceroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtterceroKeyTyped(evt);
            }
        });

        txtcuarto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcuartoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcuartoKeyTyped(evt);
            }
        });

        txtquinto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtquintoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtquintoKeyTyped(evt);
            }
        });

        txtsexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsextoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsextoKeyTyped(evt);
            }
        });

        txtseptimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtseptimoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtseptimoKeyTyped(evt);
            }
        });

        txtoctavo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtoctavoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtoctavoKeyTyped(evt);
            }
        });

        txtnoveno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnovenoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnovenoKeyTyped(evt);
            }
        });

        txtdecimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdecimoKeyTyped(evt);
            }
        });

        jButton1.setText("Calcular Promedio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Su promedio es :");

        jButton2.setText("Regresar a ver la funciones de la APP 1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setText("PRESIONAR LA TECLA ENTER PARA AVANZAR POR LAS CASILLA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel9)))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdecimo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnoveno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtseptimo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsexto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtoctavo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtquinto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttercero, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprimero, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel13)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprimero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(txtsexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtseptimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttercero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(txtoctavo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtcuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtnoveno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtquinto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtdecimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblpromedio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double num1=Double.parseDouble(txtprimero.getText());
        double num2=Double.parseDouble(txtsegundo.getText());
        double num3=Double.parseDouble(txttercero.getText());
        double num4=Double.parseDouble(txtcuarto.getText());
        double num5=Double.parseDouble(txtquinto.getText());
        double num6=Double.parseDouble(txtsexto.getText());
        double num7=Double.parseDouble(txtseptimo.getText());
        double num8=Double.parseDouble(txtoctavo.getText());
        double num9=Double.parseDouble(txtnoveno.getText());
        double num10=Double.parseDouble(txtdecimo.getText());
        
        lblpromedio.setText(String.valueOf((num1+num2+num3+num4+num5+num6+num7+num8+num9+num10)/10));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtprimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprimeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprimeroActionPerformed

    private void txtprimeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimeroKeyPressed
        if (evt.getKeyCode()==evt.VK_ENTER){
       txtsegundo.requestFocus();
       txtsegundo.setEnabled(true);
    }
    }//GEN-LAST:event_txtprimeroKeyPressed

    private void txtprimeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimeroKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprimeroKeyReleased

    private void txtprimeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimeroKeyTyped
      char c=evt.getKeyChar();
            
        
                
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
              
          
        
        }
    }//GEN-LAST:event_txtprimeroKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtsegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsegundoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsegundoActionPerformed

    private void txtterceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtterceroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtterceroActionPerformed

    private void txtsegundoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsegundoKeyTyped
 char c=evt.getKeyChar();
            
        
                
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
              
          
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtsegundoKeyTyped

    private void txtterceroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtterceroKeyTyped
 char c=evt.getKeyChar();
            
        
                
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
              
          
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtterceroKeyTyped

    private void txtcuartoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuartoKeyTyped
 char c=evt.getKeyChar();
            
        
                
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
              
          
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtcuartoKeyTyped

    private void txtquintoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtquintoKeyTyped
 char c=evt.getKeyChar();
            
        
                
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
              
          
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtquintoKeyTyped

    private void txtsextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsextoKeyTyped
 char c=evt.getKeyChar();
            
        
                
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
              
          
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtsextoKeyTyped

    private void txtseptimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtseptimoKeyTyped
 char c=evt.getKeyChar();
            
        
                
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
              
          
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtseptimoKeyTyped

    private void txtoctavoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtoctavoKeyTyped
 char c=evt.getKeyChar();
            
        
                
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
              
          
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtoctavoKeyTyped

    private void txtnovenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnovenoKeyTyped
 char c=evt.getKeyChar();
            
        
                
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
              
          
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtnovenoKeyTyped

    private void txtdecimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdecimoKeyTyped
 char c=evt.getKeyChar();
            
        
                
          if(Character.isLetter(c)) {
              getToolkit().beep();
              
              evt.consume();
              
              JOptionPane.showMessageDialog(rootPane,"Ingresa Solo Numeros");
              
          
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtdecimoKeyTyped

    private void txtsegundoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsegundoKeyPressed
      if (evt.getKeyCode()==evt.VK_ENTER){
       txttercero.requestFocus();
       txttercero.setEnabled(true);
      }
    }//GEN-LAST:event_txtsegundoKeyPressed

    private void txtterceroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtterceroKeyPressed
       if (evt.getKeyCode()==evt.VK_ENTER){
       txtcuarto.requestFocus();
       txtcuarto.setEnabled(true);
       }
    }//GEN-LAST:event_txtterceroKeyPressed

    private void txtcuartoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuartoKeyPressed
      if (evt.getKeyCode()==evt.VK_ENTER){
       txtquinto.requestFocus();
       txtquinto.setEnabled(true);}
    }//GEN-LAST:event_txtcuartoKeyPressed

    private void txtquintoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtquintoKeyPressed
     if (evt.getKeyCode()==evt.VK_ENTER){
       txtsexto.requestFocus();
       txtsexto.setEnabled(true);}
    }//GEN-LAST:event_txtquintoKeyPressed

    private void txtsextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsextoKeyPressed
        if (evt.getKeyCode()==evt.VK_ENTER){
       txtseptimo.requestFocus();
       txtseptimo.setEnabled(true);}
    }//GEN-LAST:event_txtsextoKeyPressed

    private void txtseptimoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtseptimoKeyPressed
        if (evt.getKeyCode()==evt.VK_ENTER){
       txtoctavo.requestFocus();
       txtoctavo.setEnabled(true);}
    }//GEN-LAST:event_txtseptimoKeyPressed

    private void txtoctavoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtoctavoKeyPressed
        if (evt.getKeyCode()==evt.VK_ENTER){
       txtnoveno.requestFocus();
       txtnoveno.setEnabled(true);}
    }//GEN-LAST:event_txtoctavoKeyPressed

    private void txtnovenoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnovenoKeyPressed
       if (evt.getKeyCode()==evt.VK_ENTER){
       txtdecimo.requestFocus();
       txtdecimo.setEnabled(true);}
    }//GEN-LAST:event_txtnovenoKeyPressed

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
            java.util.logging.Logger.getLogger(frmpromedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmpromedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmpromedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmpromedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmpromedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblpromedio;
    private javax.swing.JTextField txtcuarto;
    private javax.swing.JTextField txtdecimo;
    private javax.swing.JTextField txtnoveno;
    private javax.swing.JTextField txtoctavo;
    private javax.swing.JTextField txtprimero;
    private javax.swing.JTextField txtquinto;
    private javax.swing.JTextField txtsegundo;
    private javax.swing.JTextField txtseptimo;
    private javax.swing.JTextField txtsexto;
    private javax.swing.JTextField txttercero;
    // End of variables declaration//GEN-END:variables

    private void txtprimeroActionPerfomed(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
