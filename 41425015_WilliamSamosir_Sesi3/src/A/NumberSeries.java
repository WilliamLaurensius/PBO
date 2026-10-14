
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

public class NumberSeries {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah deret Fibonacci: ");
        int n = scanner.nextInt();
        
        // generate fibonacci serius
        System.out.println("Deret Fibonacci: ");
        int a = 0, b = 1;
        for(int i = 0; i < n; i++){
        System.out.print(a + " ");
        int next = a + b;
        a = b;
        b = next;
    } 
        System.out.println();
        
        // check prime number
        System.out.print("Masukkan bilangan untuk di cek prima: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        
        if(num <= 1){
            isPrime = false;
        } else {
            for(int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(num + (isPrime ? " adalah bilangan prima" : " bukan bilangan prima"));
    }
}

 /* 

Bagaimana cara mengoptimalkan algoritma Fibonacci untuk jumlah yang besar? 
JAWAB : 
*/
