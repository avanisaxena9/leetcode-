class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> ls= new ArrayList<Integer>();
        int x = 0;
        for(int n : nums){
            if (n != val) 
            {
                ls.add(n);
                nums[x] = n;
                x++;
            }
        }
        return ls.size();
    }
}
