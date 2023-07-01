class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max  =0;
        for (int n : candies){
            if (n>max) max = n;
        }
        List<Boolean> ls  =new ArrayList<Boolean>();
        for ( int n : candies){
            if (n + extraCandies >= max) ls.add(true);
            else ls.add(false);
        }
        return ls;

    }
}
