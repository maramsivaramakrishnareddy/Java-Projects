package projects;
import java.util.Scanner;
public class compound {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double p;
    double r;
    int years;
    double amount;
    int time;


    System.out.print("enter the priciple: ");
    p = sc.nextDouble();


    
    System.out.print("enter the rate: ");
     r = sc.nextDouble();



    
    System.out.print("enter the years ");
    years = sc.nextInt();
    System.out.print("enter the time ");
     time = sc.nextInt();
         amount = p*Math.pow((1+(r/(time*100))),time*years);
        System.out.println("the amount after " +years + " is :$" + amount);


    sc.close(); 
    }
}
