package projects;
import java.util.Scanner;
public class weight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double weight;
        double newweight;
        int choice;


        System.out.println("Weight conversion programm");
        
        System.out.println("1-convert lbs to kgs");
        System.out.println("2-convert kgs to lbs");

        System.out.print("enter your choice: ");
        choice = sc.nextInt();

        if (choice==1){
            System.out.print("enter the weight in lbs: ");
            weight = sc.nextDouble();
            newweight = weight*0.45;
            System.out.println("the weight in kgs is: "+newweight);
        }
        else if (choice==2){
            System.out.print("enter the weight in kgs: ");
            weight = sc.nextDouble();
            newweight = weight/2.205;
            System.out.println("the weight in lbs is: "+newweight);
        }
        else{
            System.out.println("invalid choice");
        }


    
    }
}
