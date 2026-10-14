/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

import id.ac.del.rental.Discountable;

/**
 *
 * @author ASUS
 */
public class VehicleRental { 
    private String plateNumber; 
    private double rentalRatePerDay; 
    private int rentalDays; 
    private double discountRate;  

    public VehicleRental(String plateNumber, double rate) { 
        this.plateNumber = plateNumber; 
        if (rate > 0) {
            this.rentalRatePerDay = rate; 
        }
    } 

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setRentalRatePerDay(double rentalRatePerDay) {
        if (rentalRatePerDay > 0) {
            this.rentalRatePerDay = rentalRatePerDay;
        }
    }

    // Validasi agar jumlah hari tidak negatif (menjawab poin 2.i & 2.ii)
    public void setRentalDays(int days) { 
        if (days >= 0) {
            this.rentalDays = days; 
        } else {
            System.out.println("[Error] Jumlah hari sewa tidak boleh bernilai negatif!");
        }
    } 

    public void setDiscountRate(double discountRate) {
        if (discountRate >= 0.0 && discountRate <= 1.0) {
            this.discountRate = discountRate;
        }
    }

    // Metode total cost dengan interface Discountable (Dependency Injection - poin 3.ii)
    public double getTotalCost(Discountable discountStrategy) { 
        double baseCost = rentalRatePerDay * rentalDays;
        double discountAmount = 0.0;

        if (discountStrategy != null) {
            discountAmount = discountStrategy.calculateDiscount(baseCost);
        }

        double finalCost = baseCost - discountAmount;
        return Math.max(0, finalCost); // Mencegah hasil akhir bernilai negatif
    } 
}