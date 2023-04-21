class Solution {
    public int strStr(String s, String n) {
        if (s.length() < n.length()) return -1;
        for(int i = 0 ;i<=s.length() - n.length(); i++){
            if(Character.compare(s.charAt(i),n.charAt(0)) == 0){
                if(s.substring(i,i+n.length()).equals(n)) return i;
            }
        }
        return -1;
    }
}
