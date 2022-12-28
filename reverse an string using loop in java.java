public class first
{
   public static void main(String[] args)
   {
      String str = "Hello World!";
      String rev = "";

      for(int i=str.length()-1; i>=0; i--)
         rev += str.charAt(i);         // cant peform operations between char and String variable    
         System.out.print(rev);        //rev is a String variable whose store the reverse of str.
   }
}