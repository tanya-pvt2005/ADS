
public class BinarySearch {

    public static void main(String[] args) {
        int target = 6;
        int[] arr = {2, 4, 5, 6, 8, 9, 10};
        boolean found = false;
        int left = 0, right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            
            if(mid == target){
                found = true;
                System.out.println("Element found at index: "+mid);
                break;
            }
            else if(mid>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        if(!found) System.out.println("not present in the array");
    }
}
