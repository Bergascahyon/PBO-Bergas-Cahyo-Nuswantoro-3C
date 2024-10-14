/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_praktikum9;

/**
 *
 * @author A S U S
 */
public class NilaiMHS {
    double nk,nt,nh, nuas, nuts,rata;
    double nilaiRata(){
    rata = (0.1 * nk) + (0.15 * nt) + (0.25 * nuts) + (0.15 * nuas);
    return rata;
}
}