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
public class switchCase {
    public static void main(String[] args) {
        int tanggal_lahir = 23;
         
        switch(tanggal_lahir){
            case 21 :
                System.out.println("angelia sondah, jakarta"); 
                break;
            case 22 :  
                System.out.println("zidni aini, surabaya");
                break;
            case 23 :  
                System.out.println("siti khamidah, padangasri");
                break;
            case 24 : 
                System.out.println("krisdayanti, korea");
                break;
            default: 
                System.out.println("maaf tanggal lahir tersedia hanya dari tanggal 21-24");    
        }
    }    
}