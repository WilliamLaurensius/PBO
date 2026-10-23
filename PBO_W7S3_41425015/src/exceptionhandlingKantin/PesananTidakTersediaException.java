/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandlingKantin;

/**
 *
 * @author ASUS
 */
public class PesananTidakTersediaException extends Exception { // exception buatan sendiri untuk menangani stok makanan yang tidak cukup
    public PesananTidakTersediaException(String pesan){
        super(pesan);
    }
}
