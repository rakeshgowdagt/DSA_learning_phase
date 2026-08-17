import java.util.Scanner;
public class mini_max_sum {
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] arr= new int[n];
  for(int i=0; i<arr.length; i++){
   arr[i]=sc.nextInt();
  }

  System.out.println("Maximum sum of n-1 elements: "+ (sumn(arr) - min(arr)));
  System.out.println("Minimum sum of n-1 elements: "+(sumn(arr) - max(arr)));

  sc.close();
 }

 public static int max(int [] arr){
  int max=arr[0];
  for(int i=0; i<arr.length; i++){
   if(arr[i]>max){
    max=arr[i];
   }}
  return max;
 }

 public static int min(int[] arr){
  int min=arr[0];
  for (int i = 0; i < arr.length; i++) {
   if (arr[i] < min) {
    min = arr[i];
   }}
  return min;
 }

 public static int sumn(int [] arr){
  int sum=0;
  for(int i=0; i<arr.length; i++){
   sum+=arr[i];
  }
  return sum;
 }
 
}
