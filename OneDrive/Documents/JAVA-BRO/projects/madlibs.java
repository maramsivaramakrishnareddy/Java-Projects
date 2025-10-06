package projects;
import java.util.Scanner;

public class madlibs {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter the adjective (Description): ");
               adjective1 = sc.nextLine();
        
        System.out.print("Enter a noun (animal or person): ");
               noun1 = sc.nextLine();

        
        System.out.print("Enter an adjecive (description) :");
                adjective2 = sc.nextLine();

        
        System.out.print("Enter a verb end eith -ing form: suspecious");
                verb1= sc.nextLine();

        
        System.out.print("Enter the adjective (Description): ");
                adjective3 = sc.nextLine();


        System.out.println("today i went a "+adjective1 +" zo");
        System.out.println(" In an exhbit. I saw a " + noun1 +" .");
        System.out.println(noun1 +" was" + adjective2 +" and " + verb1 + "!");
        System.out.println("I was "+ adjective3 +"!");















        sc.close();
        
    }

    }

    

