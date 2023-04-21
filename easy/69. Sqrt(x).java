class Solution {
    public int mySqrt(int x) {
        long start = 0;
        long end  = x;
        long mid;
        while(start<=end) {
            mid = (end+start)/2;
            if (mid == 0) break;
            if (mid*mid == x) return (int)mid;
            if (mid*mid > x) end = mid-1;
            else start  = mid+1;


        }

        return (int)end;
    }
}
