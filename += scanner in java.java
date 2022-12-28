import java.util.*;
public class first
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      int sum=0;

      for(; sum<=100; )
      {
         sum += s.nextInt();
         System.out.println("Sum = "+sum);
      }


      System.out.println("Don!\n Final Value is : "+sum);

   }
}