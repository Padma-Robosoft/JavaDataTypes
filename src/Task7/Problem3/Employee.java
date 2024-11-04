package Task7.Problem3;

public class Employee {
    private int id;
    private long salary;

    public Employee(int id, long salary){
        this.id=id;
        this.salary=salary;
    }

    public int getId(){
        return id;
    }

    public long getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }


}
