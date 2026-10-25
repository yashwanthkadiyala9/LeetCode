class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int a = 0;
       Map<Integer, Integer> map = new HashMap<>();
       for(int i = 0;i<n;i++){
        a = target - nums[i];
        if(map.containsKey(a)){
            return new int[]{i,map.get(a)};
        }
        map.put(nums[i],i);
       }  
    return new int[]{};
    }
}