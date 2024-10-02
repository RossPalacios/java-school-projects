import java.util.Scanner;
// Ross Palacios
// 9.30.2024
// CSCI 1302 Section 008
// Instructor: Dr. Harris
//
// Legal.java
//
// Voting/Driving Checker
// This program uses scanners to get a user's name and age and determines if they can drive, and/or vote.
public class Legal {
   public static void main(String [] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("What is your name ");
      
      String name = sc.nextLine();
      
      System.out.println("ok " + name + " How old are you? ");
      
      int age = sc.nextInt();

      switch(age) {
      
         default: 
            if(age < 16)
               System.out.println("You can't drive. ");
            else if(age >= 25) 
               System.out.println("You can do pretty much anything. ");
         break;
         
         case 16: case 17:
            System.out.println("You can drive but not vote.");
         break;
         
         case 18: case 19: case 20: case 21:
         case 22: case 23: case 24:
            System.out.println("You can vote and drive. ");
         break;
      
      }

   
   }
}          