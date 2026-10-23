/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandlingKantin;

/**
 *
 * @author ASUS
 */
public class PesananKantin {

    // Menyimpan stok makanan yang tersedia di kantin.
    int stokMakanan = 5;

    // Method untuk memesan makanan.
    // throws menyatakan bahwa method dapat menghasilkan exception khusus.
    public void pesanMakanan(int jumlah)
            throws PesananTidakTersediaException {

        try {
            // Memastikan jumlah pesanan lebih dari nol.
            if (jumlah <= 0) {
                throw new IllegalArgumentException(
                    "Jumlah pesanan harus lebih dari 0."
                );
            }

            // Memeriksa apakah stok makanan mencukupi.
            if (jumlah > stokMakanan) {
                throw new PesananTidakTersediaException(
                    "Stok makanan tidak mencukupi."
                );
            }

            // Mengurangi stok setelah pesanan berhasil.
            stokMakanan = stokMakanan - jumlah;

            // Menampilkan informasi pesanan.
            System.out.println("Pesanan berhasil!");
            System.out.println("Jumlah pesanan: " + jumlah);
            System.out.println("Sisa stok: " + stokMakanan);

        } catch (IllegalArgumentException e) {
            // Menangani jumlah pesanan yang tidak valid.
            System.out.println("Pesanan gagal: " + e.getMessage());

        } finally {
            // Bagian ini tetap dijalankan setelah proses pemesanan.
            System.out.println("Proses pesanan selesai.\n");
        }
    }

    // Method untuk menampilkan stok makanan.
    public void tampilkanStok() {
        System.out.println("Stok makanan: " + stokMakanan);
    }
}
