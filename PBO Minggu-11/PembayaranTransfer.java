/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;

/**
 *
 * @author Muhammad Zikri
 */

public class PembayaranTransfer extends pembayaran {
    private String namaBank;

    public PembayaranTransfer(String namaBank, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaBank = namaBank;
    }
    

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }
    
    @Override
    public void prosesPembayaran(){
        System.out.println ("Pembayaran melalui E-Wallet");
        System.out.println ("E-Wallet:" + namaBank);
        System.out.println ("ID transaksi:"+ idTransaksi);
        System.out.println ("Jumlah Bayar: Rp"+jumlahBayar);
    }
    
    
    
    
    
}
