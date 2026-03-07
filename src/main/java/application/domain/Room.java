package application.domain;

import java.util.Scanner;

public class Room {

    Scanner scanner = new Scanner(System.in);
    private int id;
    private java.lang.String roomNumber;
    private java.lang.String type;
    private double price;
    private String status;

    //Constructor
    public Room() {

    }

    public Room(int id, java.lang.String roomNumber, java.lang.String type, double price, String status) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(java.lang.String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public java.lang.String getType() {
        return type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //Methods

    public Room createRoom(Room room) {
        System.out.print("Ingrese el id de la habitación: ");
        int id = scanner.nextInt();
        room.id = id;
        scanner.nextLine();

        System.out.print("Ingrese el número de la habitación: ");
        java.lang.String number = scanner.nextLine();
        room.roomNumber = number;

        System.out.print("Seleccione el tipo de la habitación: ");
        java.lang.String type = scanner.nextLine();
        room.type = type;

        System.out.print("Ingrese el precio por persona: ");
        double price = scanner.nextDouble();
        room.price = price;
        scanner.nextLine();

        System.out.println("Seleccione el estado del la habitación: ");
        java.lang.String state = scanner.next();
        room.status = state;

        return room;
    }

    public void  getBedRoomById(int id, Room bedRoom) {
        if(this.id == id){
            System.out.println("Id: " +  bedRoom.id + "\n" +
                    "Numero habitación: " + bedRoom.roomNumber + "\n" +
                    "Tipo habitación: " +  bedRoom.type + "\n" +
                    "Precio: " + bedRoom.price + "\n" +
                    "Estado: " + bedRoom.status + "\n");
        } else {
            System.out.println("Valide el id de la habitación que está consultando.");
        }
    }
}
