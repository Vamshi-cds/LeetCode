class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n*n;
        int sumEven = n*(n+1);
        /*int min = Math.min(sumOdd, sumEven);
        int max=Math.max(sumOdd, sumEven);
        int gcd=-99;
        int k=2;
        while(gcd<n){
            if(min%k==0){
                if(max%k==0){
                    gcd=Math.max(k,gcd);
                }
            }
            k++;
        }*/
        return n;
    }
}