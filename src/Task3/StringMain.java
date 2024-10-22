package Task3;

public class StringMain {
    public static void main(String[] args) {
        StringUtil util=new StringUtil();

        String result1=util.concat("Hello, ","There!");
        System.out.println("The Concatenation of two String is: "+result1);

        String result2=util.concat("I ","Love ","Java");
        System.out.println("The Concatenation of three String is: "+result2);
    }
}
