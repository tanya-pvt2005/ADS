public class MaximumSubarraySum {
    
    //Maximum Sum Subarray
    //first window sum
    //max ko store
    //window slide
    //add right
    //remove left
    //update max

    public static void maxSumArr(int[] arr, int k){
        int windowSum = 0;
        for(int i=0; i<k; i++){
            windowSum+=arr[i];
        }
       
        int maxSum = windowSum;

        for(int right = k; right<arr.length; right++){
            windowSum+=arr[right];
            windowSum-=arr[right-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        
        System.out.println(maxSum);

    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        maxSumArr(arr, k);
    }
    // public static void main(Integer[] args) {
        
    // }

}