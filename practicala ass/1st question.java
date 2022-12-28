import java.util.*;
public class first{
   public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         first ob = new first();

      System.out.print("Enter the Number you want to find the sum until : ");
      int n = sc.nextInt();

      ob.series_1(n);
      ob.series_2(n);
   }

   void series_1(int r){

      float s=0.0f;
      for(float i=1.0f; i<=r; i++){     // 1/1 + 1/2 + 1/3 +......+ 1/n
         s += 1/i;
      }
      System.out.println(s);
   }

   void series_2(int r){

      float s= 1.0f;
      for(float i=1.0f; i<=r; i++){       // 1/1 + 1/2 + 1/2*2 + 1/2*3 + 1/2*4 +.......+ 1/2*n;
         s += 1/(2*i);
      }
      System.out.println(s);
   }
}
