import java.util.*;

class YourAgeException extends Exception{    //extends is use because throw is mainly use for checked exception

   YourAgeException(String msg)
   {
      super(msg);       //The super keyword in Java is a reference variable which is used to refer immediate parent class object.
   }
}

public class first
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter Your Age : ");
      int Age = sc.nextInt();

      //We are going to print the exception caused by the if statement

      try{
         if(Age<18){

            throw new YourAgeException("You can not eligible for voting :");
         }
         else{
            System.out.println("You can Vote! :");
         }
      }
      catch(Exception e){
            e.printStackTrace();
      }
   }
}