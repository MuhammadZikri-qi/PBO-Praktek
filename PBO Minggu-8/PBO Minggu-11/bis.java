/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;

/**
 *
 * @author Muhammad Zikri
 */
public class bis extends transportasi{
    private String merekBis;

    public bis(String merekBis, int biayaPerjalanan, String namaPenumpang) {
        super(biayaPerjalanan, namaPenumpang);
        this.merekBis = merekBis;
    }

    public String getMerekBis() {
        return merekBis;
    }

    public void setMerekBis(String merekBis) {
        this.merekBis = merekBis;
    }
    
   
    @Override
    public void biayaPerjalanan() {
        System.out.println ("Pembayaran Menggunakan Bis");
        System.out.println ("Merek Bis:" + merekBis);
        System.out.println ("Nama Penumpang:"+ namaPenumpang);
        System.out.println ("Jumlah Bayar: Rp"+biayaPerjalanan);
    }
    
    
    
}
