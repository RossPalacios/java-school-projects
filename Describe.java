// Ross Palacios
// 9.16.2024
// CSCI 1302 Section 008
// Instructor: Dr. Harris
//
// Desribe.java
//
// Physical attribute Printer
// This Program initializes multiple variables that print my name, weight, and height and convert weight from lbs
//to Kg, and take the remainder of inches and add them to the feet measurement.


public class Describe {
   public static void main(String [] args) {
   
      String name = "Ross Palacios";
      int inches = 71;
      int weightInLbs = 240;
      double weightConversion = weightInLbs/2.205;//this number comes from Google, dividing lbs by 2.205 gives kg's.
      int feet = (inches/12);// to get feet, divinding by 12 is necessary according to Google.
      int leftoverInches = inches % 12;
      
      System.out.println("Hi, my name is " + name + " \n" + "I am " + feet + 
                         " feet and " + leftoverInches + " inches tall.\n" + "I weigh " 
                         + weightInLbs + " lbs or " + weightConversion + " kilograms.");
   } 
}