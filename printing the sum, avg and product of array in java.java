import java.util.*;
public class first{
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      first o = new first();
      System.out.print("How many numbers you want to enter(Less then '20') : ");
      int n = sc.nextInt();
      while(n>=20 || n<=0)            //this will check the size of Array sould be less then '20'.
      {
         System.out.println("Invalid Input! try again :");
         n = sc.nextInt();
      }

      int[] numbers = new int[n];

      o.fillTheArray(numbers);
      o.printTheSumofArray(numbers);
      o.printTheAvgfArray(numbers);
      o.printTheProductofArray(numbers);

   }

   public static void fillTheArray(int[] numbers)
   {
      for(int i=0; i<numbers.length; i++)
      {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the Array elements arr["+(i+1)+"]th : ");
         numbers[i] = input.nextInt();
      }
   System.out.println(Arrays.toString(numbers));
   }

   public static void printTheSumofArray(int[] numbers)
   {
      int sum=0;
      for(int i=0; i<numbers.length; i++)
      {
         sum += numbers[i];
      }
      System.out.println("Sum = "+sum);
   }

   public static void printTheProductofArray(int[] numbers)
   {
      int product=1;
      for(int i=0; i<numbers.length; i++)
      {
         product *= numbers[i];
      }
      System.out.println("Product = "+product);
   }

   public static void printTheAvgfArray(int[] numbers)
   {
      int sum=0;
      for(int i=0; i<numbers.length; i++)
      {
         sum += numbers[i];
      }
      System.out.println("Avg = "+(sum/numbers.length));
   }
}
