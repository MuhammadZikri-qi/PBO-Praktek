package pratikum25052026;

public class MainAlatMusik {

    public static void main(String[] args) {
        Gitar gitar = new Gitar(6, "Gitar Klasik", "Petik");
        Keyboard keyboard = new Keyboard(true, "Yamaha", "Elektronik");
        
        System.out.println("\n--- Alat Musik Gitar ---");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println("\n--- Alat Musik Keyboard ---");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.mainkan();
    }
}