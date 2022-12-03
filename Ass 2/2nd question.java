/*
 *    Name :   Vineet Kr
 *    Roll :   bcah1ca21036
 * 
 */


import java.util.*;


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
      //System.out.println(Arrays.toString(arr));

      ob.maxmin(arr);
   }
   public static void maxmin(int[] arr)
   {
      int max = arr[0];
      for(int i=0; i<arr.length; i++){
         if(max < arr[i])
         {
            max = arr[i];
         }
      }
      System.out.println("Maximum number is : "+max);

      int min = arr[0];
      for(int i=0; i<arr.length; i++){
         if(min > arr[i])
         {
            min = arr[i];
         }
      }
      System.out.println("Minimum number is : "+min);
   }

}