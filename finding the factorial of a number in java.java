/*
 *    Name :   Vineet Kr
 *    Roll :   bcah1ca21036
 * 
 */


import java.util.*;

public class first{        //first.java is the name of java file

      public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the Number you want to find the Factorial : ");
         int num = sc.nextInt();
         int n = num;

      for(int i=num-1; i>=2; i--)
      {
         num *= i;
      }

      System.out.println("Factorial of "+n+" is : "+num);

   }
}