package Task6.Problem3;

import java.util.*;

public class StudentGrades {

    public static HashMap<String, Float> averageOfGrades(ArrayList<Student> arrStudent) {

        HashMap<String, Float> marksMap = new HashMap<>();
        for (Student s : arrStudent) {
            marksMap.put(s.getName(), (float) Arrays.stream(s.getGrades()).average().getAsDouble());
        }

        return marksMap;
    }

    public static Map<Character, List<String>> groupOfMarksRanges(ArrayList<Student> arrStudent) {
        Map<Character, List<String>> marksMap = new HashMap<>();
        ArrayList<String> testing = new ArrayList<>();

        Map<String, Float> groupMarks = averageOfGrades(arrStudent);

        for (Map.Entry<String, Float> m : groupMarks.entrySet()) {
            if (m.getValue() >= 90) {

                marksMap.computeIfAbsent('A', k -> new ArrayList<>()).add(m.getKey());
            } else if (m.getValue() >= 60 && m.getValue() < 90)
                marksMap.computeIfAbsent('B', k -> new ArrayList<>()).add(m.getKey());

//                marksMap.computeIfAbsent('B', k -> new ArrayList<>()).add(m.getKey());
            else
                marksMap.computeIfAbsent('C', k -> new ArrayList<>()).add(m.getKey());
//                marksMap.computeIfAbsent('C', k -> new ArrayList<>()).add(m.getKey());
//            marksMap.computeIfAbsent(grade, k -> new ArrayList<>()).add(m.getKey());

        }
        return marksMap;
    }

    public static void main(String[] args) {
        ArrayList<Student> arrStudent = new ArrayList<>();
        Student s1 = new Student(1, "Alice", 99, 92, 95);
        Student s2 = new Student(2, "Bob", 78, 85, 82);
        Student s3 = new Student(3, "Deepthi", 35, 40, 45);
        Student s4 = new Student(4, "Deep", 35, 40, 45);

        arrStudent.add(s1);
        arrStudent.add(s2);
        arrStudent.add(s3);
        arrStudent.add(s4);

        Map<String, Float> map1 = averageOfGrades(arrStudent);
        for (Map.Entry<String, Float> m : map1.entrySet()) {
            System.out.println("Key: " + m.getKey() + " Value: " + m.getValue());
        }

        Map<Character, List<String>> map2 = groupOfMarksRanges(arrStudent);
        for (Map.Entry<Character, List<String>> m : map2.entrySet()) {
            System.out.println("Grade: " + m.getKey() + " Student: " + m.getValue());
        }
    }
}




