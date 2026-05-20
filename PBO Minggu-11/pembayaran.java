/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;

/**
 *
 * @author Muhammad Zikri
 */
public abstract class pembayaran {
     protected double jumlahBayar;
     protected String idTransaksi;

    public pembayaran(double jumlahBayar, String idTransaksi) {
        this.jumlahBayar = jumlahBayar;
        this.idTransaksi = idTransaksi;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }
    
    public abstract void prosesPembayaran();
     
    
}
