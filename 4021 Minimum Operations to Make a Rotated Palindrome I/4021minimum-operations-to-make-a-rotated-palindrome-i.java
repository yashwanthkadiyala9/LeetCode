class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            int c = i;
            for(int j = 0;j<n/2;j++){
                char y = s.charAt((j + i) % n);
                char z = s.charAt((n-1 - j +i) %n);
                int ff = Math.abs(y-z);
                int q = Math.min(ff,26 - ff);
                c += q;
            }
            ans = Math.min(c,ans);
        }
        return ans;
    }
}