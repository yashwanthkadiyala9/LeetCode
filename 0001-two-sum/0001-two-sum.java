class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int a = 0;
       Map<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < n; i++) {
    map.put(nums[i], i);
}
int index = 0,j = 0;
        for(int i = 0;i<n-1;i++){
            a = target - nums[i];
            j++;
         if (map.containsKey(a) && map.get(a) != i) {
         index = map.get(a);            }
         if(index != 0)
         break;
        }
        int[] arr = new int[2];
        arr[0] = j-1;
        arr[1] = index;  
    return arr;
    }
}