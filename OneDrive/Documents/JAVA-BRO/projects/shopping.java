package projects;
import java.util.Scanner;

public class shopping{


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

String item;
double price;
int quantity;
char currency = '$';
double total;

    System.out.print(" which item to Buy : ");
     item = sc.nextLine();
    System.out.print("What is the price for each ? :  ");
     price = sc.nextDouble();
    System.out.print("how many items do u want: ");
    quantity = sc.nextInt();
     
    total = price * quantity;

    System.out.print("the total price is : "+currency+ " "+ total);

    sc.close();


    
}
}