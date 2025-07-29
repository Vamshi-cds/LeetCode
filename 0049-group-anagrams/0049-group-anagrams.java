class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> check=new HashMap<>();
        for(String s : strs){
            String aToZ=checkAZ(s);
            List<String> group=check.getOrDefault(aToZ,new ArrayList<>());
            group.add(s);
            check.put(aToZ,group);
            
        }
        List<List<String>> res=new ArrayList<>();
        for(List<String> values: check.values()){
            res.add(values);
        }
        return res;

    }
    public static String checkAZ(String s){
        int[] az=new int[26];
        for(char x: s.toCharArray()){
            az[x-'a']++;
        }
        return Arrays.toString(az);
    }
}