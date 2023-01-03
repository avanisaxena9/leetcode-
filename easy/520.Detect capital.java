class Solution {
    public boolean detectCapitalUse(String word) {
        if(word == word.toUpperCase()) return true;
        if(word == word.toLowerCase()) return true;
        if(Character.isUpperCase(word.charAt(0))){
            for(int i=1;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))) return false;
            }
            return true;
        }
        return false;       

    }
}
