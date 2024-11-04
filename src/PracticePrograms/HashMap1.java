package PracticePrograms;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {

        Map<String, Integer> number=new HashMap();
        number.put("one", 1);
        number.put("two",2);
        number.put("three",3);

        System.out.println(number);

        if(number.containsKey("one")){
            number.put("one",5);
        }
        number.putIfAbsent("four",4);
       // number.computeIfAbsent("five",)


        System.out.println(number);
    }
}
