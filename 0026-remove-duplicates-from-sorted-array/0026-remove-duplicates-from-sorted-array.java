import java.util.*;
import java.util.stream.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        // Use Java 8 streams to get distinct elements
        int[] unique = Arrays.stream(nums)
                             .distinct()
                             .toArray();

        // Copy back to original array (to simulate in-place behavior)
        for (int i = 0; i < unique.length; i++) {
            nums[i] = unique[i];
        }

        // Return count of unique elements
        return unique.length;
    }
}