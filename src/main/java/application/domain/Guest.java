package application.domain;

import application.domain.enums.PersonState;

public class Guest extends Person {
    private String city;

    public Guest() {}

    public Guest(int id, String firstName, String lastName, String email, String phone,
                 PersonState state, String city) {
        super(id, firstName, lastName, email, phone, state); // atributos del padre
        this.city = city; // atributo propio
    }

    public Guest(int id, String firstName, String lastName, String email, String phone, PersonState state) {
        super(id, firstName, lastName, email, phone, state);
        this.city = null;
    }

    public Guest(int id, String firstName, String lastName) {
        super(id, firstName, lastName, null, null, PersonState.ACTIVE);
        this.city = null; // sin ciudad por defecto
    }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
}
