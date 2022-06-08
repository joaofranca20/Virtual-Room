/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import cadastroUsuario.usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author João
 */
public class TelaPrincipal extends javax.swing.JFrame {

    usuario Usuario = new usuario();


    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        checkTecnologia = new javax.swing.JCheckBox();
        checkIndustria = new javax.swing.JCheckBox();
        checkAutomobilismo = new javax.swing.JCheckBox();
        checkInovacao = new javax.swing.JCheckBox();
        checkJogos = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vr.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addContainerGap(638, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(51, 102, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecione um interesse");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 26, -1, -1));

        checkTecnologia.setBackground(new java.awt.Color(51, 102, 255));
        checkTecnologia.setForeground(new java.awt.Color(255, 255, 255));
        checkTecnologia.setText("Tecnologia");
        jPanel2.add(checkTecnologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 61, 102, 35));

        checkIndustria.setBackground(new java.awt.Color(51, 102, 255));
        checkIndustria.setForeground(new java.awt.Color(255, 255, 255));
        checkIndustria.setText("Indústria");
        jPanel2.add(checkIndustria, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 114, 102, 35));

        checkAutomobilismo.setBackground(new java.awt.Color(51, 102, 255));
        checkAutomobilismo.setForeground(new java.awt.Color(255, 255, 255));
        checkAutomobilismo.setText("Automobilismo");
        jPanel2.add(checkAutomobilismo, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 167, 140, 35));

        checkInovacao.setBackground(new java.awt.Color(51, 102, 255));
        checkInovacao.setForeground(new java.awt.Color(255, 255, 255));
        checkInovacao.setText("Inovação");
        jPanel2.add(checkInovacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 220, 102, 35));

        checkJogos.setBackground(new java.awt.Color(51, 102, 255));
        checkJogos.setForeground(new java.awt.Color(255, 255, 255));
        checkJogos.setText("Jogos");
        jPanel2.add(checkJogos, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 273, 102, 35));

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Entrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 310, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(checkTecnologia.isSelected()){
            //abre tela de tecnologia
            JOptionPane.showMessageDialog(null, "tecnologia");
        }else if(checkIndustria.isSelected()){
            //abre tela industria
            JOptionPane.showMessageDialog(null, "industria");
        }else if(checkAutomobilismo.isSelected()){
            //abre tela automobilismo
            JOptionPane.showMessageDialog(null, "auto");
        }else if(checkInovacao.isSelected()){
            //abre tela inovacao
            JOptionPane.showMessageDialog(null, "inovacao");
        }else if(checkJogos.isSelected()){
            //abre tela jogos
            JOptionPane.showMessageDialog(null, "jogos");
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma opção.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkAutomobilismo;
    private javax.swing.JCheckBox checkIndustria;
    private javax.swing.JCheckBox checkInovacao;
    private javax.swing.JCheckBox checkJogos;
    private javax.swing.JCheckBox checkTecnologia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
