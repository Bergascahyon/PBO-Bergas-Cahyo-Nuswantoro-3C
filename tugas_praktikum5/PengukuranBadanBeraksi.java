/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_praktikum5;

/**
 *
 * @author A S U S
 */
import java.util.Scanner;
public class PengukuranBadanBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        PengukuranBadan pb = new PengukuranBadan();
        
        System.out.println("Berat Badan: ");
        double bb = inp.nextDouble();
        System.out.println("Tinggi Badan: ");
        double tb = inp.nextDouble();
        double imt = (bb/(tb*tb));
        System.out.println("IMT Anda : " + imt);
        System.out.println("Dengan Kriteria : " + pb.BMI(imt));
    } 
}
