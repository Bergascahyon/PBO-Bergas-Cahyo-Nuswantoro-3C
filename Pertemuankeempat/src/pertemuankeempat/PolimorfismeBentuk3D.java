/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuankeempat;

/**
 *
 * @author Dha Gas Gar
 */
public class PolimorfismeBentuk3D {
    public static void main(String[] args) {
        // Membuat objek balok
        Bentuk3D balok = new Balok(5, 3, 2);
        balok.cetakInfo();
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());

        // Membuat objek kubus
        Bentuk3D kubus = new Kubus(4);
        kubus.cetakInfo();
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}
