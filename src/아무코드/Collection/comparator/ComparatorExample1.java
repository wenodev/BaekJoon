package 아무코드.Collection.comparator;

import 아무코드.Collection.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample1 {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7, 10)));
        employees.add(new Employee(1004, "Chris", 95000.50, LocalDate.of(2017, 3, 19)));
        employees.add(new Employee(1015, "David", 134000.00, LocalDate.of(2017, 9, 28)));
        employees.add(new Employee(1009, "Steve", 100000.00, LocalDate.of(2016, 5, 18)));


        System.out.println("Employees : " + employees);

//        Collections.sort(employees, Comparator.comparing(Employee::getName));
//
//        System.out.println("Employees : " + employees);

        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName));

        System.out.println("Employees : " + employees);

    }
}
