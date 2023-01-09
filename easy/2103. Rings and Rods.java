class Solution {
    public int countPoints(String rings) {
        int len = rings.length() / 2;
        List<Integer> R = new ArrayList<>(len);
        List<Integer> G = new ArrayList<>(len);        
        List<Integer> B = new ArrayList<>(len);

        char col;
        int rod;
        int count = 0;

        for( int i = 0 ; i<rings.length()-1 ; i = i+2){
            col = rings.charAt(i);
            rod = (int) rings.charAt(i+1) ;
            rod = rod - 48;
            System.out.println(col+"  "+rod);
            if(col == 'R'){
                R.add(rod);
            }
            else if(col == 'G'){
                G.add(rod);
            }
            else if(col == 'B'){
                B.add(rod);
            }
        }
        System.out.println(R.size()+ " " + G.size()+ " " + B.size()+ " ");
        for( int k = 0; k<=9 ; k++){
            if(R.contains(k) && G.contains(k) && B.contains(k))
            count++;
        }
        return count;
    }
}
