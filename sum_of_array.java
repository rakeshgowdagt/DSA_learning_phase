import java.util.Scanner;
public class sum_of_array{
 public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  int[] arr=new int[10];
  for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
  }
  int result = arrsum(arr);
  System.out.println("Sum of array elements: " + result);

  sc.close();
 }

 public static int arrsum(int arr[]) {
     int sum = 0;
     for (int i = 0; i < arr.length; i++) {
         sum += arr[i];
     }
     return sum;
 }
}