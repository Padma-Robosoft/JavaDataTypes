package Task7.Problem1;

public class Student implements Comparable<Student>{
    private String name;
    private int grade;


    public Student(String name, int grade){
        this.name=name;
        this.grade=grade;
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

    public int compareTo(Student other){
        return Integer.compare(this.grade, other.grade);
    }

    public String toString(){
        return  "Student{ name= "+name+ " grade= "+grade+"}";
    }

}
