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
public class PracticeOne {
   public static void main(String [] args) {
   
      int xCoord = 0;
      int yCoord = 0;
      
      if(xCoord == 0 || yCoord == 0) {
      
         if(xCoord == 0 && yCoord != 0) {
         
            System.out.println("The coordinate pair " + "(" + xCoord + "," + yCoord + ") is on the y axis.");
         
         }else if(xCoord !=0 && yCoord == 0){
         
            System.out.println("The coordinate pair " + "(" + xCoord + "," + yCoord + ") is on the x axis.");
         
         }else if(xCoord == 0 && yCoord == 0) {
         
            System.out.println("The coordinate pair " + "(" + xCoord + "," + yCoord + ") is at the origin.");

         
         }
      
      }
      
      
      System.out.println(Math.random() * 6 + 1);
      
         
      
      
   
   }
}