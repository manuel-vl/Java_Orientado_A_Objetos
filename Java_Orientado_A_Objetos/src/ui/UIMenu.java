package ui;

import java.util.Scanner;

public class UIMenu {
    // Final indica que es una cosntante y no se puede modificar
    public static final String[] MONTHS={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    // Tenemos 2 metodos estaticos que pueden ser utilizados solo llamando la clase
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1 -> System.out.println("Doctor");
                case 2 -> {
                    response = 0;
                    showPatientMenu();
                }
                case 0 -> System.out.println("Thank you for you visit");
                default -> System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1 -> {
                    System.out.println("::Book an appointment");
                    for(int i=0; i<3; i++){
                        System.out.println(i+1 +". "+MONTHS[i]);
                    }
                }
                case 2 -> System.out.println("::My appointments");
                case 0 -> showMenu();
            }
        }while (response != 0);
    }

}
