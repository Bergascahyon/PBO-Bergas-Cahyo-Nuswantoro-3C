/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasNo_1;

/**
 *
 * @author Dha Gas Gar
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
