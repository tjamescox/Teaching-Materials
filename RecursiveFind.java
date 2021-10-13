public class RecursiveFind{
   public static void main(String[] args){
   int[] A = { 0,29,1,5,6,11,32 };
   int B = A.length;
   int K = 29;
   System.out.println(find(A,K,B));
   }
 public static boolean find(int arr[],int A, int K ) {
 if(A==0){
 return false;
 }
 if(arr[K-1]==A){
 return true;
 }
 K=K-1;
 return find(arr,A,K);
 }
}
