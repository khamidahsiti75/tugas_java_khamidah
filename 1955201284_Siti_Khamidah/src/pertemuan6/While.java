/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import java.util.Scanner;


/**
 *
 * @author OWNER
 */
public class While {
    public static void main(String[] args) {
        
        //membuat variabel dan scanner
        boolean running = true;
        String jawab;
        Scanner scan = new Scanner(System.in); 
        int counter = 0;
        
        while (running) {
        System.out.println("apakah anda ingin berangkat sekolah");
        System.out.println("jawab [ya/tidak]> ");
        
        jawab = scan.nextLine();
        
        // cek jawabannya, kalau ya maka berhenti
        if (jawab.equalsIgnoreCase("ya") ){
            running = false;
            } 
        counter++;
        }
        System.out.println("anda sudah melakukan perulangan sebanyak " + counter + " kali"); 
    }   
}   

 