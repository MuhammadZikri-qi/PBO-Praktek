/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;

/**
 *
 * @author Muhammad Zikri
 */
public class pembayaranEWallet extends pembayaran{
    private String namaEWallet;

    public pembayaranEWallet(String namaEWallet, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaEWallet = namaEWallet;
    }


    public String getNamaEWallet() {
        return namaEWallet;
    }

    public void setNamaEWallet(String namaEWallet) {
        this.namaEWallet = namaEWallet;
    }
    
    @Override
    public void prosesPembayaran(){
        System.out.println ("Pembayaran melalui E-Wallet");
        System.out.println ("E-Wallet:" + namaEWallet);
        System.out.println ("ID transaksi:"+ idTransaksi);
        System.out.println ("Jumlah Bayar: Rp"+jumlahBayar);
    }
    
    
    
}
