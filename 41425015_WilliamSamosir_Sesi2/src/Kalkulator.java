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
import java.util.Scanner;

public class Kalkulator {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
        
        System.out.println("Tambah : " + (a + b));
        System.out.println("Kurang : " + (a - b));
        System.out.println("Kali :" + (a * b));
        System.out.println("Bagi : " + ((double) a / b));
    }
}

/* 

Praktek 2: Mengapa pembagian int perlu di-casting ke double?
Jawab : hasil casting nilai double masih desimal . sedangkan casting ke int angka di belakang 
koma akan di hilangkan 


Praktek 2: Apa risiko jika pembagi = 0? 
hasil akan tidak terterhingga atau infinity


*/