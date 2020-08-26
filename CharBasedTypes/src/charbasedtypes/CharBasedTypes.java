/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charbasedtypes;
import java.util.Scanner;
/**
 *
 * @author mercyougothis
 */
public class CharBasedTypes 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give me a noun");
    	String noun1 = scanner.nextLine();
        
        System.out.println("Give me a verb");
        
        String verb1 = scanner.nextLine();
        
        System.out.println("Give me a color");
        String color1 = scanner.nextLine();
        
        System.out.println("Give me another noun");
        String noun2 = scanner.nextLine();
        
        System.out.println("Give me an adjective");
        String adj1 = scanner.nextLine();
        
        System.out.println("Give me another color");
        String color2 = scanner.nextLine();
        
        System.out.println("Give me another color");
        String color3 = scanner.nextLine();
        
        System.out.println("Give me another noun");
        String noun3 = scanner.nextLine();
        
        System.out.println("Give me another verb");
        String verb2 = scanner.nextLine();
        
        System.out.println("Give me another color");
        String color4 = scanner.nextLine();
        
        System.out.println("Give me another color");
        String color5 = scanner.nextLine();
        
        System.out.println("Give me a number");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Give me another noun");
        String noun4 = scanner.nextLine();
        
        System.out.println("Give me a nationality");
        String nationality  = scanner.nextLine();
        
        
        String madLib = String.format("Every year in %s, people celebrate Irish heritage by %s the color %s.\n"
                    + "Some people wear hats with a %s on them. "
                    + "Others %s %s ties, or %s colored %s,\nand pins that say \" %s me, I'm Irish!\" are popular."
                    + "The color %s is\nassociated with St.Patrick's Day partly because \nIrelands nickname is \"The %s Isle\","
                    + "and also because of the %d leaf %s,\n a symbol of  %s luck.", noun1, verb1, color1, noun2, adj1, color2,
                                                                                    color3, noun3, verb2,color4, color5, num1, noun4, nationality);
        
        System.out.println(madLib);
        

        /*
            double targetSalary = 50;
            double wage = 5;
            double tax = wage * .075;
            double taxedWage = wage - tax;

            double neededHours = targetSalary / taxedWage;
            System.out.println(neededHours);
        */
       
        
    }
    
}
