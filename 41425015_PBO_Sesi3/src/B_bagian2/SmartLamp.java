/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_bagian2;

/**
 *
 * @author ASUS
 */
class SmartLamp implements Switchable, Connectable {
    private boolean isOn = false; 
    private int brightness;

    public SmartLamp(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("[Lampu Pintar] Dinyalakan dengan kecerahan " + brightness + "%");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("[Lampu Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (!isOn) {
            System.out.println("[Error] Lampu Pintar tidak dapat terhubung ke WiFi karena perangkat sedang mati!");
            return;
        }
        System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
    }
}
