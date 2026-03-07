package application.domain;

import java.util.Date;
import java.util.List;

public class Booking {

    private int id;
    private Date dateIn;
    private Date dateOut;
    private double total;
    private Guest guest;
    private Room room;
    private Service[] services;
    private String status;

    public Booking() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Booking createBooking(Booking booking){
        return booking;
    }

    public Booking updateBooking(Booking booking){
        return booking;
    }
    public List<Booking> getBookings(){
        return null;
    }
    public Booking getBookingById(int id){
        return null;
    }
    public void deleteBooking(int id){

    }
}
