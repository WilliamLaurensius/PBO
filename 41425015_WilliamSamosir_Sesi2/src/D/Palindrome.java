/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Palindrome {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        // Mengecek palindrome
        String balik = "";

        for (int i = kata.length() - 1; i >= 0; i--) {
            balik = balik + kata.charAt(i);
        }

        if (kata.equalsIgnoreCase(balik)) {
            System.out.println("Kata adalah palindrome.");
        } else {
            System.out.println("Kata bukan palindrome.");
        }

        // Menghitung jumlah huruf vokal
        int jumlahVokal = 0;

        for (int i = 0; i < kata.length(); i++) {
            char huruf = Character.toLowerCase(kata.charAt(i));

            if (huruf == 'a' || huruf == 'i' || huruf == 'u'
                    || huruf == 'e' || huruf == 'o') {
                jumlahVokal++;
            }
        }

        System.out.println("Jumlah huruf vokal: " + jumlahVokal);
    }
}
