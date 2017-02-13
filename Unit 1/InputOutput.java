/**
 * Jasmine Brown
 * Working with taking input from user
 */
import java.util.Scanner;//need anytime you ask for input
public class InputOutput {
  
  
  public static void main(String[] args) { 
    //create an instance (object) of the Scanner class
    Scanner in = new Scanner(System.in);//in can be changed to input variable of choice as long as constant
    String first_name;
    int age,grade;
    double gpa;
    System.out.println("Enter your first name:");
    first_name=in.next();// .next = one word no spaces
    System.out.println("Enter your age:");
    age= in.nextInt();
    System.out.println("Enter your grade:");
    grade = in.nextInt();
    System.out.println("Enter your GPA:");
    gpa= in.nextDouble();
    in.nextLine();// this allows below to work after nextInt()/nextDouble()also multiple words
    System.out.println("Enter your full school name:");
    String school = in.nextLine();
    
    String className="";//curly braces not needed
    if(grade == 9){
      className = "Freshman";
    }
    if(grade == 10){
      className = "Sophmore";
    }
    if(grade == 11){
      className = "Junior";
    }
    if(grade == 12){
      className = "Senior";
    }
    System.out.println("Your name is " + first_name + ", you are " + age + " years old, you have a gpa of " + gpa + " and you attend " + school + 
                       ". You are a " + className + ".");
  }
  
  /* ADD YOUR CODE HERE */
  
}
