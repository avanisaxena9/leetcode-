class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
                for(char c: s.toCharArray()){
                    if(hm.containsKey(c)) hm.put(c , hm.get(c)+1);
                    hm.putIfAbsent(c,1);
        }
        System.out.println(hm);

        int k = 0;
        int m = 0;
        int max = 0;
        for(Map.Entry h : hm.entrySet()){
            if((int)h.getValue()%2 == 0) {
                k = k + (int)h.getValue();
            }
            else {
                if ((int)h.getValue() > max){
                    k  = k + (int)h.getValue();
                    if(m != 0 ) k--;
                        m++;
                        max = (int)h.getValue();
                }
                else {
                    k  = k + (int)h.getValue() - 1;
                }       
            }
        }
    
        return k;
    }
}
