import java.util.Arrays;

public class practice_data_types {
    public static void main(String[] args) {
        //single values
        int i=44;
        short s=34;
        long l=3456789;
        double d=4.5678;
        float f=6.678f;
        byte b=8;
        char c='p';
        boolean a=true;
        //store memory address
        String str="padma";
        int [] arr ={1,2,3};

        System.out.printf("integer: %d \n",i);
        System.out.println("float: "+f);
        System.out.println("double: "+d);
        System.out.println("byte: "+b);
        System.out.println("short: "+s);
        System.out.println("long: "+l);
        System.out.println("char: "+c);
        System.out.println("String: "+str);
        System.out.println("boolean: "+a);
        System.out.println("Array: "+ Arrays.toString(arr));


    }
}
