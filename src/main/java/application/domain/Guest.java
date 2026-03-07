package application.domain;

import java.util.List;

public class Guest {

    int id;
    String origin;
    String type;

    public Guest() {
    }

    public Guest(int id, String origin, String type) {
        this.id = id;
        this.origin = origin;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Guest createGuest(Guest guest){
        return guest;
    }

    public Guest updateGuest(Guest guest){
        return guest;
    }
    public List<Guest> getGuests(){
        return null;
    }
    public Guest getGuestById(int id){
        return null;
    }
    public void deleteGuest(int id){

    }
}
