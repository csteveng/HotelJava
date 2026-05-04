package application.service;

import application.domain.enums.BedRoomState;
import application.util.FormValidationUtil;

public class BedRoomStateSelector {

    public static String bedRoomAddState(){

        System.out.println("Seleccione estado de la habitación: ");
        System.out.println(" 1. Disponible.");
        System.out.println(" 2. Ocupada.");
        System.out.println(" 3. En Mantenimiento.");
        System.out.println(" 4. Reservada.");
        String value = "";

        int option = FormValidationUtil.validateInt("Seleccione una opción: ");

        switch (option){
            case 1:
                value = BedRoomState.DISPONIBLE.getDescription();
                break;
            case 2:
                value = BedRoomState.OCUPADA.getDescription();
                break;
            case 3:
                value = BedRoomState.MANTENIMIENTO.getDescription();
                break;
            case 4:
                value = BedRoomState.RESERVADA.getDescription();
                break;
            default:
                value = "Opcion no válida.";

        }

        return value;
    }
}
