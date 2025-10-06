package projects;
import java.util.Scanner;
import java.util.Random;

public class diceRoller {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total=0;

        System.out.print("Enter the No of dice roll: ");
        numOfDice = sc.nextInt();

        if(numOfDice>0){
           for(int i =0; i<numOfDice;i++){
               int roll = random.nextInt(1,7);
               printDie(roll);
               System.out.println("You Rolled:"+roll);
               total += roll;
           }
            System.out.print("Total =  "+total);
        }
        else{
            System.out.print("No Of dice must be Greater than Zero");

        }
        sc.close();

    }
    static void printDie(int roll){
              String dice1 = """
                
                 ----------
                |           |
                |     ●     | 
                |           |
                  __________
                """;

        String dice2= """
                
                 ----------
                |           |
                | ●       ● | 
                |           |
                  __________
                """;
        String dice3= """
                
                 ----------
                | ●         |
                |     ●     | 
                |         ● |
                  __________
                """;
        String dice4= """
                
                 ----------
                | ●       ● |
                |           | 
                | ●       ● |
                  __________
                """;
        String dice5= """
                
                 ----------
                | ●       ● |
                |     ●     | 
                | ●       ● |
                  __________
                """;
        String dice6= """
                
                 ----------
                | ●       ●  |
                | ●       ●  | 
                | ●       ●  |
                  __________
                """;

            switch(roll){
                case 1->System.out.print(dice1);
                case 2->System.out.print(dice2);
                case 3->System.out.print(dice3);
                case 4->System.out.print(dice4);
                case 5->System.out.print(dice5);
                case 6->System.out.print(dice6);
                default -> System.out.print("Invalid Row");
            }


    }
}
