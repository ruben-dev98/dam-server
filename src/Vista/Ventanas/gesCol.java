/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Ventanas;

import Controlador.gestionCol;
import Controlador.gestionLib;
import Modelo.Coleccion;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author luisvi
 */
public class gesCol extends javax.swing.JDialog {

    /**
     * Creates new form ColeccionDlg
     */
    public gesCol(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadCombo();
    }

    private void loadCombo() {
        ArrayList<Coleccion> cols = gestionCol.getColecciones();
        if (cmbCol.getSelectedIndex() != -1) {
            cmbCol.removeAllItems();
        }
        if (!cols.isEmpty()) {
            gestionLib.loadComboBox(cmbCol, cols);
        }
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaSinopsis = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        cmbCol = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion Coleccion");
        setMinimumSize(new java.awt.Dimension(450, 250));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Editorial:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Sinopsis:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(txtNombre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(txtEditorial, gridBagConstraints);

        btnSave.setText("Guardar");
        btnSave.setMaximumSize(new java.awt.Dimension(75, 35));
        btnSave.setMinimumSize(new java.awt.Dimension(75, 35));
        btnSave.setPreferredSize(new java.awt.Dimension(75, 35));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(btnSave, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(filler4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(filler9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(filler1, gridBagConstraints);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtaSinopsis.setColumns(20);
        txtaSinopsis.setLineWrap(true);
        txtaSinopsis.setRows(5);
        txtaSinopsis.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtaSinopsis);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jLabel4.setText("Coleccion: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jLabel4, gridBagConstraints);

        cmbCol.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbColItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(cmbCol, gridBagConstraints);

        btnUpdate.setText("Editar");
        btnUpdate.setMaximumSize(new java.awt.Dimension(75, 35));
        btnUpdate.setMinimumSize(new java.awt.Dimension(75, 35));
        btnUpdate.setPreferredSize(new java.awt.Dimension(75, 35));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(btnUpdate, gridBagConstraints);

        btnDelete.setText("Borrar");
        btnDelete.setMaximumSize(new java.awt.Dimension(75, 35));
        btnDelete.setMinimumSize(new java.awt.Dimension(75, 35));
        btnDelete.setPreferredSize(new java.awt.Dimension(75, 35));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(btnDelete, gridBagConstraints);

        setBounds(0, 0, 776, 474);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (!txtNombre.getText().isEmpty() && !txtEditorial.getText().isEmpty() && !txtaSinopsis.getText().isEmpty()) {
            guardarColeccion();
            loadCombo();
        } else {
            JOptionPane.showMessageDialog(this, "Falta algun campo`que es obligatorio rellenar");
        }
//guardarColeccion();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (cmbCol.getSelectedIndex() != -1 && !txtNombre.getText().isEmpty() && !txtEditorial.getText().isEmpty() && !txtaSinopsis.getText().isEmpty()) {
            editarColeccion();
            loadCombo();
        } else {
            JOptionPane.showMessageDialog(this, "Falta algun campo`que es obligatorio rellenar o puede que no haya ninguna coleccion en nuestra base de datos");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (cmbCol.getSelectedIndex() != -1) {
            borrarColeccion();
            loadCombo();
        } else {
            JOptionPane.showMessageDialog(this, "No hay ninguna coleccion en nuestra base de datos");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbColItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbColItemStateChanged
        if (cmbCol.getSelectedIndex() != -1) {
            Coleccion col = cmbCol.getItemAt(cmbCol.getSelectedIndex());
            txtNombre.setText(col.getNombre());
            txtEditorial.setText(col.getEditorial());
            txtaSinopsis.setText(col.getSinopsis());
        }
    }//GEN-LAST:event_cmbColItemStateChanged

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
            java.util.logging.Logger.getLogger(gesCol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gesCol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gesCol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gesCol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gesCol dialog = new gesCol(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<Coleccion> cmbCol;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtaSinopsis;
    // End of variables declaration//GEN-END:variables

    private void guardarColeccion() {
        Coleccion coleccion = null;

        String nombre = txtNombre.getText();
        String editorial = txtEditorial.getText();
        String sinopsis = txtaSinopsis.getText();
        coleccion = new Coleccion(nombre, sinopsis, editorial);

        gestionCol.insertColeccion(coleccion);
    }

    private void editarColeccion() {
        Coleccion coleccion = cmbCol.getItemAt(cmbCol.getSelectedIndex());

        String nombre = txtNombre.getText();
        String editorial = txtEditorial.getText();
        String sinopsis = txtaSinopsis.getText();

        coleccion.setNombre(nombre);
        coleccion.setSinopsis(sinopsis);
        coleccion.setEditorial(editorial);

        gestionCol.updateColeccion(coleccion);
    }

    private void borrarColeccion() {
        Coleccion coleccion = cmbCol.getItemAt(cmbCol.getSelectedIndex());
        gestionCol.deleteColeccion(coleccion);
    }
}
