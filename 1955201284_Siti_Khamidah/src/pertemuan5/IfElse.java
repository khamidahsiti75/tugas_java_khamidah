/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author OWNER
 */
public class IfElse {
    public static void main(String[] args) {
        
        // memasak mie instan
        
        System.out.println("siapkan 1 bungkus mie instan,air secukupnya,panci,mangkok,sendok,garpu");

        System.out.println("masukkan air kedalam panci");

        System.out.println("masak air");

        System.out.println("tunggu hingga air mendidih");
        boolean mendidih = true;
        boolean matang = true;
        boolean merata = true;
        if (mendidih == true){
            System.out.println("masukkan mie instan");
            System.out.println("aduk dan tunggu hingga matang ");
            
            if (matang == true) {
                System.out.println("masukkan mie dan bumbu kedalam mangkok");
                System.out.println("aduk hingga merata");
                
                if (merata == true){
                    System.out.println("sajikan mie");
                } else {
                    System.out.println("aduk lagi sampai merata");
                }
            } else {
                System.out.println("mie belum matang, masak lagi sampai matang");
            
            }
        }
    }
    
}

    
 
    
    

