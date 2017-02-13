/**
 * Auto Generated Java Class.
 */
public class MultiMethodPractice {
  
  
  public static void main(String[] args) { 
    message1();
    message2();
    message1();
    System.out.println("Main complete");
  }
  
  public static void message1(){
    System.out.println("Hello There...this is message one.");
  }
  public static void message2(){
    System.out.println("Now this is message two.");
    message1();
    System.out.println("Goodbye from message two.");
  }
}
