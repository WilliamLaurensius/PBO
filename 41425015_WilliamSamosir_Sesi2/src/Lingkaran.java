
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

public class Lingkaran {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            final double PI = 3.14;
            
            System.out.print("Masukkan jari-jari : ");
            double r = input.nextDouble();
            
            if (r < 0){
            System.out.println("Error : jari-jari tidak boleh negatif.");
        } else {
            double luas = PI * r * r;
            double keliling = 2 * PI * r;
            System.out.println("Luas : " + luas);
            System.out.println("Keliling: " + keliling);
        }
        }
    }

/*
Mengapa kita perlu validasi r < 0? 
jawab : karena jari jari tidak ada dibawah 0

Dalam aplikasi nyata, dimana validasi input sangat penting? 
jawab : register akun atau buat password
*/

