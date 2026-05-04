package application.view;

import application.domain.Employee;
import application.domain.enums.PersonState;
import application.service.outputs.EmployeeService;
import application.util.FormValidationUtil;

import java.util.List;

public class EmployeeView {
    private final EmployeeService employeeService;

    public EmployeeView(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void createEmployee() {
        int id = FormValidationUtil.validateInt("Ingrese un id para el empleado: ");
        String firstName = FormValidationUtil.validateString("Ingrese el nombre: ");
        String lastName = FormValidationUtil.validateString("Ingrese el apellido: ");
        String email = FormValidationUtil.validateString("Ingrese el email: ");
        String phone = FormValidationUtil.validateString("Ingrese el teléfono: ");
        PersonState state = FormValidationUtil.validatePersonState("Ingrese el estado para el empleado (1. Activo / 2. Inactivo): ");
        String position = FormValidationUtil.validateString("Ingrese el cargo: ");
        double salary = FormValidationUtil.validateDouble("Ingrese el salario: ");

        Employee employee = new Employee(id, firstName, lastName, email, phone, state, position, salary);
        employeeService.createEmployee(employee);
        System.out.println("Empleado creado exitosamente.");
    }

    public void updateEmployee() {
        int id = FormValidationUtil.validateInt("Ingrese el ID del empleado a actualizar: ");
        Employee employee = employeeService.getEmployeeById(id).orElse(null);
        if (employee == null) {
            System.out.println("Empleado no encontrado.");
            return;
        }
        employee.setFirstName(FormValidationUtil.validateString("Ingrese el nuevo nombre: "));
        employee.setLastName(FormValidationUtil.validateString("Ingrese el nuevo apellido: "));
        employee.setEmail(FormValidationUtil.validateString("Ingrese el nuevo email: "));
        employee.setPhone(FormValidationUtil.validateString("Ingrese el nuevo teléfono: "));
        employee.setState(FormValidationUtil.validatePersonState("Ingrese el estado para el empleado (1. Activo / 2. Inactivo): "));
        employee.setPosition(FormValidationUtil.validateString("Ingrese el nuevo cargo: "));
        employee.setSalary(FormValidationUtil.validateDouble("Ingrese el nuevo salario: "));

        employeeService.updateEmployee(employee);
        System.out.println("Empleado actualizado exitosamente.");
    }

    public void consultEmployeeById() {
        int id = FormValidationUtil.validateInt("Ingrese el ID del empleado: ");
        Employee employee = employeeService.getEmployeeById(id).orElse(null);

        if (employee == null) {
            System.out.println("Empleado no encontrado.");
            return;
        }

        System.out.println("=======================");
        System.out.println("|   DATOS EMPLEADO    |");
        System.out.println("=======================");
        System.out.println("ID: " + employee.getId());
        System.out.println("Nombre: " + employee.getFullName());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Teléfono: " + employee.getPhone());
        System.out.println("Estado: " + employee.getStateText());
        System.out.println("Cargo: " + employee.getPosition());
        System.out.println("Salario: " + employee.getSalary());
    }

    public void listAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        System.out.println("==========================");
        System.out.println("|   LISTA DE EMPLEADOS   |");
        System.out.println("==========================");
        employees.forEach(
                e -> System.out.println(
                        " ID:"          + e.getId() +
                        " Nombre: "     + e.getFullName() +
                        " Email: "      + e.getEmail() +
                        " Teléfono: "   + e.getPhone() +
                        " Estado: "     + e.getStateText() +
                        " Cargo: "      + e.getPosition() +
                        " Salario: "    + e.getSalary()
        ));
    }

    public void deleteEmployee() {
        int id = FormValidationUtil.validateInt("Ingrese el ID del empleado a eliminar: ");
        boolean deleted = employeeService.deleteEmployee(id);

        if (deleted) {
            System.out.println("Empleado eliminado exitosamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }
}
