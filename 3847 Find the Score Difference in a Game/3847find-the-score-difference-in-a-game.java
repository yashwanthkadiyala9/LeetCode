class Solution {
    public int scoreDifference(int[] nums) {
        int n = nums.length;
        int odd=0;
        boolean first = true;
        int even = 0;
        for(int i =0;i<n;i++){
            if(nums[i]%2 != 0){
           first = !first;
            }
            if((i+1)%6 == 0){
                first =  !first;
                }
            if(first){
                odd+= nums[i];
            }
            else
                even+=nums[i];
                
            }
        
    return odd - even; 
    }
    }
