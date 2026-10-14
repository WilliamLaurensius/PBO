/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS2;

/**
 *
 * @author ASUS
 */
class Mahasiswa {
    String nama;
    String nim;
}

class MahasiswaAktif extends Mahasiswa {
    int semester;

    void belajar() {
        System.out.println(nama + " sedang belajar di semester " + semester);
    }
}

public class Main {
    public static void main(String[] args) {
        MahasiswaAktif mhs = new MahasiswaAktif();
        mhs.nama = "dina";
        mhs.nim = "123456";
        mhs.semester = 5;

        System.out.println("nama : " + mhs.nama);
        System.out.println("nim : " + mhs.nim);
        mhs.belajar();
    }
}
