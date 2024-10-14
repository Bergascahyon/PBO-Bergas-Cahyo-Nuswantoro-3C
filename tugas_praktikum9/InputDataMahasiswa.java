/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_praktikum9;
import java.util.ArrayList;
/**
 *
 * @author A S U S
 */
public class InputDataMahasiswa {
ArrayList<Mahasiswa> listmahasiswa; 
 
public InputDataMahasiswa() { 
listmahasiswa = new ArrayList (); 
}
 
  public void insertData(String NIM, String Nama, String Alamat, String Mata_Kuliah, String Nilai_Akhir) { 
     		   Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, Mata_Kuliah, Nilai_Akhir); 
     		   listmahasiswa.add(mhs); 
}

 public ArrayList<Mahasiswa> getALL() { 
         return listmahasiswa; 
    	          }
          
          public void deleteData(int index) {
  		      listmahasiswa.remove(index);
          }    
}
