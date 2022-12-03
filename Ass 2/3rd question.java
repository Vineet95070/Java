/*
 *    Name :   Vineet Kr
 *    Roll :   bcah1ca21036
 * 
 */


import java.util.*;

import javax.sound.sampled.SourceDataLine;


public class first{        //first.java is the name of java file

      public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      first ob = new first();
      
      System.out.println("Enter the Size of array size must be less then 20 : ");
      int n = sc.nextInt();

         while(n>20 || n<1){
            System.out.println("Invalid Input!  try again.");
            n = sc.nextInt();
         }
         int[] arr= new int[n];

      for(int i=0; i<n; i++)
      {
         arr[i] = sc.nextInt();
      }
      
      ob.sort(arr);

   }
   public static void sort(int[] arr)
   {
      int temp;

      for (int i = 0; i < arr.length; i++) {     
         for (int j = i+1; j < arr.length; j++) {     
            if(arr[i] > arr[j]) {    
                temp = arr[i];    
                arr[i] = arr[j];    
                arr[j] = temp;  
            }
         }
      }
      System.out.println(Arrays.toString(arr));
   }
}