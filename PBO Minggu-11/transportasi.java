/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;

/**
 *
 * @author Muhammad Zikri
 */
public abstract class transportasi {
    protected int biayaPerjalanan;
    protected String namaPenumpang;

    public transportasi(int biayaPerjalanan, String namaPenumpang) {
        this.biayaPerjalanan = biayaPerjalanan;
        this.namaPenumpang = namaPenumpang;
    }

    public int getBiayaPerjalanan() {
        return biayaPerjalanan;
    }

    public void setBiayaPerjalanan(int biayaPerjalanan) {
        this.biayaPerjalanan = biayaPerjalanan;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }
    
    
    public abstract void biayaPerjalanan();


    
}
