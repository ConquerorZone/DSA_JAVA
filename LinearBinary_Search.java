import java.util.Arrays;

public class LinearBinary_Search {
    public static int[] sortedarr(int[]arr){
       int [] sorted = arr.clone();
       Arrays.sort(sorted);
       return sorted;
    }
    public static void main(String[] args) {
        InnerLinearBinary_Search search = new InnerLinearBinary_Search();
        int[] nums = { 50, 60, 70, 90, 5, 66, 77, 88, 22, 56 };
        
        int target = 88;
    
        
       
        nums = sortedarr(nums);
        System.out.println(Arrays.toString(nums));
        // int result = search.linearSearch(nums, target);
        int result = search.binarySearch(nums, target);

        if (result != -1) {
            System.out.println("The Expression found at Index: " + result);
        } else {
            System.out.println("The Expression not found in the array");
        }
    }

    public static class InnerLinearBinary_Search {

        public int linearSearch(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
        }

        public int binarySearch(int [] nums, int target) {
                    int steps=0;
                    int left = 0;
                    int right = nums.length - 1;
                    while (left <= right) {
                        steps ++;
                        int mid = left + (right-left) / 2;
                        if (nums[mid]==target) {
                            System.out.println(steps);
                            return mid;
                        } else if (nums[mid] < target) {
                 left = mid+1;
                }else{
                    right = mid-1;
                }
            }
            System.out.println(steps);
            return -1;
        }

    }
}
