import java.util.*;
public class first
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the Number of Row and Coloum : ");
      int col = sc.nextInt();
      int row = sc.nextInt();

      for(int i=1; i<=row; i++)
      {
         for(int j=1; j<=col; j++)
         {
            if(i==1 || i==row || j==col || j==1)
            System.out.print("*");
            else
            System.out.print(" ");
         }
      System.out.println();
      }
   }
}