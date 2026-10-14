
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

public class DaftarBelanja {
      public static void main(String[] args) {

        // Membuat Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Membuat array untuk menyimpan daftar item belanja
        String[] daftarBelanja = new String[100];

        // Menyimpan jumlah item yang sudah dimasukkan
        int jumlahItem = 0;

        // Menyimpan pilihan menu dari pengguna
        int pilihan;

        // Perulangan program akan terus berjalan sampai pengguna memilih menu 5
        do {

            // Menampilkan menu utama
            System.out.println("\n=== Daftar Belanja ===");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");

            // Meminta pengguna memilih menu
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            // Membersihkan enter setelah input angka
            input.nextLine();

            // Memproses pilihan menu menggunakan switch
            switch (pilihan) {

                case 1:
                    // Memeriksa apakah array masih memiliki tempat
                    if (jumlahItem < daftarBelanja.length) {

                        // Meminta pengguna memasukkan item baru
                        System.out.print("Masukkan item: ");
                        String item = input.nextLine();

                        // Menyimpan item ke dalam array
                        daftarBelanja[jumlahItem] = item;

                        // Menambah jumlah item
                        jumlahItem++;

                        // Menampilkan pesan bahwa item berhasil ditambahkan
                        System.out.println(item + " berhasil ditambahkan!");

                    } else {
                        // Pesan jika array sudah penuh
                        System.out.println("Daftar belanja sudah penuh!");
                    }
                    break;

                case 2:
                    // Memeriksa apakah daftar belanja memiliki item
                    if (jumlahItem == 0) {
                        System.out.println("Daftar belanja masih kosong.");
                        break;
                    }

                    // Meminta posisi item yang ingin dihapus
                    System.out.print("Hapus item pada posisi: ");
                    int posisiHapus = input.nextInt();

                    // Memeriksa apakah posisi yang dimasukkan valid
                    if (posisiHapus < 1 || posisiHapus > jumlahItem) {
                        System.out.println("Posisi tidak valid!");
                        break;
                    }

                    // Menyimpan nama item yang akan dihapus
                    String itemDihapus = daftarBelanja[posisiHapus - 1];

                    // Menggeser item setelah posisi yang dihapus ke kiri
                    for (int i = posisiHapus - 1; i < jumlahItem - 1; i++) {
                        daftarBelanja[i] = daftarBelanja[i + 1];
                    }

                    // Mengosongkan posisi terakhir
                    daftarBelanja[jumlahItem - 1] = null;

                    // Mengurangi jumlah item
                    jumlahItem--;

                    // Menampilkan pesan bahwa item berhasil dihapus
                    System.out.println(itemDihapus + " berhasil dihapus!");
                    break;

                case 3:
                    // Memeriksa apakah daftar belanja kosong
                    if (jumlahItem == 0) {
                        System.out.println("Daftar belanja masih kosong.");
                    } else {

                        // Menampilkan seluruh item dalam array menggunakan loop
                        System.out.println("Daftar belanja:");

                        for (int i = 0; i < jumlahItem; i++) {
                            System.out.println((i + 1) + ". " + daftarBelanja[i]);
                        }
                    }
                    break;

                case 4:
                    // Memeriksa apakah daftar belanja kosong
                    if (jumlahItem == 0) {
                        System.out.println("Daftar belanja masih kosong.");
                        break;
                    }

                    // Meminta item yang ingin dicari
                    System.out.print("Cari item: ");
                    String itemCari = input.nextLine();

                    // Menyimpan status apakah item ditemukan
                    boolean ditemukan = false;

                    // Mencari item menggunakan loop
                    for (int i = 0; i < jumlahItem; i++) {

                        // Membandingkan item dalam array dengan item yang dicari
                        if (daftarBelanja[i].equalsIgnoreCase(itemCari)) {

                            // Menampilkan posisi item jika ditemukan
                            System.out.println(
                                    itemCari + " ditemukan pada posisi " + (i + 1)
                            );

                            // Mengubah status menjadi ditemukan
                            ditemukan = true;
                            break;
                        }
                    }

                    // Menampilkan pesan jika item tidak ditemukan
                    if (!ditemukan) {
                        System.out.println(itemCari + " tidak ditemukan.");
                    }
                    break;

                case 5:
                    // Menampilkan pesan ketika pengguna keluar dari program
                    System.out.println("Terima kasih!");
                    break;

                default:
                    // Menampilkan pesan jika pilihan menu tidak tersedia
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);
        input.close();
    }
}
