class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;
        int[] depths = new int[n];
        int h = 0;
        int[] pathStack = new int[n];
        for(int i = 0;i<n;i++){
            if(depths[i] != 0){
                continue;
            }
            int curr = i;
            int pathSize = 0;
        while(curr != -1 && depths[curr] == 0){
            pathStack[pathSize++] = curr;
            curr = parent[curr];
        }
        int baseDepth = (curr == -1) ? 0 : depths[curr];
        for(int k = pathSize - 1;k>=0;k--){
            int node = pathStack[k];
            depths[node]  = baseDepth +(pathSize - k);
            if(depths[node] > h){
                h = depths[node];
            }
        }
        }
       
    long total = 0;
    for(int i = 0;i<n;i++){
    total += (long) nums[i] * (h - depths[i] + 1);
    }

   return total;
 }
       }
