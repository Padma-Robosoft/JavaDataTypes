package PracticePrograms;

import java.util.HashSet;
import java.util.Set;

public class HashCode {
    public static void main(String[] args) {

        Set<Student> studentSet=new HashSet<>();
        studentSet.add(new Student("Padma",1));
        studentSet.add(new Student("Prajna",2));
        studentSet.add(new Student("Chandhan",3));
        studentSet.add(new Student("Lohit",4));

        studentSet.add(new Student("Padma",1));

        Student s1=new Student("pavan",6);
        Student s2=new Student("pervez",9);


        System.out.println(studentSet);
        System.out.println(s1.equals(s2));

    }
}
