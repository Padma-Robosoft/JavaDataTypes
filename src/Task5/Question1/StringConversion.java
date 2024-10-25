package Task5.Question1;

public class StringConversion {
    public static void main(String[] args) {

        String str="Hello There!";
        StringBuilder sb=new StringBuilder(str);
        System.out.println("The String Converted to String Builder: "+str);

        StringBuilder newStr=new StringBuilder();
        System.out.println("The String Builder Converted back to String: "+sb.toString());

        sb.append(" Welcome to Java Programming");
        System.out.println("The Modified String Builder is: "+sb);

        String modifiedStr= sb.toString();
        System.out.println("The Conversion of Modified String Builder to String: " + modifiedStr);

    }
}
