/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum18052026;

import java.util.Scanner;



/**
 *
 * @author Muhammad Zikri
 */
public class MainPembayaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner (System.in);
        pembayaran pembayaran = null;
        
        System.out.println("--- Sistem Pembayaran Toko Online ---");
        System.out.println("Masukkan ID transaksi =");
        String id = scanner.nextLine();
        
        System.out.print("Masukkan jumlah bayar:");
        double jumlah = scanner.nextDouble();
        
        System.out.println("Pilih metode pembayaran :");
        System.out.println("1. Transfer Bank");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.print("Pilihan metode pembayaran anda (1/2/3) :" );
        int pilihan=scanner.nextInt();
        scanner.nextLine();
        
        switch(pilihan){
            case 1 :System.out.println("Metode Tranfer Bank");
                    System.out.print("Masukkan nama bank tujuan :");
                    String bank=scanner.nextLine();
                    pembayaran = new PembayaranTransfer(bank,jumlah,id);
                    break;
            case 2 :System.out.println("Metode Tranfer No Kartu :");
                    System.out.print("Masukkan No Kartu tujuan");
                    String noKartu=scanner.nextLine();
                    pembayaran = new PembayaranTransfer(noKartu,jumlah,id);
                    break;
            case 3 :System.out.println("Metode Tranfer E-Wallet :");
                    System.out.print("Masukkan E-Wallet tujuan");
                    String EWallet=scanner.nextLine();
                    pembayaran = new PembayaranTransfer(EWallet,jumlah,id);
                    break;
        }
        
        System.out.println("\n==Konfirmasi Bukti Pembayaran ==");
        pembayaran.prosesPembayaran();
    
}
}
