package Task2;

import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter a String");
        String input=sc.nextLine();

        int vowelsCount=0;
        int consonantsCount=0;

        input=input.toLowerCase();

        for(int i=0;i<input.length();i++) {
            char ch = input.charAt(i);//access individual characters

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantsCount++;
            }
        }
            System.out.println("The number of Vowels in the String is: "+vowelsCount);
            System.out.println("The number of Consonants in the String is: "+consonantsCount);
        }
    }

