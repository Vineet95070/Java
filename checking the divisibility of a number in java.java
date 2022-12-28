import java.util.*;
public class first
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      int sum =0;
      int num = s.nextInt();
      for(int i=1; i<=num/2; i++)
      {
         if(num%i == 0){

         System.out.println(i);

         sum += i;
         }
      }
      System.out.println("Sum = "+sum);
   }  
}