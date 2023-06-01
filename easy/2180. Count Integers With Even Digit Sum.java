class Solution {
    public int countEven(int num) {
        int count = 0;
        int curr, sum = 0;

        for(int i = 1 ; i<=num ;i++){
             curr = i;
            while(curr != 0 ){
                sum = sum + curr%10;
                curr = curr/10;
            }
            if(sum%2 == 0) count++;
            sum = 0;
        }
        return count;
    }
}
