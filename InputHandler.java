import java.util.*;
public class InputHandler {
 
  public static int getInt() {
   Scanner input = new Scanner(System.in);
   int n = 0;
   boolean validIn = false;
   System.out.print("Please enter an integer: \n");
   do {
        if (input.hasNextInt()){     
         n = input.nextInt();
         validIn = true;
        } else {
         System.out.println("Please enter an Integer: ");
         input.nextLine();
        }
        } while (validIn == false);  
   return n;
  }
  
  public static Double getDouble() {
   Scanner input = new Scanner(System.in); 
   Double s = 0.0;
   boolean validIn = false;
   System.out.print("Please enter a Double: \n");
   do {
     if (input.hasNextDouble()) {
       s = input.nextDouble();
       validIn = true;
     } else {
      System.out.println("Please enter a Double: ");
      input.nextLine();
     }
     } while (validIn == false);
     return s;
  }
  
  public static char getChar() {
   Scanner input = new Scanner(System.in); 
   char c = 'a';
   boolean validIn = false;
   System.out.print("Please enter a Character: \n");
   do {
     String s = input.next();
     if (s.length() == 1) {
       c = s.charAt(0);
       validIn = true;
     } else {
      System.out.println("Please enter a Character: ");
      input.nextLine();
     }
     } while (validIn == false);
     return c;
  }
    
  public static int getOdd() {
   Scanner input = new Scanner(System.in);
   int n = 0;
   boolean validIn = false;
   System.out.print("Please enter an odd integer: \n");
   do {
        if (input.hasNextInt()){     
         n = input.nextInt();
         if (n % 2 != 0) {
          validIn = true;
         }
        } else {
         System.out.println("Please enter an odd Integer: ");
         input.nextLine();
        }
        } while (validIn == false);  
   return n;
  }
  
  public static int getEven() {
   Scanner input = new Scanner(System.in);
   int n = 0;
   boolean validIn = false;
   System.out.print("Please enter an odd integer: \n");
   do {
        if (input.hasNextInt()){     
         n = input.nextInt();
         if (n % 2 == 0) {
          validIn = true;
         }
        } else {
         System.out.println("Please enter an odd Integer: ");
         input.nextLine();
        }
        } while (validIn == false);  
   return n;
  }
  
  public static char getYN() {
   Scanner input = new Scanner(System.in); 
   char c = 'a';
   boolean validIn = false;
   System.out.print("Please enter Y or N: \n");
   do {
     String s = input.next().toUpperCase();
     if (s.length() == 1 || s.equals("YES") || s.equals("NO") ) {
       c = s.charAt(0);
       if (c == 'Y' || c == 'N') {
       validIn = true;
       }
       else {
      System.out.println("Please enter Y or N: ");
      input.nextLine();
     }
     } else {
      System.out.println("Please enter Y or N: ");
      input.nextLine();
     }
     } while (validIn == false);
     return c;
  }
  
  public static Float getFloat() {
   Scanner input = new Scanner(System.in); 
   Float s = new Float(0.0);
   boolean validIn = false;
   System.out.print("Please enter a Float: \n");
   do {
     if (input.hasNextFloat()) {
       s = input.nextFloat();
       validIn = true;
     } else {
      System.out.println("Please enter a Float: ");
      input.nextLine();
     }
     } while (validIn == false);
     return s;
  }
}
