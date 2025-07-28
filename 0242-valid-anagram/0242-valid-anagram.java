class Solution {
    public boolean isAnagram(String s, String t) {
        int[] check=new int[26];
        for(char x: s.toCharArray()) check[x-'a']++;
        for(char x: t.toCharArray()) check[x-'a']--;
        for(int x:check){
             if(x!=0) return false;
        }
        return true;


        //for(int i=0;i<s.length(),i++) check[s.toCharArray(s-'a')]
        
    }
}