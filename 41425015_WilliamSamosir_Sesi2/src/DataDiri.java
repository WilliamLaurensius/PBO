/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

/*
NIM : 41425015
Nama : William Laurensius Samosir
Motto : if at first you don't succeed, call it version 1.0
*/
public class DataDiri {
    public static void main(String[] args){
        String nama = "Andi";
        int umur = 19;
        double tinggi = 165.8;
        boolean isMahasiswa = true;
        
        System.out.println("Nama : " + nama );
        System.out.println("Umur : " + umur + " tahun");
        System.out.println("Tinggi : " + tinggi + " cm");
        System.out.println("Status Mahasiswa : " + isMahasiswa);
        
        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");
    }
}

/*
Praktek 1: Apa perbedaan nilai asli double dengan hasil casting int? 
Jawab : 

*/