package Task8.Problem1;

public class StringParser {

    public static void parseStringToInteger(String input) {
            try {
                if (input == null) {
                    throw new NullPointerException("Input string is null");
                }
                System.out.println(Integer.parseInt(input));

        }
        catch (NumberFormatException e) {
            System.out.println("Error: Entered value is not a valid String " +input);
          //  return 0;
        }
        catch (NullPointerException e) {
            System.out.println(e.toString());
           // return 0;
        }
       // return 0;
    }

    public static void main(String[] args) {

        parseStringToInteger("123");
        parseStringToInteger("abc");
        parseStringToInteger(null);

//        System.out.println(parseStringToInteger("123"));
//        System.out.println(parseStringToInteger("abc"));
//        System.out.println(parseStringToInteger(null));

    }
}
