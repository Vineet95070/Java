import java.util.*;
public class first
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      sum();           //'sum' method is overloded
      
      System.out.print("Enter string : ");
      String str = sc.nextLine();
      sum(str);      //Method overloding 'sum' is overloded
      
      
   }
   private static void sum()
   {
      System.out.println("Vineet ");
   }
   private static void sum(String str1)
   {
      System.out.println("Vineet "+str1);

   }
}