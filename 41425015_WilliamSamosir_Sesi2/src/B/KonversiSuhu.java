package B;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class KonversiSuhu {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.print("Masukkan suhu dalam Celcius: ");
         double celcius = input.nextDouble();
         
         double fahrenheit =  (celcius * 9 / 5) + 32;

        System.out.println(celcius + " C = " + fahrenheit + " F");
        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        double fahrenheitInput = input.nextDouble();
        double celsiusHasil = (fahrenheitInput - 32) * 5 / 9;

        System.out.printf("%.1f F = %.2f C%n", fahrenheitInput, celsiusHasil);
    }
}
         
