class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        StringBuilder sb  = new StringBuilder();
        int i = 0;
        for(  i = 0;i<str.length();i++){
            if(str.charAt(i) == '6') {
                sb.append('9');
                i++;
                break;
            }
            else sb.append(str.charAt(i));
        }
        while(i<str.length()){
            sb.append(str.charAt(i));
            i++;
        }
        return Integer.parseInt(sb.toString());
            }
}
