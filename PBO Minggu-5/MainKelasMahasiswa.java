package pratikum30032026;

import java.util.Scanner;

public class MainMahasiswa {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama = ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM = ");
        String nim = input.nextLine();
        
        System.out.print("Nilai Tugas = ");
        double tugas = input.nextDouble();
        
        System.out.print("Nilai UTS = ");
        double uts = input.nextDouble();
        
        System.out.print("Nilai UAS = ");
        double uas = input.nextDouble();
        
        Mahasiswa mhs1 = new Mahasiswa(nama, nim, tugas, uts, uas);
        
        System.out.println("Data Mahasiswa");
        System.out.println("Nama        : " + mhs1.nama);
        System.out.println("NIM         : " + mhs1.nim);
        System.out.println("Nilai Akhir : " + String.format("%.2f", mhs1.hitungNilaiAkhir()));
    }
}
