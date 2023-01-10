class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        if(s1.length() != s2.length()) return false;
        int count = 0;
        List<Character> ls1 = new ArrayList<>();
        List<Character> ls2 = new ArrayList<>();
        for(int i =0;i<s1.length() ; i++){
            ls1.add(s1.charAt(i));
            ls2.add(s2.charAt(i));
        }
        Collections.sort(ls1);
        Collections.sort(ls2);

        if(!ls1.equals(ls2)) return false;

        for(int i = 0;i <s1.length() ; i++){
            if(s1.charAt(i) != s2.charAt(i)) 
            count++;
        }
        if(count == 2) return true;
        else return false;
    }
}
