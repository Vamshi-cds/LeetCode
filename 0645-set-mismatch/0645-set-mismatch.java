class Solution {
    public int[] findErrorNums(int[] nums) {
        int a=0,b=0;
        int n=nums.length;
        boolean[] visit=new boolean[n+1];
        for (int i : nums) {
            if (visit[i]) {
                a = i;
            }
            visit[i] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                b = i;
                break;
            }
        }
        return new int[]{a,b};
    }
}