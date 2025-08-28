class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;
        if(n%k!=0) return false;
        int g=n/k;
        java.util.Arrays.sort(nums);
        int maxFreq=1;
        int curFreq=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                curFreq++;
                if(curFreq>maxFreq) maxFreq=curFreq;
                if(maxFreq>g) return false;
                
            }else{
                curFreq=1;
            }
        }
        return maxFreq<=g;
    }
}