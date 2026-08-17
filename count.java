import java.util.Scanner;
public class count {
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k =sc.nextInt();
  int[] arr=new int[n];
  for(int i=0; i<n; i++){
   arr[i]=sc.nextInt();
  }
  int total=counting(arr, k);
  int index_i=indexpos(arr, k);
  System.out.println("Count of "+k+" element is "+total+" time(s)");
  System.out.println("Index position of "+k+" is "+index_i);

  sc.close();
 }

 public static int counting(int[] arr, int k){
  int count=0;
  for(int i=0; i<arr.length; i++){
   if(arr[i]== k){
    count++;
   }}
  return count;
 }


 public static int indexpos(int[] arr, int k){
  int index=0;
  for(int i=0; i<arr.length; i++){
  if(arr[i]==k){
   index=i;
  }}
  return index;
 }

}


