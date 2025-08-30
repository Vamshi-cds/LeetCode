class Solution {
    public int getLeastFrequentDigit(int n) {
        n=Math.abs(n);
        int[] freq=new int[10];
        if(n==1){
            freq[0]=1;
            return 1;

        }else{
            while(n>0){
                int d=n%10;
                freq[d]++;
                n/=10;
            }
        }
        int bestDigit=-1;
        int bestFreq=Integer.MAX_VALUE;
        for(int d=0;d<=9;d++){
            if(freq[d]>0){
                if(freq[d]<bestFreq || (freq[d]==bestFreq && d<bestDigit)){
                    bestFreq = freq[d];
                    bestDigit =d;
                }
            }
        }
        return bestDigit;
    }
}