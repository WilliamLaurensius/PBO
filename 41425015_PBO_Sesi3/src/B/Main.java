/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Mendaftarkan mahasiswa baru
        StudentGrade mhs = new StudentGrade("11425001", "Marsha");

        // Menguji input nilai kuis yang salah 
        mhs.setNilaiKuis(110.0);

        // Menguji input nilai kuis yang benar
        mhs.setNilaiKuis(85.0);

        // Menguji input nilai UTS yang benar
        mhs.setNilaiUTS(90.0);

        // Mencetak kartu hasil studi
        System.out.println();
        mhs.cetakKHS();
    }
}
