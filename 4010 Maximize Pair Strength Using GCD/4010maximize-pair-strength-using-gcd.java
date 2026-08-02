class Solution {
    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long res = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                long n1 = nums[i];
                long n2 = nums[j];
                long gcd = gcd(n1,n2);
                long ans = n1 * n2 / (gcd * gcd);
                res = Math.max(res,ans);
            }
        }
        return res;
    }
    private long gcd(long a ,long b){
        while(b!=0){
            long temp = b;
            b= a % b;
            a = temp;
        }
        return a;
    }
}