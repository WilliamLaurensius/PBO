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
public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();

        System.out.print("Masukkan harga barang: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan jumlah beli: ");
        int jumlah = input.nextInt();

        double sebelumDiskon = harga * jumlah;
        double diskon = 0;

        if (sebelumDiskon >= 100000) {
            diskon = sebelumDiskon * 0.10;
        }

        double totalBayar = sebelumDiskon - diskon;

        System.out.println("Sebelum diskon: " + sebelumDiskon);
        System.out.println("Total Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);
    }
}

