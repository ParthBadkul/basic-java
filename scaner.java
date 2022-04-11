import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class scaner{
public static void main(String[] args) {
    // Scanner cs = new Scanner (System.in);
    //    System.out.println ("Enter the number");
    //  int num = cs.nextInt ();
    //  int reminder, Largest= 0;
    // while (num > 0)
    // {
    //     reminder = num % 10;
    //     if (Largest< reminder) 
    //     {
    //         Largest= reminder;
    //     }
    //     num = num / 10;
    // }
    // System.out.println("\nThe Largest Digit is "+Largest);

    //    cs.close();

     // User input for the string to know length
     Scanner sc = new Scanner(System.in);
     System.out.println("Please enter the string to know the length:");

     String userInput = sc.nextLine();

     // We must close input stream
     sc.close();


      
     // Replacing whitespace to empty as we are concerned about alphabets
     userInput= userInput.replaceAll(" ", "");
  
      
     // Creating a String array containing each character of user input
     String [] inputStringArray = userInput.split("");
      
      
     // Creating a String array containing alphabets
     String alphabets[]= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
      
      
     // Creating HashSet to find intersections
     HashSet<String> s1 = new HashSet<String>(Arrays.asList(inputStringArray));
     HashSet<String> s2 = new HashSet<String>(Arrays.asList(alphabets));
      
     System.out.println("User Input in set :"+s1);
     System.out.println("Alphabets :"+s2);
      
     // Intersection of above sets
     s2.removeAll(s1);
    
      
      
     // Missing alphabets
     System.out.println("Missing alphabets :"+ s2);
 
}


}