class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq=new HashMap<>();
        int left=0,maxCount=0, res=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            freq.put(c,freq.getOrDefault(c,0)+1);
            maxCount=Math.max(maxCount, freq.get(c));
            while((right-left+1)-maxCount>k){
                char leftChar=s.charAt(left);
                freq.put(leftChar, freq.get(leftChar)-1);
                left++;
            }
            res=Math.max(res, right-left+1);
        }
        return res;
    }
}
