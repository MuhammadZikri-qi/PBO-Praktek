/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum30032026;

/**
 * Nama     : Muhammad Zikri
 * Tanggal  : 30/03/2026
 * 
 * @author LAB-SI-PC
 */
public class PersegiPanjang {
    int panjang; //atribut
    int lebar ; //atribut
    
    //konstruktor
    PersegiPanjang (){
        
    }
    
    PersegiPanjang(int a,int b){
        panjang = a;
        lebar = b;
    }
    
    //method
    int hitungLuas(){
        return (panjang*lebar);
    }
    
    int hitungKeliling(){
        return (2*(panjang+lebar));
    }
}
