package PracticePrograms;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals=new Stack<>();
        animals.push("Lion");
        animals.push("TIger");
        animals.push("Zebra");
        System.out.println(animals.search("TIger"));

        System.out.println(animals.contains("Lion"));
        System.out.println("Stack: "+animals);
        System.out.println(animals.peek());
        System.out.println("The popped element is "+animals.pop());
        System.out.println("The stack elements are: "+animals);
    }
}
