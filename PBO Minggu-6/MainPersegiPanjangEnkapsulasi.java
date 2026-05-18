    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum06042026;

import java.util.Scanner;

/**
 *
 * @author LAB-SI-PC
 */
public class MainPersegiPanjangEnkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Objek Persegi Panjang Pertama
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        pp1.setPanjang(20);
        pp1.setLebar(10);
        int luas = pp1.getLuas();
        System.out.println("Objek Persegi Panjang Pertama");
        System.out.printf("Panjang  = %.2f\n", (double) pp1.getPanjang());
        System.out.printf("Lebar    = %.2f\n", (double) pp1.getLebar());
        System.out.printf("Luas     = %.2f\n", (double) luas);
        System.out.printf("Keliling = %.2f\n\n", (double) pp1.getKeliling());
        
        // membuat objek kedua menggunakan konstruktor 2
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(10, 5);
        luas = pp2.getLuas();
        System.out.println("Objek Persegi Panjang Kedua");
        System.out.printf("Panjang  = %.2f\n", (double) pp2.getPanjang());
        System.out.printf("Lebar    = %.2f\n", (double) pp2.getLebar());
        System.out.printf("Luas     = %.2f\n", (double) luas);
        System.out.printf("Keliling = %.2f\n\n", (double) pp2.getKeliling());
        
        // membuat objek ketiga menggunakan konstruktor 3
        Scanner input = new Scanner(System.in);
        System.out.println("Objek Persegi Panjang Ketiga");
        System.out.print("Panjang = ");
        int pj = input.nextInt();
        System.out.print("Lebar = ");
        int lb = input.nextInt();
        
        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(pj, lb);
        System.out.printf("Luas     = %.2f\n", (double) pp3.getLuas());
        System.out.printf("Keliling = %.2f\n", (double) pp3.getKeliling());
        
    }
}

