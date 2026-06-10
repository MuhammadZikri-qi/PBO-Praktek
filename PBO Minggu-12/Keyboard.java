package pratikum25052026;

public class Keyboard extends AlatMusik implements BisaDinyalakan {
    private boolean dayaTersambung;

    public Keyboard(boolean dayaTersambung, String nama, String jenis) {
        super(nama, jenis); 
        this.dayaTersambung = dayaTersambung;
    }

    @Override
    public void mainkan() {
        System.out.println(nama + " dimainkan dengan cara ditekan tutsnya.");
    }

    @Override
    public void stem() {
        System.out.println(nama + " adalah alat musik digital, tuning dilakukan secara otomatis.");
    }

    @Override
    public void nyalakan() {
        if (cekListrik()) {
            System.out.println(nama + " dinyalakan.");
        } else {
            System.out.println(nama + " tidak bisa dinyalakan, periksa daya listrik.");
        }
    }

    @Override
    public void matikan() {
        System.out.println(nama + " dimatikan.");
    }

    @Override
    public boolean cekListrik() {
        return dayaTersambung;
    }
}