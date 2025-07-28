class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> check=new HashSet<>();
        for(int num: nums){
            check.add(num);
        }
        return !(check.size()==nums.length);
        
    }
}