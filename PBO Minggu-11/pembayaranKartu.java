/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;

/**
 *
 * @author Muhammad Zikri
 */
public class pembayaranKartu  extends pembayaran{
    private String noKartu;

    public pembayaranKartu(String noKartu, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.noKartu = noKartu;
    }

    public String getNoKartu() {
        return noKartu;
    }

    public void setNoKartu(String noKartu) {
        this.noKartu = noKartu;
    }
     public void prosesPembayaran(){
        System.out.println ("Pembayaran melalui E-Wallet");
        System.out.println ("E-Wallet:" + noKartu);
        System.out.println ("ID transaksi:"+ idTransaksi);
        System.out.println ("Jumlah Bayar: Rp"+jumlahBayar);
    }

    
    
    
    
    
}
