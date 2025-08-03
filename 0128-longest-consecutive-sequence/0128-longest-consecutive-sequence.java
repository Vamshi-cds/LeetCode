class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        if(nums.length==0){
            return 0;
        }
        Set<Integer> seq=new HashSet<Integer>();
        for(int n:nums){
            seq.add(n);
        }
        for(int x: seq){
            if(!seq.contains(x-1)){
                int len=1;
                int cur=x;
                while(seq.contains(cur+1)){
                    len++;
                    cur++;
                }
                res=Math.max(res, len);
            }
        }
        return res;
        
    }
}