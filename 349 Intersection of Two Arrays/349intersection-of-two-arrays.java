class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer>  s= new HashSet<>();
        Set <Integer> res = new HashSet<>();
        for(int x : nums1)
        {
            s.add(x);
        }
        for(int x : nums2)
        {
            if(s.contains(x))
            {
                res.add(x);
            }
        }
          int[] res1 = new int[res.size()];  
        int idx = 0;
        for (int val : res) { 
            res1[idx++] = val;
        }

        return res1;
    }
}

