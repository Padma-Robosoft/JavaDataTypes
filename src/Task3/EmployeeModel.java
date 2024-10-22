package Task3;

public class EmployeeModel {
    private String name="Jeevan";
    private int age=70;
    private double height=5.9;
    private double weight=50.49;
    private boolean isEmployee=true;
    private String[] skills;

    public EmployeeModel(String name, int age, double height, double weight, boolean isEmployee, String[] skills){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.isEmployee=isEmployee;
        this.skills=skills;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public String[] getSkills() {
        return skills;
    }
}
