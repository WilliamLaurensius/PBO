/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_bagian2;

/**
 *
 * @author ASUS
 */
public class SmartHomeSystem {
   public static void main(String[] args) {
        // Membuat objek perangkat
        SmartLamp lamp = new SmartLamp(80);
        SmartAC ac = new SmartAC(22);

        // Simulasi sesuai contoh output
        lamp.turnOn();
        lamp.connectToWifi("Rumah_Indah_5G", "192.168.1.50");

        ac.turnOn();
        ac.connectToWifi("Rumah_Indah_5G", "192.168.1.51");

        ac.turnOff();
    } 
}
