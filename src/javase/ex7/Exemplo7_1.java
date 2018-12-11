/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.ex7;

import java.awt.Color;

/**
 *
 * @author Michel
 */
public class Exemplo7_1 extends javax.swing.JFrame {

    /**
     * Creates new form Exemplo7
     */
    public Exemplo7_1() {
        initComponents();
        JBGCores.add(JRBAzul);
        JBGCores.add(JRBVerde);
        JBGCores.add(JRBVermelho);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JMPOPUPCores = new javax.swing.JPopupMenu();
        JRBAzul = new javax.swing.JRadioButtonMenuItem();
        JRBVerde = new javax.swing.JRadioButtonMenuItem();
        JRBVermelho = new javax.swing.JRadioButtonMenuItem();
        JBGCores = new javax.swing.ButtonGroup();
        JLJava = new javax.swing.JLabel();

        JRBAzul.setText("Azul");
        JRBAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBAzulActionPerformed(evt);
            }
        });
        JMPOPUPCores.add(JRBAzul);

        JRBVerde.setText("Verde");
        JRBVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBVerdeActionPerformed(evt);
            }
        });
        JMPOPUPCores.add(JRBVerde);

        JRBVermelho.setText("Vermelho");
        JRBVermelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBVermelhoActionPerformed(evt);
            }
        });
        JMPOPUPCores.add(JRBVermelho);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        JLJava.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        JLJava.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLJava.setText("JAVA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLJava, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLJava, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        System.out.println("evt.isPopupTrigger() " + evt.isPopupTrigger());
        if (evt.isPopupTrigger()) {
            JMPOPUPCores.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_formMouseReleased

    private void JRBAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBAzulActionPerformed
        JLJava.setForeground(Color.blue);
    }//GEN-LAST:event_JRBAzulActionPerformed

    private void JRBVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBVerdeActionPerformed
        JLJava.setForeground(Color.green);
    }//GEN-LAST:event_JRBVerdeActionPerformed

    private void JRBVermelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBVermelhoActionPerformed
        JLJava.setForeground(Color.red);
    }//GEN-LAST:event_JRBVermelhoActionPerformed

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
            java.util.logging.Logger.getLogger(Exemplo7_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo7_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo7_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo7_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo7_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup JBGCores;
    private javax.swing.JLabel JLJava;
    private javax.swing.JPopupMenu JMPOPUPCores;
    private javax.swing.JRadioButtonMenuItem JRBAzul;
    private javax.swing.JRadioButtonMenuItem JRBVerde;
    private javax.swing.JRadioButtonMenuItem JRBVermelho;
    // End of variables declaration//GEN-END:variables
}
