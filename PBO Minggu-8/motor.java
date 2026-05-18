/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;

/**
 *
 * @author Muhammad Zikri
 */
public class motor extends transportasi {
    private String modelMotor;

    public motor(String modelMotor, int biayaPerjalanan, String namaPenumpang) {
        super(biayaPerjalanan, namaPenumpang);
        this.modelMotor = modelMotor;
    }

    public String getModelMotor() {
        return modelMotor;
    }

    public void setModelMotor(String modelMotor) {
        this.modelMotor = modelMotor;
    }

    @Override
    public void biayaPerjalanan() {
        System.out.println ("Pembayaran Menggunakan Mobil");
        System.out.println ("Model Motor:" + modelMotor);
        System.out.println ("Nama Penumpoang:"+ namaPenumpang);
        System.out.println ("Jumlah Bayar: Rp"+biayaPerjalanan);
    }
    
    
    
}
