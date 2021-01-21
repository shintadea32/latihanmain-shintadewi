/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmain;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class KelompokHewan {

String nama,jenis,makan;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat objek
        hewan hewanku = new hewan();
        Scanner input = new Scanner (System.in);
        /* memanggil atribut dan memberi nilai */
        System.out.println("Masukkan nama : ");
        hewanku.nama = input.nextLine();
        System.out.println("Masukkan makanan : ");
        hewanku.jenis = input.nextLine();
     
        switch(hewanku.jenis)
      {
          case "tumbuhan":
          hewanku.jenis = "herbivora";
          break;
          case "daging":
          hewanku.jenis = "Karnivora";
          break;
          case "daging dan tumbuhan":
          hewanku.jenis = "Omnivora";
          break;
          default:
          hewanku.jenis = "Bukan hewan";
          break;
        }
          System.out.println(" ");
          System.out.println("===========================");
          System.out.println("Nama hewan : "+hewanku.nama);
          System.out.println("Jenis hewan  : "+hewanku.jenis);
              
      }
        }
    
    
    
    
  


       
        
    
       
    
    
}
