import java.util.*;
public class first
{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int[] arr = {1,2,3,2,3,3,4,4,4,4};

      System.out.println();

      System.out.print("Enter the Element you want to Search : ");
      int searchElement = sc.nextInt();

      System.out.println(takeArray(arr, searchElement));
   }

   public static int takeArray(int[] arr, int searchElement)
   {
      int occ = 0;
      for(int i=0; i<arr.length; i++){
         if(arr[i] == searchElement)
         occ++;
      }
      return occ;
   }

}