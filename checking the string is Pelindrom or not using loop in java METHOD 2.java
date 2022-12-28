public class first
{
   public static void main(String[] args)
   {
      String str = "lol";
      boolean isPalindrom = true;

      for(int i=0, j=str.length()-1; i<j; i++, j--)
      {
         if(str.charAt(i) == str.charAt(j))        //using this concept we will check the string by compairing both side of the string :
         continue;

         isPalindrom = false;
      }

      System.out.println(isPalindrom ? "IS PALINDROM :" : "NOT PALINDROM");
   }
}