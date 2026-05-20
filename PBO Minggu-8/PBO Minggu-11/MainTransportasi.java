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
public class MainTransportasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        Scanner scanner = new Scanner (System.in);
        transportasi kendaraan = null;
        
        System.out.println("---Sistem Transportasi---");
        System.out.print("Masukkan Nama Penumpang :");
        String nama= scanner.nextLine();
        
        System.out.print("Masukkan Alamat Tujuan :");
        String tujuan= scanner.nextLine();
        
        System.out.print("Masukkan Biaya Perjalanan :");
        int biaya = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Pilih Kendaraan :");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Bis");
        System.out.println("4. Kereta");
        
        System.out.print("Jenis Kendaraan Darat Yang Anda pilih (1/2/3/4) :" );
        int pilihan=scanner.nextInt();
        scanner.nextLine();
        
        switch(pilihan) {
            case 1:
                System.out.print("Masukkan Jenis Mobil: ");
                String jenisMobil = scanner.nextLine();
                kendaraan = new mobil(jenisMobil, biaya, nama);
                break;
            case 2:
                System.out.print("Masukkan Model Motor: ");
                String modelMotor = scanner.nextLine();
                kendaraan = new motor(modelMotor, biaya, nama);
                break;
            case 3:
                System.out.print("Masukkan Merek Bus: ");
                String merkBis = scanner.nextLine();
                kendaraan = new bis(merkBis, biaya, nama);
                break;
            case 4:
                System.out.print("Masukkan Pilihan Kelas Kereta: ");
                String kelas = scanner.nextLine();
                kendaraan = new kereta(kelas, biaya, nama);
                        
                break;
            
        }
        
        System.out.println("\n==Konfirmasi Bukti Pembayaran ==");
        kendaraan.biayaPerjalanan();
        
    }
    
}
