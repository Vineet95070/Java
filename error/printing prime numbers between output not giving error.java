import java.util.*;
public class first
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter two numbers : ");
      
      first o = new first();

      int n1 = input.nextInt(); 
      int n2 = input.nextInt(); 
      o.IsCheck(n1,n2);
   }

   private boolean IsPrime(int num)
   {
      for(int i=1; i<=num/2; i++)
      if(num%i == 0)
      return false;

      return true;
   }

   private void IsCheck(int start, int last)
   {
      for(int i=start; i<=last; i++)
      {
         if(IsPrime(i))
         System.out.print(i+" ");
      }
   }
}