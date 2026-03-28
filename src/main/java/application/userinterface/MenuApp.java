package application.userinterface;

import application.view.GuestView;

import java.util.Scanner;

public class MenuApp {

    Scanner sc = new Scanner(System.in);

    private final GuestView guestView;

    public MenuApp(GuestView guestView) {
        this.guestView = guestView;
    }

    public void showMainMenu(){

        System.out.println("Bienvenido al Hotel Java");
        System.out.println("Presione 1 para iniciar la aplicacion");

        int init = sc.nextInt();
        sc.nextLine();
        while(init != 0){

            System.out.println("Seleccione 1. Registrar Usuario 2. Iniciar Sesion 3. Salir");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    System.out.println("Registrar Usuario");
                    guestView.createGuest();
                    break;
                case 2:
                    System.out.println("Iniciar Sesion");
                    showGuestMenu();
                    break;
                case 3:
                    System.out.println("Saliendo de la aplicacion");
                    init = 0;
                    break;
                default:
                    System.out.println("Opcion no valida, por favor seleccione una opcion valida");
            }

        }
    }


    public void showGuestMenu(){

        System.out.println("Menu Huespedes");

        Boolean init = true;

        while(init){

            System.out.println("Seleccione 1. Crear Huesped 2. Actualizar Huesped 3. Eliminar Huesped 4. Listar Huespedes 5. Buscar huesped por id 6. salir");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    System.out.println("Crear huesped");
                    guestView.createGuest();
                    break;
                case 2:
                    System.out.println("Actualizar Huesped");
                    break;
                case 3:
                    System.out.println("Eliminar Huesped");
                    break;
                case 4:
                    System.out.println("Listar Huespedes");
                        guestView.getAllGuests();
                    break;
                case 5:
                    System.out.println("Buscar huesped por id");
                    break;
                case 6:
                    System.out.println("Saliendo del menu de huespedes");
                    init = false;
                    break;
                default:
                    System.out.println("Opcion no valida, por favor seleccione una opcion valida");

            }





        }

    }

}
