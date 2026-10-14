
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class OperatingString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap : ");
        String nama = input.nextLine();
        
        System.out.println("Panjang string : " + nama.length());
        System.out.println("Huruf pertama : " + nama.charAt(0));
        System.out.println("Mengandung spasi? " + nama.contains(" "));
    }
}

/* 
 Bagaimana jika nama yang diinput dengan lebih dari satu spasi? 
JAWAB : Spasi tetap ikut di hitung dan masuk di jumlah panjang string 
*/