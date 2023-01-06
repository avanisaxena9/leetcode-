class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n = 0, sum = 0;
        Arrays.sort(costs);
        for(int i = 0 ; i<costs.length ; i++){
            if(sum+costs[i]<=coins){
                n++;
                sum += costs[i];
            }
        }
        return n;
    }
}
