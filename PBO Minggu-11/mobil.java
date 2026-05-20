/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;

/**
 *
 * @author Muhammad Zikri
 */
public class mobil extends transportasi{
    private String jenisMobil;

    public mobil(String jenisMobil, int biayaPerjalanan, String namaPenumpang) {
        super(biayaPerjalanan, namaPenumpang);
        this.jenisMobil = jenisMobil;
    }
    
    
    public String getMerkMobil() {
        return jenisMobil;
    }

    public void setMerkMobil(String merkMobil) {
        this.jenisMobil = jenisMobil;
    }
    
    @Override
    public void biayaPerjalanan(){
        System.out.println ("Pembayaran Menggunakan Mobil");
        System.out.println ("Merek Mobil:" + jenisMobil);
        System.out.println ("Nama Penumpoang:"+ namaPenumpang);
        System.out.println ("Jumlah Bayar: Rp"+biayaPerjalanan);
    }
    
    
    
    
}
