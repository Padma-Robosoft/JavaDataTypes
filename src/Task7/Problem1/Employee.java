package Task7.Problem1;

public class Employee implements Comparable<Employee> {
    private int salary;
    private String name;

    public Employee(int salary, String name){
        this.salary=salary;
        this.name=name;
    }

    public double getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public int compareTo(Employee other){
        return this.salary-other.salary;
    }

    public String toString(){
        return "Employee{name= "+name+"salary= "+salary+"}";
    }


}
