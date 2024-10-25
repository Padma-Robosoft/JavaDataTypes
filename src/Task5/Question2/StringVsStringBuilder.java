package Task5.Question2;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        long startTimeString=System.currentTimeMillis();
        String result="";
        for(int i=0;i<100000;i++){
            result+="Hello";
        }
        long endTimeString=System.currentTimeMillis();

        System.out.println("The time taken by String is: "+(endTimeString-startTimeString)+"ms");

        long startTimeStringBuilder=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<100000;i++){
            sb.append("Hell");
        }
        long endTimeStringBuilder=System.currentTimeMillis();

        System.out.println("The time taken by String Builder is: "+(endTimeStringBuilder-startTimeStringBuilder)+"ms");
    }
}
