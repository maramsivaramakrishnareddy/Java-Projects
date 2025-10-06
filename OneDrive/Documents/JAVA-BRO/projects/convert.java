package projects;
import java.util.Scanner;
public class convert {

    public static void main(String[] args){
        double temp;

        Scanner sc = new Scanner(System.in);
        double newtemp;
        String unit;

        System.out.print("enter the temperature: ");
        temp = sc.nextDouble();

        System.out.print("enter the unit (C/F): ");
        unit = sc.next();

        newtemp = (unit.equalsIgnoreCase("C")) 
                    ? (temp * 9 / 5) + 32     // C → F
                    : (temp - 32) * 5 / 9;    // F → C


       System.out.println(newtemp);



            sc.close();

    }
    
}
