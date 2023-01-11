class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;

        if(s.equals(goal)){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            for(int i = 1 ;i<s.length() ;i++){
                if(ch[i] == ch[i-1]) return true;
            }
        }
        
        boolean flag = false;
        int count = 0, index = -1;
        char one = 'A', two = 'B';
        for(int i = 0; i<s.length() ;i++){
            if(s.charAt(i) != goal.charAt(i)){
                if(flag == false){
                    one = s.charAt(i);
                    two = goal.charAt(i);
                    index = i;
                    flag = true;
                }
                else if (flag == true){
                    if(s.charAt(i) == two && goal.charAt(i) == one && index != i){
                        count++;
                        flag = false;
                    }
                    else return false;
                }
            }
        }
        if(flag == false && count == 1) return true;
        return false;
    }
}
