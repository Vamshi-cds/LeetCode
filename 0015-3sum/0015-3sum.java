class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> Ans= new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0 || nums[nums.length-1]<0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int target=nums[i]+nums[l]+nums[r];

                if(l<r && target<0) l++;
                else if(l<r && target>0) r--;
                else{
                    Ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r && nums[l]==nums[l+1]) l++;
                    while(l<r && nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }

            }
        }
        return Ans;
    }
}
