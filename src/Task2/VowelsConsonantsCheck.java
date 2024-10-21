package Task2;

import java.util.Scanner;

public class VowelsConsonantsCheck {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a Character");
        char inputChar=sc.next().charAt(0);//gets the first character
        checkCharacter(inputChar);

    }
    public static void checkCharacter(char ch){
        char lowerCh=Character.toLowerCase(ch);

        switch(lowerCh){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch+ " its a Vowel");
                break;
            default:
                if(ch>='a'&&ch<='z'){
                    System.out.println(ch+ " its a Consonant");
                }
                else{
                    System.out.println("Its not a Alphabet");
                }

        }
    }
}
