/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class CaughtExceptionFinally {
    public static void main(String args[]) {
        int n = args.length;
        try {
            if (n == 0) {
                System.out.println(3/n);
                System.out.println("This won't be executed");
            } else {
                System.out.println("This will be executed if " + "arguments is not zero");
            }
        } catch (Exception e) {
            System.out.println("Catching exception: " + e);
        } finally {
            System.out.println("After trying or catching...");
        }
    }
}


/* 
a. Coba eksekusi program di atas tanpa arguments. Apa hasilnya? 
jawab : 
ketika program dijalankan tanpa arguments, jumlah argumen args.length bernilai 0. ini membuat variabel n bernilai nol sehingga program mencoba melakukan operasi terlarang yaitu pembagian 3/0. akhirnya terjadi error pembagian dengan nol yang langsung ditangkap oleh blok catch, sehingga program mencetak pesan error dan mengeksekusi blok finally


b. Coba eksekusi program di atas dengan arguments. Apa hasilnya? 
jawab:
ketika program dijalankan dengan menyertakan arguments (sehingga nilai n lebih dari nol), program akan melewati kondisi if dan langsung masuk ke jalur else. di tahap ini  program berjalan dengan normal tanpa kendala atau error, sehingga blok catch dilewati begitu saja.

c. Jelaskan kesimpulan Anda dari pertanyaan a dan b setelah menjalankan program. 
jawab: 
kesimpulannya adalah blok try dan catch bersifat opsional tergantung ada atau tidaknya error pada kode, di mana blok catch hanya aktif saat terjadi masalah. Sebaliknya, blok finally memiliki sifat wajib yang selalu dijalankan dalam situasi apa pun, baik saat program sukses berjalan normal maupun saat mengalami crash karena error.

*/