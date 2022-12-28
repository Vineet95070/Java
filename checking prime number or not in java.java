import java.util.*;
public class first
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      int sum =1;
      System.out.print("Enter a +ve Number : ");
      int num = sc.nextInt();
      if(num>0)
      {
         {
         for(int i=2; i<=num/2; i++)
         sum += i;
         }
            
         System.out.println(sum == 1 ? "Prime Number :" : "Not a prime Number :");
      }
      else
      System.out.println("Invalid Input Type :");
   }
}