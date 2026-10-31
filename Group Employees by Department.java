import java.util.*;
import java.util.stream.*;

class Employee {

    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class EmployeeGrouping {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Rahul", "IT"),
            new Employee("Amit", "HR"),
            new Employee("Priya", "IT"),
            new Employee("Neha", "Finance"),
            new Employee("Rohan", "HR")
        );

        Map<String, List<Employee>> result =
                employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.department
                ));

        result.forEach((department, employeeList) ->
                System.out.println(department + " : " + employeeList)
        );
    }
}
