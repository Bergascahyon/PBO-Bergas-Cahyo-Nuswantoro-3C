/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_praktikum7;

import java.util.Scanner;

/**
 *
 * @author Akbar Nugraha Dimyati
 */
public class Toko {
    public static void main(String[] args) {
            Scanner inpt = new Scanner(System.in);
        
        int i, total = 0;
        String[] nama_brg = new String[30];
        String[] code_brg = new String[30];
        int[] jml_beli = new int[15];
        int[] jml_bayar = new int[15];
        int[] harga = new int[15];
        int jml;
        
        System.out.println("TOKO SERBA ADA");
        System.out.print("Masukan Jumlah Item Barang: ");
        jml = inpt.nextInt();
        System.out.println(" ");
        
        for(i=0;i<jml;i++){
            System.out.println("Data ke- "+(i+1));
            System.out.print("Masukan Kode Barang: ");
            code_brg[i] = inpt.next();
            System.out.print("Masukan Jumlah Beli: ");
            jml_beli[i] = inpt.nextInt();
            System.out.print(" ");
            
            switch(code_brg[i]){
                case "a001" -> {
                    nama_brg[i] = "Buku";
                    harga[i] = 3000;
                    System.out.println(" ");
                    }
                case "a002" -> {
                    nama_brg[i] = "Pensil";
                    harga[i] = 4000;
                    System.out.println(" ");
                    }
                case "a003" -> {
                    nama_brg[i] = "Pulpen";
                    harga[i] = 5000;
                    System.out.println(" ");
                    }
                default -> System.out.println("Kode yang anda masukan salah!");
            }
        }
        
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("===============================================================================");
        for(i=0;i<jml;i++){
            jml_bayar[i] = harga[i] * jml_beli[i];
            System.out.println((i+1)+"\t"+code_brg[i]+"\t\t"+nama_brg[i]+"\t    \t"+harga[i]+"\t  "+jml_beli[i]+"\t\t"+jml_bayar[i]);
            total += jml_bayar[i];
            
        }
        System.out.println("===============================================================================");
        System.out.println("Total Bayar:\t\t\t\t\t\t\t"+total);
        System.out.println("===============================================================================");
        System.out.println("EZ");
    }
}
