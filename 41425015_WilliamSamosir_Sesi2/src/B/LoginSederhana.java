package B;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class LoginSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = input.nextLine();

        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        boolean usernameValid = username.equals("admin");
        boolean passwordPanjang = password.length() >= 6;
        boolean passwordAdaAngka = password.matches(".*\\d.*");

        if (!usernameValid) {
            System.out.println("Login gagal! Username tidak valid.");
        } else if (!passwordPanjang || !passwordAdaAngka) {
            System.out.println("Login gagal! Password tidak valid.");
        } else {
            System.out.println("Login berhasil!");
        }
    }
}

