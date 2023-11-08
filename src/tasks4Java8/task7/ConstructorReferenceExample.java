package tasks4Java8.task7;

import java.util.function.Supplier;

class Employee {
    private String name;
    private String account;
    private double salary;

    public Employee(String name, String account, double salary) {
        this.name = name;
        this.account = account;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Supplier<Employee> employeeSupplier = Employee::new;

        Employee employee = employeeSupplier.get();

        employee.setName("John Doe");
        employee.setAccount("12345");
        employee.setSalary(50000.0);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Account: " + employee.getAccount());
        System.out.println("Employee Salary: " + employee.getSalary());
    }
}
