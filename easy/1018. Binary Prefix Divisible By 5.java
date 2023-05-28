class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> li = new ArrayList<Boolean>();
        int n = nums.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum = (sum * 2 + nums[i]) % 10;
            if(sum == 5 || sum == 0){
                li.add(true);
            }else{
                li.add(false);
            }
        }

        return li;
    }
}
