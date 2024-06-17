/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.JOptionPane;

/**
 *
 * @author ruben
 */
public class Prin extends javax.swing.JFrame {

    /**
     * Creates new form Prin
     */
    public Prin() {
        initComponents();
        activarAyudas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mbPrin = new javax.swing.JMenuBar();
        mnLib = new javax.swing.JMenu();
        mniCol = new javax.swing.JMenuItem();
        mniCom = new javax.swing.JMenuItem();
        spGes = new javax.swing.JPopupMenu.Separator();
        mniInf = new javax.swing.JMenuItem();
        mniHelp = new javax.swing.JMenuItem();
        spEx = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libreria");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );

        mnLib.setText("Gestionar Libreria");

        mniCol.setText("Gestion Coleccion");
        mniCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniColActionPerformed(evt);
            }
        });
        mnLib.add(mniCol);

        mniCom.setText("Gestion Comic");
        mniCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniComActionPerformed(evt);
            }
        });
        mnLib.add(mniCom);
        mnLib.add(spGes);

        mniInf.setText("Informes");
        mniInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniInfActionPerformed(evt);
            }
        });
        mnLib.add(mniInf);

        mniHelp.setText("Ayudas");
        mniHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHelpActionPerformed(evt);
            }
        });
        mnLib.add(mniHelp);
        mnLib.add(spEx);

        mniExit.setText("Salir");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnLib.add(mniExit);

        mbPrin.add(mnLib);

        setJMenuBar(mbPrin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(468, 282));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniInfActionPerformed
        openInformes();
    }//GEN-LAST:event_mniInfActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        JOptionPane.showMessageDialog(this, "Cerrando el programa, que pase un buen dia");
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniColActionPerformed
        openGesCol();
    }//GEN-LAST:event_mniColActionPerformed

    private void mniComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniComActionPerformed
        openGesCom();
    }//GEN-LAST:event_mniComActionPerformed

    private void mniHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniHelpActionPerformed

    private void openGesCom() {
        new Vista.Ventanas.gesCom(this, true).setVisible(true);
    }

    private void openGesCol() {
        new Vista.Ventanas.gesCol(this, rootPaneCheckingEnabled).setVisible(true);
    }

    private void openInformes() {
        new Vista.Ventanas.Informes(this, true).setVisible(true);
    }

    private void activarAyudas() {
        try {
            URL helpURL = getClass().getResource("/Ayudas/ayuda.hs");
            HelpSet helpset = new HelpSet(null, helpURL);
            HelpBroker browser = helpset.createHelpBroker();
            browser.enableHelpOnButton(mniHelp, "index", helpset);
            browser.enableHelpKey(jPanel1, "Prin", helpset);
        } catch (HelpSetException e) {
            System.out.println("Error generando ayuda");
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar mbPrin;
    private javax.swing.JMenu mnLib;
    private javax.swing.JMenuItem mniCol;
    private javax.swing.JMenuItem mniCom;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniHelp;
    private javax.swing.JMenuItem mniInf;
    private javax.swing.JPopupMenu.Separator spEx;
    private javax.swing.JPopupMenu.Separator spGes;
    // End of variables declaration//GEN-END:variables
}
