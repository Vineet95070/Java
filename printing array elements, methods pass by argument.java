import java.util.*;
public class first{
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      first o = new first();
      System.out.print("How many numbers you want to enter(Less then '20') : ");
      int n = sc.nextInt();
      while(n>20 || n<1)            //this will check the size of Array sould be less then '20'.
      {
         System.out.println("Invalid Input! try again :");
         n = sc.nextInt();
      }

      int[] numbers = new int[n];

      o.fillTheArray(numbers);
      o.printTheArray(numbers);

   }

   public void fillTheArray(int[] numbers)      //int[] is a integer type array name as numbers.
   {
      Scanner sc = new Scanner(System.in);
      for(int i=0; i<numbers.length; i++)       //numbers.length is the length of an array.
      {
         System.out.print("Enter arr["+(i+1)+"]th Element : ");
         numbers[i] = sc.nextInt();
      }
   }

   public void printTheArray(int[] numbers)
   {
      for(int i=0; i<numbers.length; i++)
      System.out.print(Arrays.toString(numbers));	//Array.toString() is a pre-defined method to print the array
   }
}