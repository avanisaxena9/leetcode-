class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int num : nums){
            if(num%2==0){
            if(!hm.containsKey(num))
            hm.put(num,1);
            else 
            hm.put(num,hm.get(num)+1);
            }
        }
        System.out.println(hm);
        int max = -1;
        int value = 0;
        for(Map.Entry m : hm.entrySet()){
            if((int)m.getValue() == value)
            max = Math.min((int)m.getKey(),max);
            if((int)m.getValue() > value ){
                // && ((int) m.getKey() > max)
                max = (int) m.getKey();
                value = (int) m.getValue();

            }
        }
        return max;
    }
}
