class Solution {
    public boolean areOccurrencesEqual(String s) {
        String[] str = s.split("");
        Arrays.sort(str);
        int count = 1;
        int std = 0;
        String prev;
        String curr;
        for(int i = 1; i <s.length() ; i++){
            prev = str[i-1];
            curr = str[i];
            if(prev.equals(curr)) count++;
            else {
                if(std == 0) std = count;
                else if (std != count) return false;
                count = 1;
            }
        }
        if(std == 0) std = count;
        else if (std != count) return false;
        return true;
    }
}
