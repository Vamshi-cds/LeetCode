class Solution {
    public int lengthOfLongestSubstring(String s) {
        //char[] sToArray=new char[s.length()];
        Map<Character, Integer> wordCounter=new HashMap();
        int len=0;
        int maxCount=0;
        for(int i=0;i<s.length();i++){
            if(wordCounter.containsKey(s.charAt(i))){
                len=Math.max(wordCounter.get(s.charAt(i))+1,len);

            }
            wordCounter.put(s.charAt(i),i);
            maxCount=Math.max(maxCount,i-len+1);
        }
        return maxCount;
    }
}
