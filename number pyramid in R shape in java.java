import java.util.*;
public class first
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the Number of Row : ");
      int num = sc.nextInt();

      for(int i=0; i<=num; i++)
      {
         for(int j=1; j<=num; j++)
         {
            if(i>=j)
            System.out.print(j);
            else
            System.out.print(" ");
         }
      System.out.println("");
      }
   }
}