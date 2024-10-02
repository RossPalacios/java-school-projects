import java.util.Scanner;
// Ross Palacios
// 9.30.2024
// CSCI 1302 Section 008
// Instructor: Dr. Harris
//
// Button.java
//
// Circle/rectangle interior checker.
// This program determines if a point of coordinates (x,y) are inside a rectangle and/or a circle.
public class Button {
   public static void main(String [] args) {

      Scanner sc = new Scanner(System.in);
      
      System.out.println("What is the width and height of your rectanlge?\n");
      
      System.out.print("w: ");
      double width = sc.nextDouble();
      
      System.out.print("\nh: ");
      double height = sc.nextDouble();
      
      System.out.println("\nWhat is the radius of your circle?");
      
      System.out.print("\nr: ");
      double radius = sc.nextDouble();
      
      System.out.println("\nWhat coordinates - (x,y) - would you like to check?");
      
      System.out.print("\nx: ");
      double xCoord = sc.nextDouble();
      
      System.out.print("\ny: ");
      double yCoord = sc.nextDouble();
      
      double withinCircle = Math.pow(xCoord, 2) + Math.pow(yCoord, 2);//this formula is given in the assignment to see if the point is within the circle.
      
      if(xCoord <= width && yCoord <= height && withinCircle <= Math.pow(radius, 2)) {//math.pow(radius, 2) is part of the formula x^2 + y^2 <= r^2 given in the 
      //assignment
      
         System.out.println("\nThe point is in both the circle and rectangle.");
      
      }else if(xCoord <= width && yCoord <= height && withinCircle > Math.pow(radius, 2)) {//these if statements switch around the original statement to check
      //if both, neither, or just one of the shapes has points within them.
      
         System.out.println("\nThe point is inside the rectangle only.");
      
      }else if(xCoord > width || yCoord > height && withinCircle <= Math.pow(radius, 2)) {
      
         System.out.println("\nThe point is inside the circle only.");
      
      }else
         System.out.println("\nThe point lies in neither shape.");


   }
}