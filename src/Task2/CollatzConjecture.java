package Task2;

import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Positive Integer: ");
        int n=sc.nextInt();

        if(n<=0){
            System.out.println("Please enter a Valid Positive Integer");
        }else{
            System.out.println("Collatz Conjecture Sequence Starting from: "+n);

            while(n!=1) {
                System.out.print(n + " ");
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = (n * 3) + 1;
                }
            }
            System.out.print(n);
        }
    }
}
