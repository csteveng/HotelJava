package application.domain;

import java.util.List;

public class Employee {

    int id;
    String rol;
    double salary;
    String schedule;

    // Constructors

    public Employee() {
    }

    public Employee(int id, String rol, double salary, String schedule) {
        this.id = id;
        this.rol = rol;
        this.salary = salary;
        this.schedule = schedule;
    }
// Class Methods

    public Employee createEmployee(Employee employee){
        return employee;
    }

    public Employee updateEmployee(Employee employee){
        return employee;
    }
    public List<Employee> getEmployees(){
        return null;
    }
    public Employee getEmployeeById(int id){
        return null;
    }
    public void deleteEmployee(int id){

        }
}
