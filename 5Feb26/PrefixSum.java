import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] brr = {1,2,3,4,5,6};

        // prefixSum
        int sum=0;
        for(int i=0; i<arr.length; i++){

            sum = sum+arr[i];
            arr[i] = sum;
        }

        System.out.println(Arrays.toString(arr));
        // suffix sum
        int sSum = 0;
        for(int i=brr.length-1; i>=0; i--){
            sSum = brr[i]+sSum;
            brr[i] = sSum;
        }
        System.out.println(Arrays.toString(brr));
    }
}
