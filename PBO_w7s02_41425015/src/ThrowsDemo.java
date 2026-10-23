/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("I'm throwing a non Runtime exception that I "
                + "don't handle");
        System.out.println("Without specifying in method declaration");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}

/* 
a. Apa yang akan terjadi jika kode program di atas dieksekusi? Mengapa?
jawab : 
program gagal dikompilasi karena IllegalAccessException adalah checked exception yang wajib dideklarasikan dengan throws atau dibungkus try-catch
 
b. Apa yang akan terjadi jika IllegalAccessException diganti dengan 
ArithmeticException? Mengapa?
jawab : 
program dapat dikompilasi tanpa throws karena ArithmeticException adalah runtime exception, namun program akan crash saat dijalankan jika tidak ditangani.
*/
