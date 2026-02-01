class Solution {
    public int countMonobit(int n) {
        int cnt = 1;
        for(int i = 1; ;i++)
            {
              int  value = (1 << i) - 1;
                if(value > n)
                    break;
                cnt++;
            }
        return cnt;
        
    }
}