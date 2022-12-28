public class first
{
   public static void main(String[] args)
   {
      double b =9;
      int a = 4 + (int)b;      //'b' is explicit type casted to an double to integer

      double d = 15;           // compiler will automatically type-casted double into integer because '15' is a integer.

      System.out.println("a = "+a);
   }
}