/**
 * Jasmine Brown
 * Calculating the total profit of a gas station.
 */
import java.util.Scanner;
public class GasStation {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    double gasSold;
    System.out.println("What is the revenue from gas sold?");
    gasSold = in.nextDouble();
    double gasCost;
    System.out.println("What is the cost of gas?");
    gasCost = in.nextDouble();
    double dailyExpense;
    System.out.println("What are your daily expenses?");
    dailyExpense = in.nextDouble();
    double profit = gasSold - gasCost  - dailyExpense;
    profit = Math.round(profit*100.0)/100.0;
    System.out.println("Your gas sold amount is "+ gasSold+". The cost of gas is "+ gasCost+". Your daily expenses are "+dailyExpense+". Your profit is "+ profit +".");
  }
  
  /* ADD YOUR CODE HERE */
  
}
