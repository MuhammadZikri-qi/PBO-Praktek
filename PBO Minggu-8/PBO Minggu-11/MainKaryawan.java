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
public class MainKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PENGGAJIAN KARYAWAN ===");
        
        System.out.print("Masukkan nama karyawan       : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan gaji pokok bulanan  : Rp");
        double gaji = input.nextDouble();

        karyawanTetap pegawai = new karyawanTetap(gaji,nama);

        System.out.println("\n--- SLIP GAJI ---");
        System.out.println("Nama Karyawan : " + pegawai.getNama());
        System.out.println("Total Gaji    : Rp" + pegawai.hitungTotalGaji() + " (Termasuk Tunjangan 2.5%)");

        input.close();
    }
       
    
}
