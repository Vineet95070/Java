import java.util.*;
public class first
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      // int arr[10];
      int arr[10];
      
      System.out.println("Enter the Number of Digit you want to enter : ");
      int d = sc.nextInt();
      
      System.out.println("Enter the NUmber : ");
      int num = sc.nextInt();

      for(int i = 1; i<=d ; i++)
      {
         for(int j=1; j<=1000000000; j*=10)
         {
            arr[i] = (num/j)%10;
            System.out.println(j);
         }
      }

   }
}