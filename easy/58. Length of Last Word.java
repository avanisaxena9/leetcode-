class Solution {
    public int lengthOfLastWord(String s) {
        char[] c=s.toCharArray();
        
        int count=0;
        for(int i=c.length-1;i>=0;i--){
            if(Character.isLetter(c[i]))
            {
                count++;
                
            }
            else if(count!=0 && Character.isWhitespace(c[i]))
                return count;
            else if(Character.isWhitespace(c[i]))
                count=0;
            }
        return count;
    }    
}
