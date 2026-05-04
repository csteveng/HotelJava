package application.util;

import application.domain.enums.PersonState;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FormValidationUtil {

    private final static Scanner sc = new Scanner(System.in);

    public static int validateInt(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                int value = sc.nextInt();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                sc.nextLine();
            }
        }
    }

    public static double validateDouble(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                double value = sc.nextDouble();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido. Por favor, ingrese un número decimal.");
                sc.nextLine();
            }
        }
    }

    public static boolean validateBoolean(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                boolean value = sc.nextBoolean();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido. Por favor, ingrese solo true o false.");
                sc.nextLine();
            }
        }
    }

    public static String validateString(String prompt) throws InputMismatchException {
        while (true) {
            System.out.println(prompt);
            String value = sc.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            throw new InputMismatchException("Valor no válido. Por favor, ingrese texto válido.");
        }
    }

    public static PersonState validatePersonState(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = sc.nextLine().trim();
            if (input.equals("1")) {
                return PersonState.ACTIVE;
            } else if (input.equals("2")) {
                return PersonState.INACTIVE;
            }
            System.out.println("Entrada no válida. Por favor, ingrese una de las opciones válidas.");
        }
    }
}
