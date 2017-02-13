/**
 * Jasmine Brown
 */
public class MathClassPractice {
  
  
  public static void main(String[] args) { 
    //Math._________();
    //ABSOLUTE VALUE...return int unless double is used
    System.out.println(Math.abs(-3));
    //does math before appying 
    System.out.println(Math.abs(3.0 + -10));
    //SQUARE ROOT...return double
    System.out.println(Math.sqrt(16));
    System.out.println(Math.sqrt(15));
    System.out.println((int)(Math.sqrt(15)));
    
    //POWER...return a double
    System.out.println(Math.pow(3,3));
    System.out.println(Math.pow(3+5,2*2));
    System.out.println(7 - 2 + Math.log10(1000) + Math.log(Math.pow(Math.E, 5)));
    
    //MAX...return int unless double is used
    System.out.println(Math.max(-4,-5));
    System.out.println(Math.max(-4,-5.0));
    
    //MIN...return a int unless double is used
    System.out.println(Math.min(-4,-5));
    
    //ROUND...return an int 
    System.out.println(Math.round(3.4));
    System.out.println(Math.round(3.8));
    System.out.println(Math.round(3.67));
    
    //FLOOR...return a double
    System.out.println(Math.floor(3.999));
    
    //CEILING...return a double
    System.out.println(Math.ceil(6.0001));
    
    //RANDOM NUMBER...return a double from 0 to < 1.0
    System.out.println(Math.random());
    System.out.println(Math.random()*10);//from 0 to < 10.0
    System.out.println((int)(Math.random()*10));//from 0 to 9
    System.out.println((int)(Math.random()*11));//from 0 to 10
    System.out.println((int)(Math.random()*10+1));//from 1 to 10
    
    
    //working with money
    double totalPay = 345.678;
    //round method
    totalPay = Math.round(totalPay * 100.0)/100.0;//rounds to two places
    System.out.println(totalPay);
    //floor method
    double totalPay1 = 345.678;
    totalPay1 = Math.floor(totalPay1 * 100.0)/100.0;//trucates
    System.out.println(totalPay1);
  }
  
  /* ADD YOUR CODE HERE */
  
}
