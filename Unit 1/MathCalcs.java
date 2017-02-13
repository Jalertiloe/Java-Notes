/**
 *Jasmine Brown
 */
public class MathCalcs {
  
  
  public static void main(String[] args) { 
    //Declaring Variables-(Type identifier value)
    //int num2;
    //Assignment Statement 
    //num2=30;
    System.out.println(35+25-23);
    System.out.println(35+25*2);
    System.out.println(7/2);//integer divison
    System.out.println(7.0/3.0);//float point division
    System.out.println(7%3);
    System.out.println(7.0%3);
    System.out.println(3%7);
    //type conversion
    //1. type casting
    System.out.println((double)3/2);
    System.out.println((double)(3/2));
    double sum;
    sum = 3/2;
    System.out.println(sum);
    sum = (double)3/2;
    System.out.println(sum);
    //2. arithmetic promotion
    System.out.println(7.0/2);
    System.out.println("The answer is " + 24 + 25);
    //3. assignment conversion
    int startValue = 3;
    double targetValue = startValue;
    double amount = 54.67;
    double newAmount;
    newAmount = (int)amount;//decimal places are removed (truncated)
    System.out.println(newAmount);
    /*Increment and decrement opperators
    int count = 0;
    count++; (count +1)
    total = ++count;
    count--; (count -1)
    total = --count
    j=j+5
    j+=5
    j-=5
    j=j-5
    Class object is instance of class
    ClassName objectName =  new`everyclass except for string` ClassName(params);
    declaring           creating
    String first_name = new String ("Suzanne")
    String first_name = "Suzanne"
    */
    //currency example
    double wage = 10.70;
    double hours = 33.75;
    double totalPay = wage*hours;
    System.out.println(totalPay);
    //get 2 decimal places and round up
    totalPay = Math.round(totalPay*100.0)/100.0;
    System.out.println(totalPay);
  }
  
  /* ADD YOUR CODE HERE */
  
}
