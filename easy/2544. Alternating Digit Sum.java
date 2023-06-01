class Solution {
    public int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        int ans = 0;
        boolean pos = true;
        for(char c :s.toCharArray()){
            if(pos) ans += c - '0';
            else ans -= c -'0';
            pos = !pos;
        }
        return ans;
    }
}
