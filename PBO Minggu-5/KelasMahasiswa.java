package pratikum30032026;
// Muhammad Zikri
// 2501082001

public class Mahasiswa {
    
    String nama;   //atribut
    String nim;
    double tugas;
    double uts;
    double uas;
    
    Mahasiswa() {  // konstruktor
    }
    
    Mahasiswa(String n, String ni, double t, double ut, double ua) {
        nama = n;
        nim = ni;
        tugas = t;
        uts = ut;
        uas = ua;
    }
    
    double hitungNilaiAkhir() {   //method
        return (0.25 * tugas) + (0.35 * uts) + (0.40 * uas);
    }
}
