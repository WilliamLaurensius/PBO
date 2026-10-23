/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class MultipleCatch {
    public static void main (String args[]){
        int n = args.length;
        int a = 1;
        int c[] = new int[1];
        try {
            if ( n == 0)
                a = a / (a - 1);
            else 
                c[21] = 5;
        } catch (ArithmeticException e) {
            System.out.println("Ups, seem out we have an Arithmetic" + "Exception here...");
        } catch (Exception e){
            System.out.println("Let the other exception handler here...");
        }
    }
}


/*
a. Coba eksekusi program tanpa arguments. Catch statement mana yang dieksekusi? 
jawab: tanpa arguments: Yang dieksekusi itu catch (ArithmeticException e) karena terjadi pembagian dengan nol (a / (a - 1) / 1 / 0). 

b. Coba eksekusi program dengan sebuah argument. Catch statement mana yang dieksekusi? 
jawab : b. dengan sebuah argument: yang dieksekusi adalah catch (Exception e) karena terjadi error di luar ArithmeticException, yaitu ArrayIndexOutOfBoundsException akibat mengakses indeks array c[21] yang melebihi kapasitas. 

c. Jika urutan catch dibalik (Exception di atas, ArithmeticException di bawah):Apa yang terjadi: 
Program gagal dikompilasi (error).   
Mengapa: Kelas Exception adalah induk dari segala jenis exception. 
Jika diletakkan di paling atas akan menangkap semua jenis error terlebih dahulu, membuat catch (ArithmeticException) di bawahnya menjadi tidak terjangkau (unreachable code), sehingga dideteksi sebagai error
*/
