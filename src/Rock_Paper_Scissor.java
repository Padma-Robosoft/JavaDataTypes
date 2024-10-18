import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor{
    public static void main(String[] args) {

        String[] computerChoice={"rock", "paper", "scissor"};

        Scanner sc= new Scanner(System.in);
        Random rd=new Random();

        System.out.println("Enter your choice(rock, paper, scissor)");
        String userchoice = sc.nextLine();


        int computerCh= rd.nextInt(3);
        System.out.println("The choice of the computer is "+computerCh);

        if(!userchoice.equals("rock") &&!userchoice.equals("paper")&&!userchoice.equals("scissor")){
            System.out.println("Invalid Choice");
        }
        else if((userchoice.equals("rock")&&computerChoice[computerCh].equals("scissor"))||
                (userchoice.equals("paper")&&computerChoice[computerCh].equals("rock"))||
                (userchoice.equals("scissor")&&computerChoice[computerCh].equals("paper"))){
            System.out.println("Congratulation padma! You Won!");
        }
        else if(userchoice.equals(computerChoice[computerCh])){
            System.out.println("Its a tie");
        }
        else{
            System.out.println("computer won");
        }






    }
}
