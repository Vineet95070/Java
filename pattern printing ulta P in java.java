import java.util.*;
public class first 
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int row, coloum;

      System.out.println("Enter the Number of Row's : ");
      row = sc.nextInt();

      System.out.println("Enter the Number of Coloum's : ");
      coloum = sc.nextInt();

      for(int i=1; i<=coloum; i++)
      {
         for(int j=1; j<=coloum; j++)
         {
            if(i<=j)
            System.out.print("*");
            else
            System.out.print(" ");
         }
      System.out.print("\n");
      }

   }
}