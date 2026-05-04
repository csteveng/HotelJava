package application.userinterface;

import application.util.FormValidationUtil;

public class MenuApp {

    private final MenuGuest menuGuest;
    private final MenuBedRoom menuBedRoom;
    private final MenuEmployee menuEmployee;

    public MenuApp(MenuGuest menuGuest, MenuBedRoom menuBedRoom, MenuEmployee menuEmployee){
        this.menuGuest = menuGuest;
        this.menuBedRoom = menuBedRoom;
        this.menuEmployee = menuEmployee;
    }

    public void showMainMenu(){
        int option;
        do {
            System.out.println("========================");
            System.out.println("|    Menú Principal    |");
            System.out.println("========================\n");
            System.out.println("1. Gestión de huéspedes.");
            System.out.println("2. Gestión de habitaciones.");
            System.out.println("3. Gestión de empleados.");
            System.out.println("0. Salir.");
            option = FormValidationUtil.validateInt("Seleccione una opción: ");

            switch (option){
                case 1 -> menuGuest.showMenu();
                case 2 -> menuBedRoom.showMenu();
                case 3 -> menuEmployee.showMenu();
                case 0 -> System.out.println("Saliendo de la aplicación...");
                default -> System.out.println("Opción inválida, intente de nuevo ...");
            }
        } while(option != 0);
    }
}
