/*
 *    Name :   Vineet Kr
 *    Roll :   bcah1ca21036
 * 
 */
import java.util.*;
public class first{        //first.java is the name of java file

      public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Number/String : ");
      String sn = sc.nextLine();
      String rev = "";

      for(int i=sn.length()-1; i>= 0; i--)
      {
         rev += sn.charAt(i);
      }

      if(sn.equals(rev))      //equals is a predefind method in java to compair two string
      {
         System.out.println("Palindrom :");
      }
      else{
         System.out.println("Not Palindrom :");
      }
   }
}
