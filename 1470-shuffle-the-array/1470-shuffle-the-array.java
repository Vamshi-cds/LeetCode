class Solution {
    public int[] shuffle(int[] nums, int n) {
        // Step 1: Encode both halves into the second half
        for (int i = 0; i < n; i++) {
            nums[i + n] = nums[i + n] * 10000 + nums[i];
        }

        // Step 2: Decode and rearrange in place
        int index = 0;
        for (int i = n; i < 2 * n; i++) {
            int x = nums[i] % 10000;   // extract original x
            int y = nums[i] / 10000;   // extract original y
            nums[index++] = x;
            nums[index++] = y;
        }

        return nums;
    }
}