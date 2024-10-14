/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_praktikum8;

/**
 *
 * @author A S U S
 */
public class NilaiMHS {
    double tugas, uas, uts,rata; char grade;
    double nilaiRata(){
    rata = (tugas+uts+uas)/3;
    return rata;
}
}