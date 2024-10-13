/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_pratikum6;

/**
 *
 * @author Dha Gas Gar
 */
public class Prima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bilangan Prima dan Bukan Prima dari 0-20:");
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " bukan bilangan prima");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
