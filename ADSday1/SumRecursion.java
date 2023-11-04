// Write a recursive function to find the sum of all elements in a list.
package ADSday1;


public class SumRecursion {
   public static int calculateSum(int arr[], int n) {
 
         //base or terminating condition
         if (n <= 0) {
            return 0;
          }
 
          //Calling method recursively
          return calculateSum(arr, n-1 ) + arr[n-1];
       }
 
      public static void main(String[] args) {
 
         int arr[] = {2, 5, 6, 8, 9};
         int sum = calculateSum(arr, arr.length);
 
          System.out.println(sum);
      }
 
}
    

