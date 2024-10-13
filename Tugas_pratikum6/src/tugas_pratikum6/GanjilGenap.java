/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_pratikum6;

/**
 *
 * @author Dha Gas Gar
 */
public class GanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bilangan Ganjil dan Genap dari 0-20:");
        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
            i++;
        }
    }
}
