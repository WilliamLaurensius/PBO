/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ASUS
 */
class UncaughtException {
   public static void main ( String args[]){
       System.out.println(3/0);
   }    
}

// a. analisis apa yang akan terjadi ketika program diatas di eksekusi
// jawab : 
// Karena operasi matematika tersebut tidak terdefinisi dan di dalam kode tidak terdapat blok penanganan error seperti try-catch, dan langsung melempar runtime exception berjenis ArithmeticException yang membuat program terhenti secara mendadak /crash


// b. apa outputnya?
// jawab :
/*Exception in thread "main" java.lang.ArithmeticException: / by zero
at ExceptionHandling.UncaughtException.main(UncaughtException.java:13)
C:\Users\ASUS\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\ASUS\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)*/