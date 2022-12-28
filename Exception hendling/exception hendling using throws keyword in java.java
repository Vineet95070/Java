import java.io.FileInputStream;
public class first
{
   public static void main(String[] args)
   {
      first ob = new first();

      try{
         ob.readFile();
      }
      catch(Exception e){
         e.printStackTrace();
      }

      System.out.println("Code run's sucessfully :");
   }

   public static void readFile() throws Exception{         //throws keyword says that in the method readFile have an exception error
      FileInputStream fis = new FileInputStream("C:/abc.txt");
   }

}