class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        List<Character> ls = new ArrayList<>();
        for(Character ch : brokenLetters.toCharArray()){
            ls.add(ch);
        }
        int flag = 0;

        for( Character c :text.toCharArray()){
            if(Character.isWhitespace(c) && flag==0) {count++; flag = 0;}
            if(Character.isWhitespace(c) ) {flag = 0;}
            if(ls.contains(c)) flag++;
            
        }
        if( flag == 0) {count++; flag = 0;}
        // StringBuilder sb = new StringBuilder();
        // for( Character c :text.toCharArray()){
        //     if (Character.isLetter(c)) sb.append(c);
        //     else
        //     {
        //         ls.add(sb.toString());
        //     }
        // }
        return count;
    }
}
