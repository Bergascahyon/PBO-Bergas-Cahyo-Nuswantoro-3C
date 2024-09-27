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
public class PengukuranBadan {
    String BMI(double imt){
        String krit;
        if(imt < 18.4){
            krit = "Berat Badan Kurang";
        }else if(imt <= 24.9){
            krit = "Berat Badan Ideal";
        }else if(imt <= 29.9){
            krit = "Berat Badan Lebih";
        }else if(imt <= 39.9){
            krit = "Gemuk";
        }else{
            krit = "Sangat Gemuk" ;
        }
        return krit;
} 
}
