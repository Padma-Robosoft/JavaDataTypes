package Task5.Question4;

public class DefaultMethods {
    public static void main(String[] args) {
        String str="Default,Methods ";

        System.out.println("The Length of the String is: "+str.length());
        System.out.println("The replace of the String is: "+str.replace("Default","String"));
        System.out.println("The Character at index 4:"+str.charAt(4));
        System.out.println("Substring of (7,12): "+str.substring(7,12));
        // System.out.println("String value is "+str.getBytes());

        StringBuilder sb=new StringBuilder("Builder ");
        System.out.println("The Original String Builder is: "+sb);

        sb.insert(7," String");
        System.out.println("The String  After Inserting is: "+sb);

        sb.reverse();
        System.out.println("The String After Reverse: "+sb);

        StringBuffer sbf=new StringBuffer("Buffer");

        sbf.append(" String");
        System.out.println("The String After Appending: "+sbf);

        sbf.delete(0,4);
        System.out.println("The String After Deleting: "+sbf);

        /*
        String[] words=str.split(",");
        System.out.print("split:");
        for(String word: words){
            System.out.println(word);

         */
        }

    }

