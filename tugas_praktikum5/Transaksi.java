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
public class Transaksi {
    double total, diskon;
    
    Transaksi (double total){
        this.total = total;
        if(total < 50000){
            diskon = this.total * 0.05;
        }else if(total >= 50000){
            diskon = this.total *0.2;
        }

    }}
