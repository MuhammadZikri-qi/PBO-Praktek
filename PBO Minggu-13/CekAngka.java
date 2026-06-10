/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum08062026;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Muhammad Zikri
 */
public class CekAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a,b; 
        Scanner input = new Scanner(System.in);
        try{
        System.out.print("Masukkan pembilang = ");
        a= input.nextInt();
        System.out.print("Masukkan penyebut = ");
        b= input.nextInt();
        int hasil = a/b;
        System.out.println("Hasil pembagian = "+hasil);
        } catch(InputMismatchException ex){
            System.out.print("Harus input angka");
        }
        
        catch(ArithmeticException e) {
            System.out.println("Tidak boleh ada pembagian dengan 0100"); 
        } finally{
            System.out.print("Pengecekan angka Sukses");
        }
        
        
    }
    
}
