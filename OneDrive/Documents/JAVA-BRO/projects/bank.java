package projects;
import java.util.Scanner;
public class bank {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

    double balance=0;
    int choice;
    boolean isReturn = true;
    while(isReturn){
    System.out.println("**************");
    System.out.println("Banking Program1");
    System.out.println("**************");

    System.out.println("1--Show Balance");
    System.out.println("2--Deposit");
    System.out.println("3--WithDraw");
    System.out.println("4--exit");
    System.out.println("**************");
    System.out.print("Enter Your choice:");
    choice = sc.nextInt();

    switch(choice) {

        case 1 -> ShowBalance( balance);
        case 2 -> balance += deposit();
        case 3 -> balance -= withdraw(balance);
        case 4 -> isReturn = false;
        default -> System.out.print("Invalid Choice");

    }
    }
    System.out.println("********");
    System.out.println("Thank you! Have a Nice Day");
    System.out.print("********");
    sc.close();
    }
    static void ShowBalance(double balance){
        System.out.printf("$%.2f\n",balance);
    }
    static double deposit(){
                double amount;
                System.out.print("Enter Amount to be deposited:");
                amount = sc.nextDouble();

                if(amount<0){
                    System.out.print("Amount Could not be Negative\n");
                    return 0;
                }
                else{
                    return amount;

                }
     }

        static double withdraw(double balance) {
                    double amount;
                    System.out.print("enter amount to be withdraw: ");
                    amount = sc.nextDouble();
                    if (amount > balance) {
                        System.out.println("INSUFFICIENT FUNDS..");
                        return 0;
                    } else if (amount < 0) {
                        System.out.println("Amount Could not be Negative");
                        return 0;

                    } else {
                        return amount;
                    }


    }




}
