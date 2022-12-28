import java.util.*;
public class first
{
   public static void main(String[] args)
   {
      first o = new first();
      System.out.println("Enter your name and age : ");
      System.out.print("I am "+o.getName()+", and I am "+o.getAge()+" Year Old.");
   }

   private String getName()
   {
      
      return new Scanner(System.in).nextLine();
   }

   private int getAge()
   {
      
      return new Scanner(System.in).nextInt();
   }
}