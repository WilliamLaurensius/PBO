/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandlingKantin;

/**
 *
 * @author ASUS
 */

public class Main {

    public static void main(String[] args) {  // method utama untuk menjalankan program.

        PesananKantin pesanan = new PesananKantin(); // membuat objek pesanan kantin.

        pesanan.tampilkanStok(); // menampilkan stok makanan sebelum pemesanan

        try { // mencoba memesan makanan
            pesanan.pesanMakanan(2);  // pesanan pertama berhasil karna stok mencukup 
         
            pesanan.pesanMakanan(6); // pesanan kedua gagal karna stok tersisa hanya 3.

        } catch (PesananTidakTersediaException e) { // menangani exception ketika stok tidak mencukupi
            System.out.println("Pesanan gagal: " + e.getMessage());

        } finally {
            System.out.println("Pemeriksaan pesanan selesai.");  // dijalankan setelah blok try-catch selesai (kalau dia 2, dan langsung berhasil, maka langsung ke finally)
        }
        
        pesanan.tampilkanStok(); // menampilkan stok makanan setelah pemesanan

        try {  // menguji pemesanan dengna jumlah yang tidak valid
            pesanan.pesanMakanan(0);

        } catch (PesananTidakTersediaException e) {
            System.out.println("Pesanan gagal: " + e.getMessage()); // menangani exception 
        }
    }
}

