/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex1;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

/**
 *
 * @author Michel
 */
public class Exemplo1_1 extends javax.swing.JFrame {

    /**
     * Creates new form Exemplo1
     */
    public Exemplo1_1() {
        initComponents();
        setTitle("Título do Exemplo 1_1");
        setSize(410, 250);

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Exemplo1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo1_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLCinza;
    private javax.swing.JLabel JLRoxo;
    private javax.swing.JLabel JLVermelho;
    // End of variables declaration//GEN-END:variables
}
