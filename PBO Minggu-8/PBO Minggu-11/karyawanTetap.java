/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;

/**
 *
 * @author Muhammad Zikri
 */
public class karyawanTetap extends karyawan {
    private double gajipokok;

    public karyawanTetap(double gajipokok, String nama) {
        super(nama);
        this.gajipokok = gajipokok;
    }    
        public double hitungTotalGaji() {
        // Tunjangan 2.5% dari gaji bulanan (2.5 / 100 = 0.025)
        double tunjangan = gajipokok * 0.025;
        return gajipokok + tunjangan;
    }
      
}
