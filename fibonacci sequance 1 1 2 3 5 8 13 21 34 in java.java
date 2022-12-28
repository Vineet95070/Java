import java.util.*;
public class first
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      int v1=0, v2=1, result=1;
      int num = s.nextInt();

      for(int i=1; i<=num; i++){
         System.out.print(result+ " ");
         result = v1+v2;
         v1 = v2;
         v2 = result;
      }
      System.out.println("........   ");
   }
}