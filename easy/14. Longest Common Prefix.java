class Solution {
   
        public String longestCommonPrefix(String[] strs) {
    if(strs == null || strs.length == 0)    return "";
    String pre = strs[0];
    int i = 1;
    while(i < strs.length){
        while(strs[i].indexOf(pre) != 0)
            pre = pre.substring(0,pre.length()-1);
        i++;
    }
    return pre;
}
}

// laternate solution
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        for(int  i = 0; i< Math.min(strs[0].length(),strs[strs.length-1].length()); i++){
            if(Character.compare(strs[0].charAt(i), strs[strs.length - 1].charAt(i)) == 0) sb.append(strs[0].charAt(i));
            else break;
        } 
        return sb.toString();
    }
}
