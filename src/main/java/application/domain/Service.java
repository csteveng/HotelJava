package application.domain;

import java.util.List;

public class Service {
    int id;
    String type;
    String description;
    double price;
    boolean status;

    public Service() {
    }

    public Service(int id, String type, String description, double price, boolean status) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Service createService(Service service){
        return service;
    }

    public Service updateService(Service service){
        return service;
    }
    public List<Service> getServices(){
        return null;
    }
    public Service getServiceById(int id){
        return null;
    }
    public void deleteService(int id){

    }
}
