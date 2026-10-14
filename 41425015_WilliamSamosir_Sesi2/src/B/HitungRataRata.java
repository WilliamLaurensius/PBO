
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class HitungRataRata {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai 1 : " );
        int a = input.nextInt();
        System.out.println("Masukkan nilai 2 :");
        int b = input.nextInt();
        System.out.print("Masukkan nilai 3 : ");
        int c = input.nextInt();
        
        System.out.println("Rata rata :" + ((double) (a + b + c) / 3));
    }
}
