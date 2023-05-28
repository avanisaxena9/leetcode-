class Solution {
    public int smallestRangeI(int[] nums, int k) {
        if(nums.length == 1) return 0;
        List<Integer> ls  = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int max = Collections.max(ls);
        int min = Collections.min(ls);

        if(max-min < 2*k) return 0;
        else return max - min - 2*k;

    }
}
