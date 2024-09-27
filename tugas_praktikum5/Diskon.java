/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_praktikum5;

/**
 *
 * @author Akbar Nugraha Dimyati
 */
import java.util.Scanner;
public class Diskon {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Total Pembelian Rp. ");
        double total = inp.nextDouble();
        
        Transaksi bel = new Transaksi(total);
        System.out.println("Besarnya potonga Rp. " + bel.diskon);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + (bel.total - bel.diskon));
    }
    
}
