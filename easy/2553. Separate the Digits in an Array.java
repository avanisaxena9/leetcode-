class Solution {
    public int[] separateDigits(int[] nums) {
     StringBuilder sb  = new StringBuilder();
     for (int i :nums) sb.append(i);
     int[] nums2  = new int[sb.length()];
     for( int i = 0; i <sb.length() ; i++ ){
         nums2[i] = Integer.parseInt(Character.toString(sb.charAt(i))) ;
     }
        return nums2;
    }
}
