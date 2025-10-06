package projects;
import java.util.Scanner;
public class calc {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result;

        System.out.print("enter the first num: ");
        num1 =  sc.nextDouble();

         System.out.print("enter the operator(+,-,*,/,^): ");
         operator = sc.next().charAt(0);

            System.out.print("enter the second num: ");
            num2 = sc.nextDouble();
         switch(operator){
            case '+' ->result=num1+num2;
            case '-' ->result=num1-num2;
            case '*' ->result=num1*num2;    
            case '/' ->result=num1/num2;
            case '^' ->result=Math.pow(num1,num2);

            default -> {
                System.out.println("invalid operator");
                return;
            }
         }

            System.out.println("the result is: "+result);

         sc.close();


    }
    
}
