package Task7.Problem1;

import java.util.*;

public class StudentMain {
    public static void sortStudent(List<Student> students){
        Collections.sort(students);
        System.out.println("After sorting: "+students);
    }

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();

        students.add(new Student("Padma",90));
        students.add(new Student("Lohit",75));
        students.add(new Student("Chandan",85));
        students.add(new Student("prajna",65));
        System.out.println("Before Sorting"+students);
        sortStudent(students);

    }
}
