package Task6.Problem1;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateChecker {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("apple");
        list.add("orange");
        list.add("grapes");
        list.add("apple");

        HashSet<String> set =new HashSet<>();
        boolean hasDuplicate=false;

        for(String item:list){
            if(!set.add(item)){
                hasDuplicate=true;
                break;
            }
        }
        if(hasDuplicate){
            System.out.println("This list has a dublicate item");
        }
        else{
            System.out.println("This list doesn't have a dublicate item");
        }

    }
}
