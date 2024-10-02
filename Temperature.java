import java.util.Scanner;
// Ross Palacios
// 9.26.2024
// CSCI 1302 Section 008
// Instructor: Dr. Harris
//
// Temperature.java
//
// farenheit to celsius converter
// This Program gets user input for a number in farenheit and converts it to celsius.

public class Temperature {
   public static void main(String [] args) {
            
      Scanner temp = new Scanner(System.in);
      System.out.println("Would you like to convert celsius to farenheit or vice versa? \ntype celsius to start with celsius, and farenheit for farenheit. ");
      String choice = temp.nextLine();
      
      if(choice.equals("celsius") || choice.equals("Celsius")) {
      
         System.out.println("what temp farenheit would you like to convert? ");
         double farenheit = temp.nextDouble();
         double celsius = (5.0/9.0) * (farenheit - 32);//conversion for farenheit to celsius according to google.
         System.out.println("your temperature in celsius is " + celsius );
      
      } else if(choice.equals("farenheit") || choice.equals("Farenheit")) {

         System.out.println("what temp celsius would you like to convert? ");
         double celsius = temp.nextDouble();
         double farenheit = celsius * 1.8 + 32;//conversion for celsius to farenheit according to google.
         System.out.println("your temperature in farenheit is " + farenheit);
      
      }
        
         
   
   }
}             
