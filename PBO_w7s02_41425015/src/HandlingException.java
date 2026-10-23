/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class HandlingException {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
        } catch (Exception ex) {
            System.out.println("getMessage(): " + ex.getMessage());
        }
    }
}

/*  a. Ganti ex dengan ex.getMessage() dan ex.getStackTrace(). Coba juga untuk 
    mengeksekusi statement ex.printStackTrace() dan lihat apa hasilnya. 
jawab : 
- Menggunakan `ex.getMessage(): Hanya menampilkan pesan spesifik dari errornya saja, yaitu `/ by zero`.
- menggunakan ex.getStackTrace = enampilkan representasi objek *array stack trace* dalam bentuk kode memori (misalnya berupa hash/alamat memori seperti `[Ljava.lang.StackTraceElement;@...`), 
karena method ini menghasilkan array elemen, bukan teks string biasa.
- mengekskusi ex.printStackTrace = Mencetak informasi lengkap tentang jejak error secara detail ke konsol (nama *exception*, pesan error `/ by zero`, beserta baris kode berapa saja yang memicu error tersebut).


b. Ganti AtirhmeticException dengan Exception. Apa hasilnya? Jelaskan. 
jawab: hasilnya : getMessage(): / by zero
       tetap berjalan dengan normal dan sukses dikompilasi tanpa error

*/