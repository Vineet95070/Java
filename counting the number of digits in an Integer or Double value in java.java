import java.util.*;
public class first
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int counting=0;

      while(n != 0)
      {
         n = n/10;
         counting++;
      }
      System.out.println("Total Digit is : "+counting);
   }
}