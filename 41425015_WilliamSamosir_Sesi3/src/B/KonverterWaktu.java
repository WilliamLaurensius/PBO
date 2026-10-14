
import java.util.Scanner;

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



public class KonverterWaktu {

    public static void main(String[] args) {

        // Membuat Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Menampilkan menu konverter waktu
        System.out.println("=== Konverter Waktu ===");
        System.out.println("1. Detik ke HH:MM:SS");
        System.out.println("2. HH:MM:SS ke detik");

        // Meminta pengguna memilih pilihan pertama
        System.out.print("Pilihan: ");
        int pilihan1 = input.nextInt();

        // Memproses pilihan pertama
        if (pilihan1 == 1) {

            // Meminta jumlah detik dari pengguna
            System.out.print("Masukkan jumlah detik: ");
            int totalDetik = input.nextInt();

            // Menghitung jumlah jam
            int jam = totalDetik / 3600;

            // Menghitung sisa detik setelah mendapatkan jam
            int sisaDetik = totalDetik % 3600;

            // Menghitung jumlah menit
            int menit = sisaDetik / 60;

            // Menghitung sisa detik
            int detik = sisaDetik % 60;

            // Menampilkan hasil dalam format HH:MM:SS
            System.out.printf(
                    "Hasil: %02d:%02d:%02d%n",
                    jam, menit, detik
            );
        }

        // Meminta pengguna memilih pilihan kedua
        System.out.print("Pilihan: ");
        int pilihan2 = input.nextInt();

        // Memproses pilihan kedua
        if (pilihan2 == 2) {

            // Membersihkan enter setelah input angka
            input.nextLine();

            // Meminta pengguna memasukkan waktu
            System.out.print("Masukkan waktu (HH:MM:SS): ");
            String waktu = input.nextLine();

            // Memisahkan jam, menit, dan detik berdasarkan tanda :
            String[] bagianWaktu = waktu.split(":");

            // Mengubah bagian waktu menjadi integer
            int jamInput = Integer.parseInt(bagianWaktu[0]);
            int menitInput = Integer.parseInt(bagianWaktu[1]);
            int detikInput = Integer.parseInt(bagianWaktu[2]);

            // Mengubah jam menjadi detik
            int totalDetikHasil = jamInput * 3600;

            // Menambahkan menit yang sudah dikonversi menjadi detik
            totalDetikHasil = totalDetikHasil + (menitInput * 60);

            // Menambahkan detik
            totalDetikHasil = totalDetikHasil + detikInput;

            // Menampilkan hasil total detik
            System.out.println("Hasil: " + totalDetikHasil + " detik");
        }

        // Menutup Scanner setelah program selesai
        input.close();
    }
     }
