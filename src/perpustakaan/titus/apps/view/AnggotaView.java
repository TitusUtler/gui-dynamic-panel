/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan.titus.apps.view;

import java.awt.PopupMenu;
import javax.swing.JPanel;

/**
 *
 * @author Titus Utler
 */
public class AnggotaView extends javax.swing.JPanel {

    /**
     * Creates new form AnggotaView
     */
    public AnggotaView() {
        initComponents();
    }
    public JPanel getAnggotaPanel(){
        return anggotaPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anggotaPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(920, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        anggotaPanel.setPreferredSize(new java.awt.Dimension(920, 720));
        anggotaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MENU KELOLA ANGGOTA");
        anggotaPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        add(anggotaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel anggotaPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    
}
