package tasks4Java8.task1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithoutLambda {
    public static void main(String[] args) {
        Set<Employee> employees = new TreeSet<>(new NameComparator());
        employees.add(new Employee("Alice"));
        employees.add(new Employee("Bob"));
        employees.add(new Employee("Charlie"));
        employees.add(new Employee("David"));
        employees.add(new Employee("Eva"));

        System.out.println("Sorted Employees (Without Lambda):");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public static void withLamnda() {
        Set<Employee> employees = new TreeSet<>((emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));
        employees.add(new Employee("Alice"));
        employees.add(new Employee("Bob"));
        employees.add(new Employee("Charlie"));
        employees.add(new Employee("David"));
        employees.add(new Employee("Eva"));

        System.out.println("Sorted Employees (With Lambda):");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static class NameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.getName().compareTo(emp2.getName());
        }
    }
}
