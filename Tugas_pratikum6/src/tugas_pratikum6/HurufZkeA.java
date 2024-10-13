/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_pratikum6;

/**
 *
 * @author Dha Gas Gar
 */
public class HurufZkeA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Huruf dari Z ke A:");
        char huruf = 'Z';
        do {
            System.out.print(huruf + " ");
            huruf--;
        } while (huruf >= 'A');
        System.out.println();
    }
}
