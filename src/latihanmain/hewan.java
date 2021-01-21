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
class hewan {
    String nama;
    int jalan;
    String jenis;

    
void isi(){
        hewan hewanku = new hewan ();
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan nama : ");
        hewanku.nama = input.nextLine();
        System.out.println("Masukkan langkah jalan : ");
        hewanku.jalan = input.nextInt();

        System.out.println(" ");
        System.out.println("=========================");
        System.out.println("Nama : "+hewanku.nama);
        for(int i=1; i <= hewanku.jalan; i++){
        System.out.println("Langkah "+i);   
}
}
}
