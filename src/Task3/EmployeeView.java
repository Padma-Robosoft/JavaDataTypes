package Task3;

public class EmployeeView {
    public void printEmployeeDetails(String originalName, String fullName, long ageInSeconds, int numberOfSkills, long roundedWeight){
        System.out.println("The Original Name is: "+originalName);
        System.out.println("The Full Name is: "+fullName);
        System.out.println("The Age in Seconds is: "+ageInSeconds);
        System.out.println("The Total Number of Skills: "+numberOfSkills);
        System.out.println("The Rounded value of Weight is: "+roundedWeight);
    }
}
