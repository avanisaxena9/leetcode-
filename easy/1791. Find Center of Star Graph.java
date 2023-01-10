class Solution {
    public int findCenter(int[][] edges) {
        List<Integer> ls = new ArrayList<>(edges[0].length);

        for(int k = 0 ; k < edges[0].length ; k++){
            ls.add(edges[0][k]);
            
        }
            for(int k = 0 ; k <edges[0].length ; k++){
               if(ls.contains(edges[1][k])) return edges[1][k];
            }
      
        return 0;
    }
}
