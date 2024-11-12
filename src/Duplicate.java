import java.util.ArrayList;
import java.util.List;

public class Duplicate {

    //university
    import java.util.ArrayList;
import java.util.List;

    public class University {
        private String name;
        private List<College> collegeList;
        private static int studentId;

        public University(String name) {
            this.name = name;
            this.collegeList = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<College> getCollegeList() {
            return collegeList;
        }

        public void setCollegeList(List<College> collegeList) {
            this.collegeList = collegeList;
        }

        public static int getStudentId(){
            return studentId;
        }

        public void addCollege(College college){
            collegeList.add(college);
        }

    }

    //student
    public class Student {
        private String studentName;

    }

    //college
    import java.util.List;
import java.util.ArrayList;
    public class College {
        private String collegeName;
        private List<Student> studentslist;

        public College(String collegeName){
            this.collegeName=collegeName;
            this.studentslist=new ArrayList<>();
        }

        public String getCollegeName(){
            return collegeName;
        }

        public void setCollegeName(String collegeName){
            this.collegeName=collegeName;
        }

        public List<Student> getStudentslist(){
            return getStudentslist();
        }

        public void setStudentslist(List<Student> studentslist){
            this.studentslist=new ArrayList<>();
        }
    }









}
