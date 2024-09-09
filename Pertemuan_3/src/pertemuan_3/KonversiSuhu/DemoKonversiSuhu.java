/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_3.KonversiSuhu;

/**
 *
 * @author MyPC PRO
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu suhu1 = new KonversiSuhu();
        KonversiSuhu2 suhu2 = new KonversiSuhu2();

        double celcius = 100;
        double fahrenheit = 212;

        System.out.println("Celcius to Fahrenheit: " + suhu1.celciusToFahrenheit(celcius));
        System.out.println("Celcius to Reamur: " + suhu1.celciusToReamur(celcius));
        System.out.println("Fahrenheit to Reamur: " + suhu2.fahrenheitToReamur(fahrenheit));
    }
}
