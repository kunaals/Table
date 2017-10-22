

import java.math.BigInteger;
import static java.lang.Math.pow;

public class scheduleParsing {

   
    public static final int BASE = 5;
    
    public static void main(String[] args) {
      
         
        print(intersectionOf(new String[]{"12345", "6789A", "BCDEF", "GHIJK", "LMNOP", "QRSTU", "VVVVV"}));
    }
    
    //Displays the result in a nice format
    public static void print(int[][] data) {
      for (int i = 0; i < data.length; i++) {
         for (int j = 0; j < data[0].length; j++) {
            if (j % BASE == 0) {
               System.out.print(" ");
            }
            System.out.print(data[i][j]);
         }
         
         System.out.println("");
      }
    }
    
    //Take a list of strings representing numbers in the number system and returns their representation in binary
    //All strings must be of length 5 or things will go wierd
    public static int[][] intersectionOf(String[] schedules) {
        int[][] data = new int[schedules.length][BASE * 5];


        for (int i = 0; i < schedules.length; i++) {
            int[] build = new int[BASE * 5];


            int numerical = Integer.parseInt(schedules[i], 32 /*2^POWER*/);
            String bin = Integer.toBinaryString(numerical);
            
            final String empty = "0000000000000000000000000";
            bin = empty.substring(0, (BASE * 5)-bin.length())+bin;
            for (int j = 0; j < (BASE*5); j++) {
               build[j] =  Character.getNumericValue(bin.charAt(j));
            }
            data[i] = build;
        }
        
        return data;
    }

}