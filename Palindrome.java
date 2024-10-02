import java.util.Scanner;
// Ross Palacios
// 9.26.2024
// CSCI 1302 Section 008
// Instructor: Dr. Harris
//
// Palindrome.java
//
// palindrome detector
// This program checks whether or not a user inputed number is a palindrome, it only works with three digit numbers though.

public class Palindrome {
   public static void main(String [] args) {
   
      Scanner sc = new Scanner(System.in);
      
      System.out.println("what is a three digit number you would like to check as a palindrome? ");
      
      int palindrome = sc.nextInt();  
      int firstStep = palindrome/100;    
      int secondStep = palindrome % 10;
      
      if(firstStep == secondStep) {
      
         System.out.println("That is a palindrome.");
         
      }else if(firstStep != secondStep) {
      
         System.out.println("Sorry, that is not a palindrome.");
      
      }
      
   }
}             
