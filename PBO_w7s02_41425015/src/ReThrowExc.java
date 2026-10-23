/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class ReThrowExc {
    static void demoThrow() {
        try {
            System.out.println("I'm throwing an exception from demoThrow "
                + "method");
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("I'm catching the exception [" + e + "]");
            System.out.println("But I'll throw it again...\n");
            throw e;
        }
    }

    public static void main(String args[]) {
        try {
            demoThrow();
        } catch (NullPointerException e) {
            System.out.println("I'm catching the exception [" + e + "]\n "
                + "thrown from demoThrow method");
        }
    }
}

/* 
a. Jika exception e tidak dilempar (rethrown) dari method demoThrow, apakah masih 
akan di tangkap dari dalam main function? 
jawab : 
jika exception tidak dilempar kembali, error dianggap selesai di method demoThrow, sehingga method main tidak akan menangkap apa pun

b. Apa yang bisa Anda simpulkan dari kode program di atas? 
Re-throwing memungkinkan penanganan error secara bertingkat, yaitu memproses error di dalam suatu method lalu meneruskannya ke method pemanggil.

*/