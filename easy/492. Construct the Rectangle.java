class Solution {
    public int[] constructRectangle(int area) {
        int w,h;
        w = (int)Math.sqrt(area);
        while(w>=1){
            if(area%w==0) break;
            w--;
        }
        return new int[]{area/w,w};
    }
}
