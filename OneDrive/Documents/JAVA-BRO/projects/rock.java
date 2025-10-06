package projects;
import java.util.Scanner;
import java.util.Random;
public class rock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

       do{
           System.out.print("Enter your Move (rock,paper,scissors): ");
           playerChoice = sc.nextLine().toLowerCase();

           if(!playerChoice.equals("rock") &&
                   !playerChoice.equals("paper") &&
                   !playerChoice.equals("scissors")){
               System.out.println("Invalid Choice");
           }

           computerChoice = choices[random.nextInt(3)];
           System.out.println("Computer Choice: " + computerChoice);

           if(playerChoice.equals(computerChoice)){
               System.out.println("It's a tie!");

           }
           else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
               System.out.println("You Win!");

           }
           else{
               System.out.println("You Loose!");

           }

           System.out.print("Play gain(yes/no): ");
           playAgain = sc.nextLine().toLowerCase();






       }while(playAgain.equals("yes"));

       System.out.print("Thanks For Playing!");








        sc.close();

    }
}
