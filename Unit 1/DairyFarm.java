/**
 * Jasmine Brown
 * Calculating the profit from a farm's milk production.
 */
import java.util.Scanner;
public class DairyFarm {
  
  
  public static void main(String[] args) { 
  Scanner in = new Scanner(System.in);
  double milkProduced;
  System.out.println("In gallons, how much milk do you produce?");
  milkProduced = in.nextDouble();
  double laborCost;
  System.out.println("How much does labor cost this week?");
  laborCost = in.nextDouble();
  double profit = (milkProduced*0.85)- laborCost;
  profit = Math.round(profit*100.0)/100.0;
  System.out.println("The amount of milk produced is " + milkProduced + ". " + "Your labor cost for the week is " +
                     laborCost + ". " + "Your profit is " + profit + ".");
  
  }
  
  /* ADD YOUR CODE HERE */
  
}
