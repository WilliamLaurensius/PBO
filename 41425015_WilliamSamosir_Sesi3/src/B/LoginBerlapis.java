
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

public class LoginBerlapis {
   public static void main(String[] args) {

        // Membuat Scanner untuk menerima input username dan password
        Scanner input = new Scanner(System.in);

        // Username dan password yang benar untuk login
        String usernameBenar = "admin";
        String passwordBenar = "password123";

        int percobaan = 0;

        boolean loginBerhasil = false;

        // Perulangan login maksimal sebanyak 3 kali
        while (percobaan < 3 && !loginBerhasil) {

            // Menambah jumlah percobaan setiap kali pengguna melakukan login
            percobaan++;

            // Menampilkan judul dan nomor percobaan
            System.out.println("=== Sistem Login ===");
            System.out.println("Percobaan " + percobaan + ":");

            // Meminta pengguna memasukkan username
            System.out.print("Username: ");
            String username = input.nextLine();

            // Meminta pengguna memasukkan password
            System.out.print("Password: ");
            String password = input.nextLine();

            // Mengecek apakah username memiliki panjang 5 sampai 10 karakter
            boolean usernameValid = username.length() >= 5
                    && username.length() <= 10;

            // Mengecek apakah password memiliki minimal 8 karakter
            boolean passwordPanjang = password.length() >= 8;

            // Mengecek apakah password mengandung angka
            boolean passwordAdaAngka = password.matches(".*\\d.*");

            // Mengecek validitas username terlebih dahulu
            if (!usernameValid) {
                System.out.println(
                        "Login gagal! Username harus antara 5-10 karakter."
                );

            // Mengecek panjang dan kandungan angka pada password
            } else if (!passwordPanjang || !passwordAdaAngka) {
                System.out.println(
                        "Login gagal! Password harus minimal 8 karakter dan mengandung angka."
                );

            // Mengecek apakah username dan password sesuai dengan data yang benar
            } else if (username.equals(usernameBenar)
                    && password.equals(passwordBenar)) {

                // Jika semua data benar, login berhasil
                System.out.println("Login berhasil!");
                loginBerhasil = true;

            // Jika username atau password tidak sesuai
            } else {
                System.out.println("Login gagal! Password salah.");
            }

            // Jika sudah 3 kali mencoba dan belum berhasil, akun dikunci
            if (percobaan == 3 && !loginBerhasil) {
                System.out.println("Akun terkunci! Terlalu banyak percobaan gagal.");
            }
        }
    }
}