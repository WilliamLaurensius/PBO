/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B;

/**
 *
 * @author ASUS
 */
public class StudentGrade {
    // Atribut privat (Enkapsulasi)
    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private String gradeHuruf; // Tantangan tambahan

    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: " + nim + " - " + nama);
    }

    // Getter untuk NIM (Read-only)
    public String getNim() {
        return nim;
    }

    // Getter untuk Nama (Read-only)
    public String getNama() {
        return nama;
    }

    // Getter untuk Nilai Kuis
    public double getNilaiKuis() {
        return nilaiKuis;
    }

    // Setter untuk Nilai Kuis dan validasi 0.0 - 100.0
    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis >= 0.0 && nilaiKuis <= 100.0) {
            this.nilaiKuis = nilaiKuis;
            System.out.println("[Update] Nilai kuis berhasil diubah menjadi: " + nilaiKuis);
            hitungGradeHuruf(); // Kalkulasi otomatis grade huruf
        } else {
            System.out.println("[Error] Nilai kuis tidak valid: " + nilaiKuis + " (Harus antara 0 - 100)");
        }
    }

    // Getter untuk Nilai UTS
    public double getNilaiUTS() {
        return nilaiUTS;
    }

    // Setter untuk Nilai UTS dan validasi 0.0 - 100.0
    public void setNilaiUTS(double nilaiUTS) {
        if (nilaiUTS >= 0.0 && nilaiUTS <= 100.0) {
            this.nilaiUTS = nilaiUTS;
            System.out.println("[Update] Nilai UTS berhasil diubah menjadi: " + nilaiUTS);
            hitungGradeHuruf(); // Kalkulasi otomatis grade huruf
        } else {
            System.out.println("[Error] Nilai UTS tidak valid: " + nilaiUTS + " (Harus antara 0 - 100)");
        }
    }

    // Getter untuk gradeHuruf
    public String getGradeHuruf() {
        return gradeHuruf;
    }

    // Method untuk mengalkulasi gradeHuruf otomatis
    private void hitungGradeHuruf() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 85) {
            this.gradeHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            this.gradeHuruf = "B";
        } else if (nilaiAkhir >= 55) {
            this.gradeHuruf = "C";
        } else if (nilaiAkhir >= 40) {
            this.gradeHuruf = "D";
        } else {
            this.gradeHuruf = "E";
        }
    }

    // Method untuk menghitung nilai akhir
    public double hitungNilaiAkhir() {
        return (0.4 * nilaiKuis) + (0.6 * nilaiUTS);
    }

    // Method untuk mencetak laporan hasil studi 
    public void cetakKHS() {
        System.out.println("=== KARTU HASIL STUDI ===");
        System.out.println("NIM      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("Nilai Kuis : " + nilaiKuis);
        System.out.println("Nilai UTS  : " + nilaiUTS);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
    }
}

