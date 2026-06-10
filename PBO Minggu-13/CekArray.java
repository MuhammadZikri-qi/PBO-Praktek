/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum08062026;

import java.util.*;

/**
 *
 * @author Muhammad Zikri
 */
public class CekArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = {10, 20, 30, 40, 50};
        
        try {
            System.out.print("Mau bagi angka index ke berapa = ");
            int index = input.nextInt();
            System.out.println("Angka pada index " + index + " adalah " + angka[index]);
            
            System.out.print("Mau dibagi berapa = ");
            int pembagi = input.nextInt();
            
            int hasil = angka[index] / pembagi;
            System.out.println("Hasil pembagian = " + hasil);
            
        } // 1. Exception Array diluar jangkauan
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index array tidak ada, masukkan rentang 0-4");
        } // 2. Input tidak sesuai tipe data
        catch (InputMismatchException ex) {
            System.out.println("Error: Harus menginputkan angka!");
        } // 3. Pembagian dengan nol
        catch (ArithmeticException e) {
            System.out.println("Error: Tidak boleh ada pembagian dengan angka 0!"); 
        } // 4. Menangkap semua jenis exception lainnya (Jaring Pengaman)
        catch (Exception e) {
            System.out.println("Error tidak diketahui: " + e.getMessage());
        } finally {
            System.out.println("\nProses selesai, isi array adalah = ");
            System.out.println("Cara 1: ");
            for (int i = 0; i < angka.length; i++) {
                System.out.print(angka[i] + " ");
            }
            System.out.println(); 
            System.out.println("Cara 2: ");
            System.out.println("Isi array : " + java.util.Arrays.toString(angka));
        }
    }
}