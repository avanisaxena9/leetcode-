class Solution {
    public int firstMissingPositive(int[] nums) {
     int i = 1;
    //  int index = 0 ;
     Arrays.sort(nums);
     
     for(int j = 0; j < nums.length ; j++){
         if (j>0 && nums[j] == nums[j-1]){
             continue;
         }
         if(nums[j]==i){
             i++;
         }
         else if (i>1) return i++;
         
     }
     return i;
    }
    
}
