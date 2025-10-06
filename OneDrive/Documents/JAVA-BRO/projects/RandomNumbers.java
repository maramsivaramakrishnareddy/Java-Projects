package projects;
import java.util.Random;
import java.util.Scanner;
public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 10;
        int randomNumber = random.nextInt(min,max + 1); 

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.printf("Guess a number between %d and %d:\n ",min,max);

        do{
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

        

        if(guess < randomNumber){
            System.out.println("Too low! Try again.");
        } else if (guess > randomNumber){
            System.out.println("Too high! Try again.");
        } else {
            System.out.println("Congratulations! You've guessed the number " + randomNumber + " in " + attempts + " attempts.");
        }
        
    }while(guess != randomNumber);
       

        scanner.close();
        
    }


    
}
