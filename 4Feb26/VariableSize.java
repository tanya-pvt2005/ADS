public class VariableSize {
    
    //this depends on condition
    //condition true: window size increase
    //false: window shrinks
    //USECASES
    //longest or smallest type of problems
    //sum<=k, sum>=k
    //condition based
    //problem decides window size


    //longest subarray with sum <= k
    //Array = [2,1,5,1,3]
    //k=7
    public static void main(String[] args) {
        
        //left = 0;
        //sum = 0;
        //maxLength = 0

        //when 
        // right = 0 -> arr arr[0] -> sum = 2
        //window = [2]
        // length = 1

        // right = 1
        //and so on

        int[] arr = {2,1,5,1,3};
        int k=7;
        int left = 0, sum = 0, maxLength = 0;

        for(int right = 0; right < arr.length; right++){
            sum+=arr[right];
            while(sum > k){
                sum-=arr[left];
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);
    }



}
