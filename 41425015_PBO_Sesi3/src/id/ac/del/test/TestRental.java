/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.test;

/**
 *
 * @author ASUS
 */

import id.ac.del.rental.VehicleRental; 
import id.ac.del.rental.MemberDiscount;

public class TestRental { 
    public static void main(String[] args) { 
        VehicleRental v = new VehicleRental("BK 1234 DEL", 250000); 

        /* Catatan Analisis Akses:
         * - Baris A (v.plateNumber) bisa diakses karena public.
         * - Baris B (v.rentalRatePerDay) error karena protected di luar package tanpa inheritance.
         * - Baris C (v.discountRate) error karena default access di luar package.
         */

        // Menggunakan metode setter yang aman dan terenkapsulasi
        v.setPlateNumber("BK 1234 DEL"); 
        v.setDiscountRate(0.20); 
        v.setRentalDays(5); // Memperbaiki nilai negatif dari kasus awal (-7)

        // Menerapkan objek diskon menggunakan interface (Polimorfisme)
        MemberDiscount memberDisc = new MemberDiscount();

        System.out.println("Nomor Plat : " + v.getPlateNumber());
        System.out.println("Total Biaya (Dengan MemberDiscount): Rp" + v.getTotalCost(memberDisc)); 
    } 
}


/* 
1. Analisis Kompilasi dan Hak Akses (Access Modifiers)
Baris yang Error: Baris B dan Baris C.

Aturan Akses:
public: Atribut atau metode dapat diakses dari kelas mana saja, termasuk dari package yang berbeda. Pada Baris A (v.plateNumber), variabel dideklarasikan sebagai public sehingga berhasil diakses dari package id.ac.del.test.
protected: Hanya dapat diakses oleh kelas di dalam package yang sama atau oleh kelas anak (subclass) yang melakukan pewarisan (inheritance) di luar package. Karena TestRental berada di package yang berbeda dan bukan merupakan subclass dari VehicleRental, maka Baris B mengalami compile-time error.
default (tanpa kata kunci / package-private): Hanya dapat diakses oleh kelas-kelas yang berada di dalam package yang sama (id.ac.del.rental). Karena diakses dari package id.ac.del.test, maka Baris C mengalami compile-time error.
private: Hanya dapat diakses di dalam kelas VehicleRental itu sendiri dan tidak bisa diakses dari luar kelas sama sekali.

2. i) Cacat Logika setRentalDays: Meskipun menggunakan setter, method tersebut tidak memiliki validasi pengecekan angka, sehingga input negatif (-7) tetap bisa dimasukkan dan merusak data.
ii) Penyebab & Solusi Biaya Negatif:
    Penyebab: Tidak adanya enkapsulasi yang ketat serta tidak ada validasi untuk mencegah nilai hari/tarif bernilai minus.
    Solusi Refaktor: Ubah atribut menjadi private, tambahkan validasi if (days >= 0) pada setter, dan gunakan Math.max(0, finalCost) pada perhitungan total biaya untuk mencegah hasil negatif.


*/