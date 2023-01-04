class Solution {
    public int minimumRounds(int[] tasks) {
        int n = 0;
        int no = -1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            if(!hm.containsKey(tasks[i])){
                hm.put(tasks[i],1);
            }
            else {
                 hm.put(tasks[i],hm.get(tasks[i])+1);
            }
        }       
        System.out.println(hm);
         for(Map.Entry m : hm.entrySet()){    
             no = (int) m.getValue();
             while(no>1){
                 if ( no%2 == 0 && no%3 == 0){
                     n=n+no/3;
                     no=0;
                 }
                 if ( no%2 == 0 && no%3 != 0){
                     n++;
                     no=no-2;
                 }
                 if ( no%2 != 0 && no%3 == 0){
                     n++;
                     no=no-3;
                 }
                 if ( no%2 != 0 && no%3 != 0){
                     if(no>3) {
                         n++;
                         no=no-3;
                     }
                     else if (no>2){
                         n++;
                         no=no-2;
                     }
                 }
             }
             if(no==1) return -1;
   }  
   return n;
    }
}
