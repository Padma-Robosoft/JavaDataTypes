public class Task1 {
    public static void main(String[] args) {

        String name="Jeevan";
        int age=70;
        double heigth=5.9;
        double weight=50.443;
        boolean isEmployee=true;
        String[] skills={"Java","JavaScript", "SQL"};

        String full_name= "Mr. "+name+" Jain";
        System.out.println("The Original Name is: "+name);
        System.out.println("The Full Name is: "+full_name);

        long ageInSeconds=age*365l*24*60*60;
        System.out.println("Jeevan's age in seconds is: "+ageInSeconds);

        int numberOfSkills= skills.length;
        System.out.println("The number of skills mentioned are: "+numberOfSkills);

       long Rounded_weight=Math.round(weight);
        System.out.println("Rounded weight is: "+Rounded_weight);

    }
}
