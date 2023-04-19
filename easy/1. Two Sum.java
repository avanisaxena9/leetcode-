class Solution {
    public int[] twoSum(int[] nums, int target) {
        int count=0;
        int[] a= new int[2];
         for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    
                    a[0]=i;
                    a[1]=j;
                   count=1;
                }
                else 
                    continue;
            }
        }
        return a;
    }
}



