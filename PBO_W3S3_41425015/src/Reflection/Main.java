/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reflection;

/**
 *
 * @author ASUS
 */
// Definisi kelas Student sesuai asumsi
class Student {
    public Student(){}
}

public class Main {
    public static void main(String[] args) {
        try {
            // Memuat kelas Student secara dinamis berdasarkan namanya
            Class<?> c = Class.forName("Student");
            // Membuat objek baru dari kelas Student menggunakan constructor default
            Student s2 = (Student) c.getDeclaredConstructor().newInstance();
            // Menampilkan informasi objek yang berhasil dibuat
            System.out.println("Object created: " + s2);
        } catch (ClassNotFoundException e) {
            // Menangani error jika kelas tidak ditemukan
            System.err.println("Class not found!");
        } catch (NoSuchMethodException e) {
            // Menangani error jika constructor default tidak ditemukan
            System.err.println("No default constructor!");
        } catch (Exception e) {
            // Menangani exception lainnya
            e.printStackTrace();
        }
    }
}