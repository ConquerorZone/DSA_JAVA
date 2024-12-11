
import java.util.HashMap;

public class twoarraysPlusTarget {
    

    public static void main(String[] args) {
        // Example 1:

        // Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]
        // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        int[] nums = { 2, 7, 11, 15, 55, 6, 8 };
        int target = 10;
        int[] result = hashsolution(nums, target);
        if (result != null) {
            System.out.println("(" + result[0] + "," + result[1] + ")");
        } else {
            System.out.println("could not found the target number");
        }

    }
    public static int[] hashsolution(int[] nums, int target) {
        int complement;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < nums.length; j++) {
            complement = target - nums[j];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), j };
            }
            map.put(nums[j], j);
        }
        return null;
    }
    
}
