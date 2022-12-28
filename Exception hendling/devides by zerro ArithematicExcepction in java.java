import java.util.*;
public class first
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int d,a, b;

      System.out.println("Enter two Numbers : ");
      a=sc.nextInt();
      b = 0;

      try{
         d = a/b;
      }
      catch(Exception e){
         System.out.println(e);
      }

      System.out.println("Can't devided by zero :");
   }
}