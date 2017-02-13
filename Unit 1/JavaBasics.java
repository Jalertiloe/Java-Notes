/**
 * Jasmine Brown
 * Practice with basic java concepts, primitive data types
 */
public class JavaBasics {
    
  public static void main(String[] args) { 
    System.out.println("Java is awesome!");
    System.out.println("Java Coding Conventions:");
    System.out.println("\tcamelCase");
    System.out.println("\tindentations");
    System.out.println("\tcapitalize class names");
    System.out.println("Java is case sensitive...price is not the same as Price");
    //single comment line
    System.out.println("Variable identifier names:");
    System.out.println("\tcannot start with a number"+"\n\tcan only contain letters, numbers, underscores"+ "\n\tcannot be a Java keyword");
    System.out.println("Make variable names meaningful");
    System.out.println("Good ones are: hourlyRate, taxRate, test_Average, test1");
    System.out.println("Bad ones: hourly Rate, tax$Rate, 1stTest");
    /**NOTES
     * 8 primative types(we use four)
      * int - pos, neg whole numbers and 0 [byte, short, long]
      * double - real numbers(decimals) [float]
      *       double amt 50; = 50.0
      * boolean - true or false
      * char - single character in single quotes
      *       'a'
      * Declaring variables:
      * int days; [type \ name]   int days,mohths;
      * double balance;
      * Assignment statements:
      * days = 30 [identifier = value]
      * int days = 30;
      * don't double int for same variable
      * boolean sunny = true;
      * if(something happens)
      *    ~~~~~~~~~
      *    sunny=false;
      */
    //int
    int day1  =22;
    int day2;
    System.out.println(day1);
    System.out.println("Number of customers on day 1 were "+ day1+ ".");
    day2 = 36;
    //String concatenation
    System.out.println("Number of customers on day 1 and 2 were "+ day1 + day2+".");
    System.out.println("Number of customers on day 1 and 2 were "+ (day1 + day2) + ".");
    System.out.println( day1 + day2 + " were the number of customers on day 1 and 2.");
    //double
    double amt1 = 34.56;
    double amt2 = 45;
    System.out.println(amt1);
    System.out.println(amt2);
    //boolean
    boolean stop,go;
    stop = true;
    go = false;
    System.out.println(stop);
    stop = go;
    System.out.println(stop);
    //char
    char alpha1 = 'A';
    char alpha2 = 97;
    System.out.println(alpha1 + " and " + alpha2);
    char sum = 'B' + 1;
    System.out.println(sum);
    System.out.println('B' + 1);
    //Strings and Outputs
    System.out.print("Hello");
    System.out.println("There");//creates a new line after it
    int temp = 60;
    System.out.println("It is " + temp + " degrees today.");
    System.out.println();
    double cost = 5.34;
    System.out.println("That item costs $" + cost + ".");
    //string escape sequences
    //return and tab tab == 8 spaces
    System.out.println("How are you today?\n\tAre you feeling ok?");
    System.out.println("Name\t\tGrade\tClass\n\nElizabeth\t12\tAP CS"+
                       "\nNick\t\t12\tAP CS\nSuzanne\t\t10\tAP CS");
    //quotes
    System.out.println("He said, \"Have a nice day!\"");
    //backslash
    System.out.println("\"Have a \\ great\\ \\\\weekend\\\\\"");
    //Logic
    /* !(Not), && (And), ||(or)
     * Truth Tables
     * !
     * A|!A
     * ----
     * T|F
     * F|T
     * &&
     * A|B|A&&B
     * --------
     * T|T|T
     * T|F|F
     * F|T|F
     * F|F|F
     * ||
     * A|B|(A||B)
     * --------
     * T|T|T
     * T|F|T
     * F|T|T
     * F|F|F
     * Order
     * And comes first
     * DeMorgan's Law
     * !(A>B||C<=D)
     * A<=B&&C>D
     */
    //constants
    final int year = 2016;
    System.out.println(year);
    //year = 2017; -cannot change a constant
    
    //mixing data types
    int num1 = 6;
    double num2 = 3.05;
    System.out.println(num2);
    num2 = num1;//changing an int into a double
    System.out.println(num2);
    //cannot convert from double to int num1 = num2;
    System.out.println(num1);
    num1 = 100;
    char letter = 'a';
    num1 = letter;
    System.out.println(num1);
    
  }
  
   /* ADD YOUR CODE HERE */
}