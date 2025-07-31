class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int count=0;
        for(int n:nums){
            if(n==0){
                count++;
                continue;
            }
            product=product*n;
        }
        if(count>1){
            return new int[nums.length];
        }
        int result[]=new int[nums.length];
        for(int i=0;i<result.length;i++){
            if(nums[i]==0){
                result[i]=product;
            }else if(count==1 && nums[i]!=0){
                result[i]=0;
            }
            else{
                result[i]=product/nums[i];
            }
        }
        return result;
    }
}  
