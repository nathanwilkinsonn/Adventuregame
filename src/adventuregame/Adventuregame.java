 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;
import java.util.Scanner;
/**
 *
 * @author nawil9219
 */
public class Adventuregame {

    
    
    public static void main(String[] args) {
    
        
   //variables and scanner object
  Scanner keyboard = new Scanner(System.in);
  String Start, Share, Gov, Charity;
  //Prompt for user input
System.out.println( " You just won the lottery ! ");
System.out.println("  ");
System.out.println( " Do you tell your family about your winnings? ");
System.out.print( "- ");
Start = keyboard.next();

//first set of "if" statements and possible ending
if (Start.equalsIgnoreCase("no")){
  System.out.println("Your family is unable to leech off your success, leaving you able to lead a happy life with your winnings.");
  System.exit(1);
}
if (Start.equalsIgnoreCase("yes")){
{System.out.println("Your family seems happy for you, but you can feel their jealousy. You think to yourself that you shouldn't have told them. Do you share your money with them? ");}
System.out.print("-  ");
}
Share = keyboard.next();


//second set of "if" statements and two possible endings
    if (Share.equalsIgnoreCase( "yes" ))
{System.out.println("You then evenly distribute your money, leaving everyone with the same amount. Would you like to give the rest of your wealth to charity? 'Yes' or 'No'?");}
System.out.print("-  ");
Charity = keyboard.next();

        if (Charity.equalsIgnoreCase("Yes"))
    {System.out.println("  ");
    System.out.println("You are broke! You then add to North Americas homeless population.");
     System.exit(1); 
    }

        else if (Charity.equalsIgnoreCase("No"))
    {System.out.println("  ");
    System.out.println("You live a somewhat happy life, with what is left of your winnings.");
    System.exit(1);
    }

        //last set of "if" statements and last possible endings
else if (Charity.equalsIgnoreCase( "maybe" ))
{System.out.println("The government seizes most of your assets to due to tax fraud. Do you go to court to fight it?");}
System.out.print("-  ");
Gov = keyboard.next();

        if (Gov.equalsIgnoreCase("yes"))
    {System.out.println("  ");
    System.out.println("You can't afford a good lawyer, and the court-appointed lawyer convinces you to plead not guilty by reason of insanity, and you spend the rest of your days in an asylum.");
      System.exit(1);
    }

        else if(Gov.equalsIgnoreCase("no"))
    {System.out.println("  ");
    System.out.println("You get to live a somewhat happy life, with what is left of your winnings, as your family and government took the rest, but you find a small comfort in the fact that your family is taken care of. ");}

        
        
        
    }
    
}
