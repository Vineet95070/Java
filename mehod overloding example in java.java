import java.util.*;
public class first
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      sum(3,5);           //'sum' method is overloded
      sum(6,9,8);      //Method overloding 'sum' is overloded
      
   }
   private static void sum(int a, int b)
   {
      System.out.println("x + y = "+(a+b));
   }
   private static void sum(int a, int b, int c)
   {
      System.out.println("x + y + z = "+(a+b+c));
   }
}