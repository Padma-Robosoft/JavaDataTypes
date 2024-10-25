package Task5.Question3;

public class AppendString {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();

        sb.append("This is");
        sb.append(" the Efficient way");
        sb.append(" to append");
        sb.append(" the String");
        sb.append(" in String Builder");

        String result=sb.toString();
        System.out.println(result);

    }
}
