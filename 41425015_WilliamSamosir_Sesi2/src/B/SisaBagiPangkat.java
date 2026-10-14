
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class SisaBagiPangkat {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan angka pertama: ");
       int a = input.nextInt();
       System.out.print("Masukkan angka kedua: ");
       int b = input.nextInt();
       
       System.out.println("Sisa bagi: " + (a % b));
       System.out.println("Pangkat : " + Math.pow(a, b));
       
    }
}
