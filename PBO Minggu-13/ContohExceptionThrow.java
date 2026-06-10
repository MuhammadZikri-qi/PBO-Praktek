/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum08062026;

import java.util.Scanner;

/**
 *
 * @author Muhammad Zikri
 */
public class ContohExceptionThrow {
    public static void cekNilai( int nilai)throws Exception{
        if(nilai<0){
            throw new Exception("Nilai maksimumm 100");
        }    
        else if(nilai>100){
            throw new Exception("Nilai maksimum 100");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
        System.out.print("Masukkan sebuah angka = ");
        int angka=input.nextInt();
        cekNilai(angka);
        }catch (Exception e){
            System.out.println("Gagal :"+e.getMessage());
        }finally{
            System.out.println("Sistem Berhasil");
        }
    }
    
}
