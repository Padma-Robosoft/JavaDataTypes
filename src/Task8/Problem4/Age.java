package Task8.Problem4;

public class Age {

//     public static void checkAge(int age) throws InvalidAgeException {
//        if (age < 0 || age > 120) {
//            throw new InvalidAgeException("Age must be between 0 and 120.");
//        } else
//        {
//            System.out.println("Age is valid: " + age);
//        }
//    }
    public static void checkAge(int age) {
        try {
            if (age > 0 && age <= 120)
                System.out.println("The age is valid");
            else
                throw new InvalidAgeException("Age must be between 0 to 120");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main (String[]args) {
//            try {
//                checkAge(150);
//                checkAge(25);
//            }
//            catch (InvalidAgeException e) {
//                System.out.println("Error: " + e.getMessage());
//            }
       checkAge(150);
       checkAge(20);
    }
}
