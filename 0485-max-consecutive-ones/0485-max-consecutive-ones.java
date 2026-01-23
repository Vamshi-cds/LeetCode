class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxone=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                maxone++;
            }else{
                if(maxone>result){
                    System.out.println(i);

                    System.out.println(maxone);
                    result=maxone;
                }
                maxone=0;
            }

        }
        if(maxone>result){
                    result=maxone;
        }
        return result;
    }
}