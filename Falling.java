   // Ross Palacios
// 9.16.2024
// CSCI 1302 Section 008
// Instructor: Dr. Harris
//
// Falling.java
//
// physics Printer
// all formulas are described in the assignment.
// This program uses height and time values to find the velocity and current height of a falling object.
public class Falling {
   public static void main(String [] args) {
   
      double height = 102.3;
      double time = 2.7;
      final double GRAVITY = 9.8;//this is the constant for gravity (9.8 m/s ^2)
      double velocity = -GRAVITY * time;// this is the given formula for velocity
      double currentHeight = height - 0.5 * (time * time) * GRAVITY;//this is the given formula for finding the current height.
      System.out.println("The object starts at a height of " + height +  " meters.");
      System.out.println("After " + time + " seconds, the object has the following properties: ");
      System.out.println("Velocity = " + velocity + "\nCurrent Height = " + currentHeight);
   }
}             
