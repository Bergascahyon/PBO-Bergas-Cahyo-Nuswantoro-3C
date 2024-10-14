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
public class Mahasiswa {
private String NIM, Nama, Alamat, Mata_Kuliah, Nilai_Akhir;

public Mahasiswa(String NIM, String Nama, String Alamat, String Mata_Kuliah, String Nilai_Akhir) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Mata_Kuliah = Mata_Kuliah;
        this.Nilai_Akhir = Nilai_Akhir;
}

public String getAlamat() {
        return Alamat;
}

public String getNIM() {
        return NIM;
}

public String getNama() {
        return Nama;
 
}
public String getMata_Kuliah() {
        return Mata_Kuliah;
 
}
public String getNilai_Akhir() {
        return Nilai_Akhir;
 
}
}