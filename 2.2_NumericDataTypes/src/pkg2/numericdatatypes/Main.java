
package pkg2.numericdatatypes;
import java.util.Scanner;

// @author: Fifi Leul
public class Main 
{

    public static void main(String[] args) 
    {
      /*Lesson Challenge:
            You work for a wage of 5 dollars an hour, and get taxed 7.5 percent on that wage. Represent how many hours you have to work to make 50 dollars. 
            Make sure to ...
                * Use at least 2 variables
                * Print your final answer. */
        
      double goalSalary = 50;
      double wage = 5;
      double percentage = .075;
      double tax = wage * percentage;
      double taxedWage = wage - tax;
      
      double hoursNeeded = goalSalary / taxedWage;
      String formattedHours = String.format("With a wage of %.0f dollars an hour and a tax of %.0f, you need to spend %.0f hours to make %.0f", wage, percentage, hoursNeeded, goalSalary);
      System.out.println(formattedHours);
      
    }
    
}
