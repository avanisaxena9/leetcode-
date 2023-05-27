class Solution {
    public int[] numberOfPairs(int[] nums) {
        // Integer[] num = nums.clone();
        // List<Integer> ls= Arrays.asList(num);
        if(nums.length == 1) return new int[]{0,1};
        List<Integer> ls = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(ls);
        int count = 0;
        for(int i = 0; i < ls.size()-1; i++){
            if(ls.get(i) == ls.get(i+1)){
                count++;
                i++;
            }
        }
        return new int[]{count,ls.size()-2*count};

    }
}
