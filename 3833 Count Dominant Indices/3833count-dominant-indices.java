class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int count = 0;
        int sum =0;
        for(int i =0;i<n;i++)
            {
                sum += nums[i];
            }
        int b4sum = 0;
        for(int i =0;i<n-1;i++)
            {
                int sumright = sum - b4sum - nums[i];
                int right = n- i -1;
                    if(nums[i] * right > sumright)
                    count++;
                b4sum += nums[i];
            }
        return count;
        
    }
}