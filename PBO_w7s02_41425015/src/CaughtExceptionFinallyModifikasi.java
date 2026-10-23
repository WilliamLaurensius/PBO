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
        } catch (NullPointerException e) { // Diganti menjadi NullPointerException
            System.out.println("Catching exception: " + e);
        } finally {
            System.out.println("After trying or catching...");
        }
    }
}

// apa hasil dan jelaskan yang terjadi jika sebuah exception tidak memiliki sebuah catch yang cocok ?
// ketika terjadi error pembagian dengan nol tetapi blok catch yang dipasang tidak cocok (seperti NullPointerException), error tersebut gagal ditangkap oleh program.
//akibatnya, meskipun blok finally tetap dijalankan hingga selesai, program akan langsung terhenti secara mendadak (crash) dan menampilkan pesan ArithmeticException