class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        List<Integer> ls  = new ArrayList<Integer>();
       
        int i;
        for(i=0;i<m;i++)
            ls.add(nums1[i]);
        
        for(i=0;i<n;i++)
            ls.add(nums2[i]);
        
        Collections.sort(ls);
        
        for(i=0;i<m+n;i++){
            nums1[i]=ls.get(i);
        }
    }
}
