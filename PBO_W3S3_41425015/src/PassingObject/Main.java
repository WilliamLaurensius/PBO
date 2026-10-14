/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PassingObject;

/**
 *
 * @author ASUS
 */
// Mendefinisikan kelas bernama ObjectPassDemo untuk mendemonstrasikan pengiriman objek sebagai parameter
class ObjectPassDemo {
    // Deklarasi dua variabel integer instance 'a' dan 'b'
    int a, b;

    // Konstruktor berparameter untuk menginisialisasi nilai 'a' dan 'b' saat objek dibuat
    ObjectPassDemo(int i, int j)
    {
        a = i;
        b = j;
    }

    // Method untuk membandingkan nilai atribut objek saat ini dengan objek lain yang dilewatkan sebagai parameter
    boolean equalTo(ObjectPassDemo o)
    {
        // Mengembalikan nilai true jika nilai 'a' dan 'b' dari kedua objek sama persis
        return (o.a == a && o.b == b);
    }
}

// Kelas utama yang berisi fungsi 'main' untuk menjalankan program
public class Main {

    // Titik awal eksekusi program Java
    public static void main(String args[]) {
        // Membuat objek pertama 'ob1' dengan nilai atribut a=100 dan b=22
        ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);
        // Membuat objek kedua 'ob2' dengan nilai atribut a=100 dan b=22
        ObjectPassDemo ob2 = new ObjectPassDemo(100, 22);
        // Membuat objek ketiga 'ob3' dengan nilai atribut a=-1 dan b=-1
        ObjectPassDemo ob3 = new ObjectPassDemo(-1, -1);

        // Membandingkan objek 'ob1' dengan 'ob2' menggunakan method 'equalTo' dan mencetak hasilnya
        System.out.println("ob1 == ob2: "
                + ob1.equalTo(ob2));
        // Membandingkan objek 'ob1' dengan 'ob3' menggunakan method 'equalTo' dan mencetak hasilnya
        System.out.println("ob1 == ob3: "
                + ob1.equalTo(ob3));
    }
}