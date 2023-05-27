// class Solution {
//     public int[] rowAndMaximumOnes(int[][] mat) {
//         int rowno = 0;
//         int count = 0;
// 
//         for(int i = 0;i<mat.length;i++){
//             int c = 0;
//             for(int j=0;j<mat[0].length;j++){
//                 if (mat[i][j] == 1) c++;
//             }
//             if(c>count) {
//                 count = c;
//                 rowno = i;
//             }
//         }
//         return new int[]{rowno,count};
//     }
// }

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int rowno = 0;
        int count = 0;
        int len = mat[0].length;
        for(int i = 0;i<mat.length;i++){
            int c = 0;
            for(int j=0;j<len;j++){
                if (mat[i][j] == 1) c++;
                if (c==len){
                    return new int[]{i,c};
                }
            }
            if(c>count) {
                count = c;
                rowno = i;
            }
        }
        return new int[]{rowno,count};
    }
}
