class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> check=new HashMap<>();
        for(String s : strs){
            int[] az=new int[26];
            for(char x: s.toCharArray()){
                az[x-'a']++;
            }
            String aToZ=Arrays.toString(az);
            List<String> group=check.getOrDefault(aToZ,new ArrayList<>());
            group.add(s);
            check.put(aToZ,group);
            
        }
        
        return new ArrayList<>(check.values());

    }
    
}