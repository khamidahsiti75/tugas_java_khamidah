/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;


/**
 *
 * @author OWNER
 */
public class TugasJOptionsPane {
    public static void main(String[] args) {
        
        
        String belajar = JOptionPane.showInputDialog("dimana anda belajar?");
        JOptionPane.showMessageDialog(null,"Anda belajar di " + belajar);

        String makan = JOptionPane.showInputDialog("dimana anda makan?");
        JOptionPane.showMessageDialog(null, "Anda makan di " + makan);
        
        String hobi = JOptionPane.showInputDialog("apa hobi anda?");
        JOptionPane.showMessageDialog(null,"hobi anda adalah " + hobi);
        
        String bekerja = JOptionPane.showInputDialog("apa pekerjaan anda?");
        JOptionPane.showMessageDialog(null, "Anda bekerja sebagai " + bekerja);
        
        String makananFaforit = JOptionPane.showInputDialog("apa makanan faforit anda?");
        JOptionPane.showMessageDialog(null, "makanan faforit anda adalah " + makananFaforit);
        
        String kuliah = JOptionPane.showInputDialog("dimana anda kuliah?");
        JOptionPane.showMessageDialog(null, "anda kuliah di " + kuliah);
        
        String tidur = JOptionPane.showInputDialog("dimana anda tidur?");
        JOptionPane.showMessageDialog(null, "anda tidur di " + tidur);
        
        String pekerjaanibu = JOptionPane.showInputDialog("apa pekerjaan ibu anda?");
        JOptionPane.showMessageDialog(null, "ibu anda bekerja sebagai " + pekerjaanibu);
        
        String judulfilm = JOptionPane.showInputDialog("apa judul  film yang anda sukai ?");
        JOptionPane.showMessageDialog(null, "film yang anda sukai adalah " + judulfilm);
        
        String citacita = JOptionPane.showInputDialog("apa cita-cita anda?");
        JOptionPane.showMessageDialog(null, "cita-cita anda adalah " + citacita);
        
          }
}


