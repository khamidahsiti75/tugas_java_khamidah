/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author OWNER
 */
public class TugasBufferedReader {


    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here       
        String nama = "";
        String status = "";
        String alamat = "";
        int rt = 0;
        int rw = 0;
        double NOSandal = 0;
        String namaibu = "";
        String namaayah = "";
         // object inputStrim 
       InputStreamReader isr = new InputStreamReader(System.in);
         // object buffredReader
       BufferedReader br  = new BufferedReader(isr);
               
         // mengisi variabel nama dengan bufferedReader
        System.out.println("siapa nama anda?");  
        nama = br.readLine();
        
        System.out.println("anda masih sendiri atau sudah memiliki pasangan?");   
        status = br.readLine();
        
        System.out.println("anda tinggal dimana?");
        alamat = br.readLine();
        
        System.out.println("RT berapa?");
        rt = Integer.parseInt(br.readLine());
        
        System.out.println("RW berapa?");
        rw = Integer.parseInt(br.readLine());
        
        System.out.println("Nomor sandal Anda?");
        NOSandal = Double.parseDouble(br.readLine());
        
        System.out.println("siapa nama ibu anda?");
        namaibu = br.readLine();
        
        System.out.println("siapa nama ayah anda?");
        namaayah = br.readLine();
        
        //menampilkan nama
        System.out.println("data anda sebagai berikut:");
        System.out.println("Nama " + nama);  
        System.out.println("Status " + status);
        System.out.println("Tinggal di " + alamat);        
        System.out.println("RT " + rt);
        System.out.println("RW " + rw);
        System.out.println("No Sandal  " + NOSandal);
        System.out.println("Nama ibu " + namaibu); 
        System.out.println("Nama ayah "  + namaayah);
    }
}


