import java.util.Scanner;
public class max_index_pos {

 public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  int n=sc.nextInt();
  int[] arr=new int[n];
  for(int i=0; i<n; i++){
   arr[i]=sc.nextInt();
  }
  int index_f=indexpos(arr);
  System.out.println(index_f);
  sc.close();
 }


 public static int indexpos(int[] arr){
  int index=-1;
  //use index =-1 to avoid multiple maximum numbers; to fetch its index position
  int max=arr[0];
  for(int i=0; i<arr.length; i++)
   {
   if(arr[i]>max){
    max=arr[i];
    index=i;
   }
   }
  return index;
 }
}

