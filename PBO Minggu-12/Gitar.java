package pratikum25052026;

public class Gitar extends AlatMusik {
    private int jumlahSenar;

    public Gitar(int jumlahSenar, String nama, String jenis) {
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }

    @Override
    public void mainkan() {
        System.out.println(nama + " dipetik dengan " + jumlahSenar + " senar.");
    }

    @Override
    public void stem() {
        System.out.println("Menyetem gitar " + nama + " dilakukan secara manual.");
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }
}