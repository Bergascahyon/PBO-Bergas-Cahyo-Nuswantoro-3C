/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasNo_1.TugasNo_2;

/**
 *
 * @author Dha Gas Gar
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari kelas Matematika
        Matematika matematika = new Matematika();

        // Menjalankan metode dan menampilkan hasil
        int hasilPertambahan = matematika.pertambahan(20, 10);
        int hasilPengurangan = matematika.pengurangan(10, 5);
        int hasilPerkalian = matematika.perkalian(10, 3);
        int hasilPembagian = matematika.pembagian(21, 2);

        // Menampilkan hasil
        System.out.println("Pertambahan : 20 + 10 = " + hasilPertambahan);
        System.out.println("Pengurangan : 10 - 5 = " + hasilPengurangan);
        System.out.println("Perkalian   : 10 * 3 = " + hasilPerkalian);
        System.out.println("Pembagian   : 21 / 2 = " + hasilPembagian);
    }
}
