class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        
        while(left<right){
            int cursum=numbers[left]+numbers[right];
            /*System.out.println(cursum);
            System.out.println(left+1);
            System.out.println( right+1);*/
            if(cursum<target){
                left++;
            }
            if(cursum>target){
                right--;
            }
            if(cursum == target){
                return new int[]{left+1,right+1};
            }
            
        }
        return new int[]{};
    }
}
