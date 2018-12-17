/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.adityanuriskandar.latihanmvc.controller;

import id.adityanuriskandar.latihanmvc.model.PelangganModel;
import id.adityanuriskandar.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Aditya Nur Iskandar
 * NIM : 10117070
 * Nama : Aditya Nur Iskandar
 * Kelas :IF 2
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtnama().getText();
        String email = view.getTxtemail().getText();
        String notelp = view.getTxtnotelp().getText();
        
        if (nama.equals("") && email.equals("") && notelp.equals("")) {
            
        }else{
            model.resetForm();
        }
        
        
    }
    
    public void simpanForm(PelangganView view){
        
        String nama = view.getTxtnama().getText();
        String email = view.getTxtemail().getText();
        String notelp = view.getTxtnotelp().getText();
        
        if (nama.trim().equals("")) {
            
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong!");
        }else if (email.trim().equals("")) {
            
            JOptionPane.showMessageDialog(view, "email Masih Kosong!");
        }else if (notelp.trim().equals("")) {
            
            JOptionPane.showMessageDialog(view, "No  Masih Kosong!");
        }else{
            model.simpanForm();
        }
        
    }
}
