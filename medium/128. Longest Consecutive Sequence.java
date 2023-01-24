class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        
        List<Integer> ls = new ArrayList<Integer>();
        int count=1;
        int no=1;
        int flag=0;
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1] )
            { 
                count++;
                no=count;
                
            }
            
            else if (nums[i]==nums[i+1]) continue;
            else{
                ls.add(count);
                
                count=1;
            }
             
           
        }
         ls.add(no);
        
        
        
        return Collections.max(ls);
    }
    
}
