/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex1;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Michel
 */
public class Exemplo1_5 extends javax.swing.JFrame {

    int clicouEmGravar = 0, clicouEmSair = 0;

    public Exemplo1_5() {
        initComponents();
        setTitle("Fase 1");
        setSize(410, 350);

        Image il;
        il = Toolkit.getDefaultToolkit()
                .getImage("img//livros.jpg");
        setIconImage(il);

        centralizar();

        JLCinza.setSize(370, 50);
        JLCinza.setLocation(10, 10);

        JLCinza.setHorizontalAlignment(SwingConstants.LEFT);
        JLCinza.setVerticalAlignment(SwingConstants.TOP);
        JLCinza.setHorizontalTextPosition(SwingConstants.RIGHT);
        JLCinza.setVerticalTextPosition(SwingConstants.CENTER);

        JLVermelho.setSize(370, 50);
        JLVermelho.setLocation(10, 70);

        JLVermelho.setHorizontalAlignment(SwingConstants.LEFT);
        JLVermelho.setVerticalAlignment(SwingConstants.TOP);
        JLVermelho.setHorizontalTextPosition(SwingConstants.RIGHT);
        JLVermelho.setVerticalTextPosition(SwingConstants.CENTER);

        JLRoxo.setSize(370, 50);
        JLRoxo.setLocation(10, 130);

        JLRoxo.setHorizontalAlignment(SwingConstants.LEFT);
        JLRoxo.setVerticalAlignment(SwingConstants.TOP);
        JLRoxo.setHorizontalTextPosition(SwingConstants.RIGHT);
        JLRoxo.setVerticalTextPosition(SwingConstants.CENTER);

        JBGravar.setLocation(20, 20);
        JBGravar.setEnabled(true);

        JBSair.setLocation(20, 20);
        JBSair.setMnemonic('s');

        JPGravar.setLocation(10, 200);
        JPSair.setLocation(200, 200);

        JLGravou.setLocation(10, 280);
        JLSaiu.setLocation(200, 280);

    }

    public void centralizar() {
        Dimension dt = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dj = getSize();

        if (dj.height > dt.height) {
            setSize(dj.width, dt.height);
        }
        if (dj.width > dt.width) {
            setSize(dj.width, dj.height);
        }
        setLocation((dt.width - dj.width) / 2,
                (dt.height - dj.height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLCinza = new javax.swing.JLabel();
        JLVermelho = new javax.swing.JLabel();
        JLRoxo = new javax.swing.JLabel();
        JPGravar = new javax.swing.JPanel();
        JBGravar = new javax.swing.JButton();
        JPSair = new javax.swing.JPanel();
        JBSair = new javax.swing.JButton();
        JLGravou = new javax.swing.JLabel();
        JLSaiu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        JLCinza.setBackground(new java.awt.Color(153, 153, 153));
        JLCinza.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLCinza.setForeground(new java.awt.Color(255, 255, 255));
        JLCinza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javase/img/livroIcon.png"))); // NOI18N
        JLCinza.setText("  Livro 1");
        JLCinza.setToolTipText("Esse é o livro 1");
        JLCinza.setOpaque(true);
        getContentPane().add(JLCinza);
        JLCinza.setBounds(20, 20, 523, 81);

        JLVermelho.setBackground(new java.awt.Color(255, 51, 51));
        JLVermelho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLVermelho.setForeground(new java.awt.Color(255, 255, 255));
        JLVermelho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLVermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javase/img/livroIcon.png"))); // NOI18N
        JLVermelho.setText("  Livro 2");
        JLVermelho.setToolTipText("Esse é o livro 1");
        JLVermelho.setOpaque(true);
        getContentPane().add(JLVermelho);
        JLVermelho.setBounds(20, 110, 523, 81);

        JLRoxo.setBackground(new java.awt.Color(153, 0, 255));
        JLRoxo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLRoxo.setForeground(new java.awt.Color(255, 255, 255));
        JLRoxo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JLRoxo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javase/img/livroIcon.png"))); // NOI18N
        JLRoxo.setText("  Livro 3  ");
        JLRoxo.setToolTipText("Esse é o livro 1");
        JLRoxo.setOpaque(true);
        getContentPane().add(JLRoxo);
        JLRoxo.setBounds(20, 200, 523, 81);

        JPGravar.setBackground(new java.awt.Color(0, 0, 0));
        JPGravar.setLayout(null);

        JBGravar.setBackground(new java.awt.Color(0, 0, 170));
        JBGravar.setFont(new java.awt.Font("HelvLight", 1, 12)); // NOI18N
        JBGravar.setForeground(new java.awt.Color(255, 255, 0));
        JBGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javase/img/botaoGravar.jpg"))); // NOI18N
        JBGravar.setMnemonic(71);
        JBGravar.setText("Gravar");
        JBGravar.setToolTipText("Esse botão grava os dados.");
        JBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGravarActionPerformed(evt);
            }
        });
        JPGravar.add(JBGravar);
        JBGravar.setBounds(20, 20, 130, 30);

        getContentPane().add(JPGravar);
        JPGravar.setBounds(20, 290, 170, 70);

        JPSair.setBackground(new java.awt.Color(0, 0, 0));
        JPSair.setLayout(null);

        JBSair.setBackground(new java.awt.Color(0, 0, 170));
        JBSair.setFont(new java.awt.Font("HelvLight", 1, 12)); // NOI18N
        JBSair.setForeground(new java.awt.Color(255, 255, 0));
        JBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javase/img/botaoSair.jpg"))); // NOI18N
        JBSair.setText("Sair");
        JBSair.setToolTipText("Esse botão grava os dados.");
        JBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairActionPerformed(evt);
            }
        });
        JPSair.add(JBSair);
        JBSair.setBounds(20, 20, 130, 30);

        getContentPane().add(JPSair);
        JPSair.setBounds(240, 290, 170, 70);

        JLGravou.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        JLGravou.setText("GRAVOU: ");
        getContentPane().add(JLGravou);
        JLGravou.setBounds(20, 370, 160, 20);

        JLSaiu.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        JLSaiu.setText("GRAVOU: ");
        getContentPane().add(JLSaiu);
        JLSaiu.setBounds(240, 370, 160, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGravarActionPerformed
        clicouEmGravar++;
        JLGravou.setText("GRAVOU: " + clicouEmGravar + " Vezes ");
    }//GEN-LAST:event_JBGravarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //  JOptionPane.showMessageDialog(rootPane, "Cheguei!");
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //  JOptionPane.showMessageDialog(rootPane, "Fui!");
    }//GEN-LAST:event_formWindowClosing

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        clicouEmSair++;
        JLSaiu.setText("GRAVOU: " + clicouEmSair + " Vezes ");
    }//GEN-LAST:event_JBSairActionPerformed

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
            java.util.logging.Logger.getLogger(Exemplo1_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo1_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo1_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo1_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Exemplo1_5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGravar;
    private javax.swing.JButton JBSair;
    private javax.swing.JLabel JLCinza;
    private javax.swing.JLabel JLGravou;
    private javax.swing.JLabel JLRoxo;
    private javax.swing.JLabel JLSaiu;
    private javax.swing.JLabel JLVermelho;
    private javax.swing.JPanel JPGravar;
    private javax.swing.JPanel JPSair;
    // End of variables declaration//GEN-END:variables
}
