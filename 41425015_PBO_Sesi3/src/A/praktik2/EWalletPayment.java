package A.praktik2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class EWalletPayment implements PaymentMethod {
    private String phoneNumber; // data privat (encapsulation)

    public EWalletPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        // E-Wallet dikenakan biaya admin
        double total = amount + TRANSACTION_FEE;
        System.out.println("[E-Wallet " + phoneNumber + "] Pembayaran diproses: Rp" + amount
                + " (Biaya admin: Rp" + TRANSACTION_FEE + ") | Total: Rp" + total);
    }

    @Override
    public String getPaymentDetails() {
        return "Metode: E-Wallet (" + phoneNumber + ")";
    }
}