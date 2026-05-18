/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;

/**
 *
 * @author Muhammad Zikri
 */
public class kereta extends transportasi {
    private String kelasKereta;

    public kereta(String kelasKereta, int biayaPerjalanan, String namaPenumpang) {
        super(biayaPerjalanan, namaPenumpang);
        this.kelasKereta = kelasKereta;
    }

    public String getKelasKereta() {
        return kelasKereta;
    }

    public void setKelasKereta(String kelasKereta) {
        this.kelasKereta = kelasKereta;
    }
    
    @Override
    public void biayaPerjalanan() {
        System.out.println ("Pembayaran Menggunakan Kereta");
        System.out.println ("Kelas Kereta:" + kelasKereta);
        System.out.println ("Nama Penumpang:"+ namaPenumpang);
        System.out.println ("Jumlah Bayar: Rp"+biayaPerjalanan);
    }
    
    
    
}
