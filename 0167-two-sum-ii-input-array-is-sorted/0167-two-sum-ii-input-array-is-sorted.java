class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> check = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(check.containsKey(target-numbers[i])){
                //check.put(numbers[i],numbers[i]);
                return new int[]
                {check.get(target-numbers[i]),i+1};
            }
            check.put(numbers[i],i+1);
        }
        return new int[]{};
    }
}
