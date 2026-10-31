import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

public class SecondHighestSalary {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Rahul", 50000),
            new Employee(2, "Amit", 80000),
            new Employee(3, "Priya", 90000),
            new Employee(4, "Neha", 70000),
            new Employee(5, "Rohan", 90000)
        );

        Employee result = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary)
                    .reversed())
            .map(e -> e)
            .collect(Collectors.collectingAndThen(
                Collectors.toMap(
                    Employee::getSalary,
                    e -> e,
                    (first, second) -> first,
                    TreeMap::new
                ),
                map -> map.lowerEntry(map.lastKey()).getValue()
            ));

        System.out.println("Second Highest: " + result);
    }
}
