import java.util.*;
public class first
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      
      first p1 = new first();
      System.out.print("Enter any two numbers :\nFirst Number : ");
      p1.x = s.nextInt();
      System.out.print("Enter Another Number : ");
      p1.y = s.nextInt();
   }

   private static void change(first p)
   {
      int tmp;
      tmp = p.x;
      p.x = p.y;
      p.y = tmp;
   }
}