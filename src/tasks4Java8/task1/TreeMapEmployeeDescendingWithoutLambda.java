package tasks4Java8.task1;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployeeDescendingWithoutLambda {
    public static void main(String[] args) {
        Map<Employee, Integer> employees = new TreeMap<>(new NameComparator().reversed());
        employees.put(new Employee("Alice"), 1);
        employees.put(new Employee("Bob"), 2);
        employees.put(new Employee("Charlie"), 3);

        System.out.println("Employees (Descending - Without Lambda):");
        for (Employee employee : employees.keySet()) {
            System.out.println(employee.getName());
        }
        withLambda();
    }

    public static void withLambda() {
        Map<Employee, Integer> employees = new TreeMap<>((emp1, emp2) -> emp2.getName().compareTo(emp1.getName()));
        employees.put(new Employee("Alice"), 1);
        employees.put(new Employee("Bob"), 2);
        employees.put(new Employee("Charlie"), 3);

        System.out.println("Employees (Descending - With Lambda):");
        for (Employee employee : employees.keySet()) {
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
