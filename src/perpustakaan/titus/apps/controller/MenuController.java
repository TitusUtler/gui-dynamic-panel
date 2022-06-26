/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan.titus.apps.controller;

import javax.swing.JOptionPane;
import perpustakaan.titus.apps.view.AboutView;
import perpustakaan.titus.apps.view.AnggotaView;
import perpustakaan.titus.apps.view.BukuView;
import perpustakaan.titus.apps.view.MainView;

/**
 *
 * @author Titus Utler
 */
public class MenuController {
    
    private AnggotaView anggotaView;
    private BukuView bukuView;
    
    public void setAnggotaView(AnggotaView anggotaView){
        this.anggotaView = anggotaView;
    }
    public void setBukuView(BukuView bukuView){
        this.bukuView = bukuView;
    }
    
    public void halamanUtama(MainView main){
        
        //Remove Panel yang sedang aktif
        main.getMainPanel().removeAll();
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();
        
        //add panel pada mainPanel dengan homePanel
        main.getMainPanel().add(main.getHomePanel());
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();
    }
    
    public void kelolaAnggota(MainView main){
        
        //Remove Panel yang sedang aktif
        main.getMainPanel().removeAll();
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();
        
        //add panel pada mainPanel dengan homePanel
        main.getMainPanel().add(anggotaView.getAnggotaPanel());
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();
    }
    
    public void kelolaBuku(MainView main){
        
        //Remove Panel yang sedang aktif
        main.getMainPanel().removeAll();
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();
        
        //add panel pada mainPanel dengan homePanel
        main.getMainPanel().add(bukuView.getBukuPanel());
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();
    }
    
    public void about(){
        AboutView about = new AboutView();
        about.setVisible(true);
    }
    public void logOut(MainView main){
        int btnDialog = JOptionPane.YES_NO_CANCEL_OPTION;
        int tampilPesan = JOptionPane.showConfirmDialog(main, "APAKAH ANDA INGIN LOG OUT ?","PERINGATAN", btnDialog);
        
        if(tampilPesan == 0){
            System.exit(0);
        } else {
            //Abaikan, kondisi true
        }
    }
    
}
