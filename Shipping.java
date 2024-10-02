// Ross Palacios
// 9.16.2024
// CSCI 1302 Section 008
// Instructor: Dr. Harris
//
// Shipping.java
//
// Shipping Box Dimensions Printer
// This program takes the dimensions of a box and calculates the box's volume and surface area, then prints them.
public class Shipping {
   public static void main(String [] args) {
   
      int width = 3;
      
      int length = 5;
      
      int height = 8;
      
      int volume = width * length * height;
      
      int faceOne = (width * length) * 2;
      
      int faceTwo = (height * length) * 2;
      
      int faceThree = (width * height) * 2;
      
      int surfaceArea = faceOne + faceTwo + faceThree;//this and the three faces are used to find surface area of a 
      //6 sided rectanglular prism/box.
   
   
      
      System.out.print("The dimensions of the box are " + width +  " by " + length + " by " + height + "\n");
      System.out.println("The volume of the box is " + volume +  " inches cubed.");
      System.out.println("The surface area of the box is " + surfaceArea + " inches squared.");
      
   
   }
}