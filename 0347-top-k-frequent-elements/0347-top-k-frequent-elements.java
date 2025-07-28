class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> checkmap=new HashMap<>();
        for(int num:nums){
            checkmap.put(num, checkmap.getOrDefault(num,0)+1);
        }
        List<Integer>[] check=new ArrayList[nums.length+1];
        for(int i=0;i<check.length;i++){
            check[i]=new ArrayList<>();
        }
        
        for(Map.Entry<Integer,Integer> ch: checkmap.entrySet()){
            
                check[ch.getValue()].add(ch.getKey());
        

        }
        List<Integer> res=new ArrayList<>();
        for (int is = check.length - 1; is >= 0 && res.size() < k; is--) {
            for (int x : check[is]) {
                res.add(x);
                if (res.size() == k) break;
            }
        }
        return res.stream().mapToInt(i->i).toArray();


    }
}