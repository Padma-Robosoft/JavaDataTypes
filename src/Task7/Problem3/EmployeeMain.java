package Task7.Problem3;

import Task7.Problem2.Product;

import java.util.*;

public class EmployeeMain {
    public static void sortEmployee(List<Employee> Employee){
        Collections.sort(Employee, new EmployeeComparator());
        //System.out.println("Sorted Products: "+products);
    }

    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();

        employees.add(new Employee(9,1000));
        employees.add(new Employee(2,5000));
        employees.add(new Employee(7,2000));
        employees.add(new Employee(4,500));
        employees.add(new Employee(5,1000));

        sortEmployee(employees);
        for(Employee employee:employees){
            System.out.println(employee);
        }



    }
}
