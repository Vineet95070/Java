import java.util.*;
public class first 
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      char s;
      int a, b;

      System.out.print("Enter first number : ");
      a = sc.nextInt();

      System.out.print("Enter the Operation which u want to perform : ");
      s = sc.next().charAt(0);

      System.out.print("Enter the second number : ");
      b = sc.nextInt();

      switch(s)
      {
         case '+' :
         System.out.println("a+b = "+a+b);
         break;

         case '-' :
         System.out.println("a-b = "+(a-b));
         break;

         case '*' :
         System.out.println("axb = "+(a*b));
         break;

         case '/' :
         System.out.println("a/b = "+(a/b));
         break;

         default :
         System.out.println("We are still reading more :");
      }

   }
}