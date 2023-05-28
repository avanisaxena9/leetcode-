class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        int temp = 0;
        for(String s : strs)
        {
            boolean flag = false;

            for(char c : s.toCharArray())
            if(Character.isLetter(c))  flag = true;
          
            if(flag == false) temp = Integer.parseInt(s);
            else temp = s.length();
            if(temp> max) max = temp;
          
        }
        return max;
    }
}
