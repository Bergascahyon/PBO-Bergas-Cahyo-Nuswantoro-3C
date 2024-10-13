/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_pratikum6;

import java.util.Scanner;

/**
 *
 * @author Dha Gas Gar
 */
public class TabelPerkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n (<= 10): ");
        int n = scanner.nextInt();
        
        if (n > 10) {
            System.out.println("Nilai n tidak boleh lebih dari 10.");
            return;
        }

        System.out.println("\nTabel Perkalian " + n + " x " + n + ":");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
