class Solution {
    public int arrangeCoins(int n) {
        int k  = 0;
        while(k+1<=n){
            k++;
            n -= k;
        }
        return k;
    }
}
