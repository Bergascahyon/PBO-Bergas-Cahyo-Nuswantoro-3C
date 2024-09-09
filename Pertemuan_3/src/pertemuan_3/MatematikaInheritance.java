 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author MyPC PRO
 */
public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 math = new Matematika2();
        
        System.out.println("Penjumlahan: " + math.tambah(10, 5));
        System.out.println("Pengurangan: " + math.kurang(10, 5));
        System.out.println("Perkalian: " + math.kali(10, 5));
        System.out.println("Pembagian: " + math.bagi(10, 5));
        System.out.println("Modulus: " + math.modulus(10, 3));
    }
}
