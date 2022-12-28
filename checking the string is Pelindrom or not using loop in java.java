public class first
{
   public static void main(String[] args)
   {
      String str = "loly";
      String rev = "";

      for(int i=str.length()-1; i>=0; i--)
         rev += str.charAt(i);         
         System.out.println(rev);
         System.out.println(str);    
       
         
         for(int i=1; i<=str.length()-1; i++)
         {
            System.out.println(rev.charAt(i) == str.charAt(i) ? "Palindrom" : "Not a Palindrom");     //'?:' operator can use instead of if else statement
            break;
         }
   }
}