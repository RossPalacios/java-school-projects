import java.util.Scanner;
// Ross Palacios
// 9.30.2024
// CSCI 1302 Section 008
// Instructor: Dr. Harris
//
// Quiz.java
//
// short quiz printer.
// This program gives the user a quiz and takes user input to check for correct answers.
public class Quiz {
   public static void main(String [] args) {

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Please answer all questions with their respective numbers, rather than words.\n");
      System.out.println("Q1) What is the capital of Alaska? \n   1) Melbourne\n   2) Anchorage\n   3) Juneau");
      
      int firstQuestion = sc.nextInt();
      
      if(firstQuestion == 3)
         System.out.println("\nThat's Right!");
      else if(firstQuestion != 3)
         System.out.println("\nSorry, that is incorrect.");
         
         
      System.out.println("\nQ2) What is the data type of a variable that stores \"cat\"? \n   1) double\n   2) char\n   3) String");     
      
      int secondQuestion = sc.nextInt();
      
      if(secondQuestion == 3)
         System.out.println("\nThat's Right!");
      else if(secondQuestion != 3)
         System.out.println("\nSorry, that is incorrect.");
         
      System.out.println("\nQ3) What is the result of 9+6/3? \n   1) 5\n   2) 11\n   3) 15/3");     
      
      int thirdQuestion = sc.nextInt();
      
      if(thirdQuestion == 2)
         System.out.println("\nThat's Right!");
      else if(thirdQuestion != 2)
         System.out.println("\nSorry, that is incorrect.");


   }
}