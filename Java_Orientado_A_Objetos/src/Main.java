import ui.UIMenu;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
        Doctor doctorA=new Doctor("Doctor A", "Dermatologia");
        doctorA.showId();
        doctorA.showName();

        Doctor doctorB=new Doctor("Doctor B", "Pediatria");
        doctorA.showId();
        doctorB.showName();

        // Implementando metodos estaticos
        // showMenu();
    }


}
