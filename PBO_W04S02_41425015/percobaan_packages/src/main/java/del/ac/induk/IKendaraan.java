/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package del.ac.induk;

/**
 *
 * @author ASUS
 */
public interface IKendaraan {
        void setJlhRoda(int value);
        void setDimensiKendaraan(int value);
        void setJlhSpion(int value);
        void setWarnaKendaraan (String Value);
        void cetakInformasi(Object o);
        int getJlhRoda();
        int getDimensiKendaraan();
        int getJlhSpion();
        float kalkulasiPercepatan(int jlhTrosi, float panjangGagang, float rasioGigi);
        String getWarnaKendaraan();
    }

