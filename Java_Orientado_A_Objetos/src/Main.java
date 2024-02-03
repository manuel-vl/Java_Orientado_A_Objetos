import ui.UIMenu;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
        Doctor doctorA=new Doctor();
        doctorA.showId();

        Doctor doctorB=new Doctor();
        doctorA.showId();

        // Implementando metodos estaticos
        showMenu();
    }


}
