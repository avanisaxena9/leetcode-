class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> ls = Arrays.stream(arr1).boxed().collect(Collectors.toList());
      
        int[] nums = new int[arr1.length];
        int i = 0;
        for(int n : arr2){
            System.out.println(ls);
            while(ls.contains(n)){
                nums[i] = n;
                i++;
                ls.remove(Integer.valueOf(n));
            }
        }
        Collections.sort(ls);
        for(Integer n : ls){
           
                nums[i] = n;
                i++;
        }

        return nums;


    }
}
