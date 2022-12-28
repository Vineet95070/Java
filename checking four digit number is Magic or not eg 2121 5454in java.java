import java.util.*;
public class first
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the four digit number : ");
      int num = sc.nextInt();

      int a = num%10;
      int b = (num/10)%10;
      int c = (num/100)%10;
      int d = (num/1000)%10;
  
      if(a+b == c+d)
      System.out.println("Magic Number :");
      else
      System.out.println("Odinary Number :");
   }
}