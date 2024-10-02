import java.util.Scanner;
// Ross Palacios
// 9.12.2024
// CSCI 1302 Section 008
// Instructor: Dr. Harris
//
// No additional files
//
// Minutes to Years Convertor.
/*this program uses the basic conversion of minutes to hours to days to years in order
to convert minutes to years, it includes days at the end by using a remainder of minutes then dividing
by the rate of minutes to days, which is 1440 minutes per day. */

public class Minutesyears {
   public static void main(String [] args) {
            
      Scanner temp = new Scanner(System.in);
      System.out.println("how many minutes would you like to convert to years? ");
      long conversion = temp.nextLong();
      long rate = 525000;//this number comes from google and is the amount of minutes in a year.
      long days = (conversion % rate)/1440;
      conversion /= 60;
      conversion /= 24;
      conversion /= 365;
      conversion = (int)conversion;
      System.out.println("your minutes in years are " + conversion + " years and " + days + "days." );
         
         
   
   }
}             
