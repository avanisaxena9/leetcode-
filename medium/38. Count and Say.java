class Solution {
    public String countAndSay(int n) {
        if (n==1) return "1";
        String str = "10";
        int count = 1;
        char ch; 
        char next;
        int curr = 1;
        StringBuilder sb = new StringBuilder();
        while(curr<n) {
            sb.setLength(0);
            count = 1;
            for(int i = 0; i < str.length()-1 ; i++){
                ch = str.charAt(i);
                next = str.charAt(i+1);
            if(ch == next) count++;
            else
            {
                sb.append(count);
                sb.append(ch);
                count = 1;
            }
        }
        curr++;
        sb.append("0");
        str = sb.toString();
        System.out.println(str);
        }
        return str.substring(0,str.length()-1);
    }
}

