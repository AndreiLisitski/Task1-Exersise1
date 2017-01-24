import java.util.Scanner;

public class Task1Ex1 {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         double[] a = new double[4];
         for(int i = a.length -1; i >= 0; i--){
             a[i] = x % 10;
             x /= 10;
         }
         for(int i =0; i < a.length; i++){
             System.out.print(a[i] + " ");
         }
         System.out.println();
         if(a[0] + a[1] == a[2] + a[3]){
             System.out.print("True");
         }else  System.out.print("False");
     }
}
