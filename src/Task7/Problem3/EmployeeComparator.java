package Task7.Problem3;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        int salaryComparision= (int) (e1.getSalary()-(e2.getSalary()));

        if(salaryComparision==0){
            return Double.compare(e1.getId(), e2.getId());
        }
        return salaryComparision;

    }

}
