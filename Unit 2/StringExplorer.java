/**
 *Jasmine Brown
 * String Worksheet: Using string methods to complete tasks
 */
public class StringExplorer {
  
  
  public static void main(String[] args) { 
    //#1
    String hotel = "Hyatt";
    System.out.println(hotel);
    //#3
    String changeUp = hotel.replace('H','W');
    System.out.println(changeUp + " replace method");
    //#4&5
    int len;
    len = hotel.length();
    System.out.println(len + " length method");
    //#6
    String word  =hotel.substring(2,4);
    System.out.println(word + " substring method");
    //#7
    int compare = hotel.compareTo("Hilton");
    System.out.println(compare + " compare to method");
    //#8
    String fullName = hotel.concat(" Regency");
    System.out.println(fullName + " concat method");
    //#9
    fullName = fullName.toUpperCase();
    System.out.println(fullName + " Upper case method");
    //#10
    char letter = hotel.charAt(1);
    System.out.println(letter + " char at method");
    //#11
    hotel = hotel.toLowerCase();
    System.out.println(hotel +" lower case method");
    //#12
    String sub1 = fullName.substring(8);
    System.out.println(sub1 + " substring method");
    //#13
    boolean trueOrfalse = fullName.equals("hyatt regency");
    System.out.println(trueOrfalse + " equals method");
    //#14
    boolean trueOrfalse2 = fullName.equalsIgnoreCase("hyatt regency");
    System.out.println(trueOrfalse2 + " equal ignore case method");
    //#15
    fullName = "Hyatt Regency";
    System.out.println(fullName);
    //#16
    int search = fullName.indexOf("ency");
    System.out.println(search + " index of method");
    //#17
    int search2 = fullName.indexOf("e");
    System.out.println(search2+ " index of method");
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
