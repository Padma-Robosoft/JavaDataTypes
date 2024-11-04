package Task7.Problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

    public static void sortEmployee(List<Employee> employees){
        Collections.sort(employees);
        System.out.println("The sorted order is: "+employees);
    }

    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();

        employees.add(new Employee(9000,"Chandan"));
        employees.add(new Employee(6000,"Lohit"));
        employees.add(new Employee(2000, "Prajna"));
        employees.add(new Employee(8000,"Padma"));
        sortEmployee(employees);
    }
}
